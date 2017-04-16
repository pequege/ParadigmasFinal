package controlador;

import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Auto;
import modelo.Camioneta;
import modelo.Estacionamiento;
import modelo.Estadia;
import modelo.Lavado;
import modelo.Lugar;
import modelo.Mantenimiento;
import modelo.Moto;
import modelo.Servicio;
import modelo.Tarifa;
import vista.VentanaDeIngreso;
import vista.VentanaDeListado;
import vista.VentanaDeSalida;
import vista.VentanaDeTarifa;
import vista.VentanaPrincipal;

public class Controlador {
    private static VentanaPrincipal vp = new VentanaPrincipal();
    private static Estacionamiento e = new Estacionamiento();
    private DefaultTableModel datos = new DefaultTableModel();
    private Lavado l = new Lavado(false);
    private Mantenimiento mant = new Mantenimiento(false);
    private Lugar lugar = new Lugar();
    private Estadia estadia = new Estadia();
				JFrame ventanaModal = new JFrame();

		public JFrame getVentanaModal() {
				return ventanaModal;
		}

		public void setVentanaModal(JFrame ventanaModal) {
				this.ventanaModal = ventanaModal;
		}

    public void IniciarPrograma(){
        vp.setVisible(true);
    }

    public void IngresarVehiculo() {
        VentanaDeIngreso vi = new VentanaDeIngreso(this.vp, true);
        vi.setVisible(true);
    }

    public void HabilitarCampoEspecifico(VentanaDeIngreso aThis) {
								aThis.getCilindrada().setEditable(false);
								aThis.getPuerta().setEditable(false);
								aThis.getCabina().setEnabled(false);
        switch(aThis.getTipoDeVehiculo().getSelectedItem().toString()){
            case "AUTOMOVIL": aThis.getPuerta().setEditable(true);
            break;
            case "MOTOCICLETA": aThis.getCilindrada().setEditable(true);
            break;
            case  "CAMIONETA": aThis.getCabina().setEnabled(true);
            break;
            default: break;
        }
    }

    public void RegistrarVehiculo(VentanaDeIngreso aThis) {
        Tarifa t = new Tarifa();
        Servicio s = new Servicio();
        String fecha = new SimpleDateFormat("dd/MM/yy HH:mm:ss").format(new java.util.Date());
        switch(aThis.getTipoDeVehiculo().getSelectedItem().toString()){
            case "AUTOMOVIL": Auto a = new Auto();
            a.setPatente(aThis.getDominio().getText());
            a.setResponsable(aThis.getResponsable().getText());
            a.setPuertas(Integer.parseInt(aThis.getPuerta().getText()));
            if(aThis.getServLava().isSelected()){
                l.setEstado(true);
            }
            if(aThis.getServManteni().isSelected()){
                mant.setEstado(true);
            }
            s.setL(l);
            s.setM(mant);
            lugar.setNumero(Integer.parseInt(aThis.getLugarEstacionado().getSelectedItem().toString()));
            lugar.setEs_techado(this.Es_Techado(lugar.getNumero()));
            lugar.setEstado(false);
            estadia.setLugares(lugar);
            estadia.setIngreso(fecha);
            s.setE(estadia);
            a.setServicio(s);
            t.setVehiculo(a);
            e.AgregarTarifa(t);
            aThis.setVisible(false);
            break;
            case "MOTOCICLETA": Moto m = new Moto();
            m.setPatente(aThis.getDominio().getText());
            m.setResponsable(aThis.getResponsable().getText());
            m.setCilindrado(Integer.parseInt(aThis.getCilindrada().getText()));
            if(aThis.getServLava().isSelected()){
                l.setEstado(true);
            }
            if(aThis.getServManteni().isSelected()){
                mant.setEstado(true);
            }
            s.setL(l);
            s.setM(mant);
            lugar.setNumero(Integer.parseInt(aThis.getLugarEstacionado().getSelectedItem().toString()));
            lugar.setEs_techado(this.Es_Techado(lugar.getNumero()));
            lugar.setEstado(false);
            estadia.setLugares(lugar);
            estadia.setIngreso(fecha);
            s.setE(estadia);
            m.setServicio(s);
            t.setVehiculo(m);
            e.AgregarTarifa(t);
            aThis.setVisible(false);
            break;
            case  "CAMIONETA": Camioneta c = new Camioneta();
            c.setPatente(aThis.getDominio().getText());
            c.setResponsable(aThis.getResponsable().getText());
            c.setCabina(aThis.getCabina().getSelectedItem().toString());
            if(aThis.getServLava().isSelected()){
                l.setEstado(true);
            }
            if(aThis.getServManteni().isSelected()){
                mant.setEstado(true);
            }
            s.setL(l);
            s.setM(mant);
            lugar.setNumero(Integer.parseInt(aThis.getLugarEstacionado().getSelectedItem().toString()));
            lugar.setEs_techado(this.Es_Techado(lugar.getNumero()));
            lugar.setEstado(false);
            estadia.setLugares(lugar);
            estadia.setIngreso(fecha);
            s.setE(estadia);
            c.setServicio(s);
            t.setVehiculo(c);
            e.AgregarTarifa(t);
            aThis.setVisible(false);
            break;
            default: break;
        }
    }
    
    public boolean Es_Techado(int x){
        if(x<=10){
            return true;
        }else{
            return false;
        }
    }

    public void ListarVehiculos(VentanaPrincipal vp) {
        VentanaDeListado vl = new VentanaDeListado(vp,true);
        datos.setColumnCount(0);
        datos.setRowCount(0);
        datos.addColumn("Responsable");
        datos.addColumn("Dominio");
        datos.addColumn("Dato especifico");
        datos.addColumn("Lugar");
        datos.addColumn("Lavado");
        datos.addColumn("Mantenimieto");
        datos.addColumn("Hora Ingreso");
        for(Tarifa tar : e.getTarifas() ){
        Object[] fila = new Object[7];
        fila[0] = tar.getVehiculo().getResponsable();
        fila[1] = tar.getVehiculo().getPatente();
        fila[2] = tar.getVehiculo().getEspecifico();
        fila[3] = tar.getVehiculo().getServicio().getE().getLugares().getNumero();
        fila[4] = tar.getVehiculo().getServicio().getL().isEstado();
        fila[5] = tar.getVehiculo().getServicio().getM().isEstado();
        fila[6] = tar.getVehiculo().getServicio().getE().getIngreso();
        datos.addRow(fila);
        }
        vl.getjTable1().setModel(datos);
        vl.setVisible(true);
    }

    public int buscarDominio(VentanaDeSalida aThis) {
        aThis.getDominio().setBackground(Color.red);
            for(int i = 0 ; i<e.getTarifas().size(); i++){
                if(aThis.getDominio().getText().equals(e.getTarifas().get(i).getVehiculo().getPatente())){
                    aThis.getDominio().setBackground(Color.green);
                    aThis.getResponsable().setText(e.getTarifas().get(i).getVehiculo().getResponsable());
                    aThis.getAceptar().setEnabled(true);
                    return i;
                }
            }
        return -1; 
    }

    public void EgresoDeVehiculo() {
        VentanaDeSalida vs = new VentanaDeSalida(this.vp, true);
        vs.setVisible(true);
    }

    public void bajaDeVehiculo(VentanaDeSalida aThis,int pos) {
        VentanaDeTarifa vt = new VentanaDeTarifa(aThis, true);
        vt.getDominio().setText(e.getTarifas().get(pos).getVehiculo().getPatente());
        vt.getHoraIngreso().setText(e.getTarifas().get(pos).getVehiculo().getServicio().getE().getIngreso());
        e.EliminarTarifa(pos);
        vt.setVisible(true);
    }
				
				//Funcion para validar que un String solo tenga letras
				public boolean esLetra(String responsable) {
						char[] chars = responsable.toCharArray();
      for (char c : chars) {
								if(!Character.isLetter(c)) {
										return false;
								}
      }
      return true;
    }
				
				//Funcion para validar que un String solo tenga numeros
				public boolean esNumero(String a){
						String regex = "[0-9]+";
						return a.matches(regex);
				}
				
				//Funcion para validar que un String no esté vacía
				public boolean validarNoVacio(String a, JLabel b){
						if("".equals(a)){
								JOptionPane.showMessageDialog(ventanaModal, "Ingrese " + b.getText());
								return true;
						}else{
								return false;
						}
				}
						
				public void validaciones(VentanaDeIngreso aThis){
						validarNoVacio(aThis.getDominio().getText(), aThis.getjLabelDominio()); //valida que dominio no esté vacío
						validarNoVacio(aThis.getResponsable().getText(), aThis.getjLabelResponsable());//valida que responsable no esté vacío
						if(!esLetra(aThis.getResponsable().getText())){
								JOptionPane.showMessageDialog(ventanaModal, "NOMBRE DE RESPONSABLE no puede contener numeros");
						}
				}
}
