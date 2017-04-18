package controlador;

import java.awt.Color;
import java.util.Calendar;
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
import modelo.TipoDeVehiculo;
import vista.VentanaDeIngreso;
import vista.VentanaDeListado;
import vista.VentanaDeSalida;
import vista.VentanaDeTarifa;
import vista.VentanaPrincipal;

public class Controlador {
    private static final VentanaPrincipal vp = new VentanaPrincipal();
    private static Estacionamiento e = new Estacionamiento();
    private DefaultTableModel datos = new DefaultTableModel();
    private Lavado l = new Lavado(false);
    private Mantenimiento mant = new Mantenimiento(false);
    private Lugar lugar = new Lugar();
    private Estadia estadia = new Estadia();
    private JFrame ventanaModal = new JFrame();
    public JFrame getVentanaModal() {
        return ventanaModal;
    }
    public void setVentanaModal(JFrame ventanaModal) {
        this.ventanaModal = ventanaModal;
    }
    
    
    //Da inicio al programa con la ventana Principal.
    public void IniciarPrograma(){
        vp.setVisible(true);
    }
    
    
    //Crea la ventana de ingreso y la visibiliza.
    public void IngresarVehiculo() {
        VentanaDeIngreso vi = new VentanaDeIngreso(this.vp, true);
        vi.setVisible(true);
    }
    
    
    //Habilita en la ventana de igrenso el llenado y seleccion del campo especifico
    //impuesto por la municipalidad.
    public void HabilitarCampoEspecifico(VentanaDeIngreso aThis) {
        aThis.getCilindrada().setEditable(false);
        aThis.getPuerta().setEditable(false);
        aThis.getCabina().setEnabled(false);
        switch(aThis.getTipoDeVehiculo().getSelectedItem().toString()){
            case "-":
                aThis.getCilindrada().setEditable(false);
                aThis.getPuerta().setEditable(false);
                aThis.getCabina().setEnabled(false);
                break;
            case "AUTOMOVIL": aThis.getPuerta().setEditable(true);
            break;
            case "MOTOCICLETA": aThis.getCilindrada().setEditable(true);
            break;
            case  "CAMIONETA": aThis.getCabina().setEnabled(true);
            break;
            default: break;
        }
    }
    
    
    //Se agregan los vehiculos con sus respectivos servicios en el estacionamiento.
    public void RegistrarVehiculo(VentanaDeIngreso aThis) {
        Tarifa t = new Tarifa();                                                // Crea una nueva Tarifa.
        Servicio s = new Servicio();                                            // Crea un servicio.
        Calendar calendar = Calendar.getInstance();                             // Obtiene la hora del sistema
        int hora = calendar.getTime().getHours();                               // y la convierte en minutos.
        int fecha = hora * 60 + calendar.getTime().getMinutes();                // para calcular la diferencia con mayor facilidad.    
        switch(aThis.getTipoDeVehiculo().getSelectedItem().toString()){         // Consultam cual es el tipo de vehiculo.
            case "AUTOMOVIL": Auto a = new Auto();
												a.setPatente(aThis.getDominio().getText());
            a.setResponsable(aThis.getResponsable().getText());                 // Guarda el nombre.
            a.setPuertas(Integer.parseInt(aThis.getPuerta().getText()));        // Guarda el dato especifico
            a.setX(1);                                                          // Guarda el identificador para autos
            if(aThis.getServLava().isSelected()){                               // Confirmacion de servicio de lavado
                l.setEstado(true);
            }
            if(aThis.getServManteni().isSelected()){                            // Confirmacion de servicio de mantenimiento
                mant.setEstado(true);
            }
            s.setL(l);
            s.setM(mant);
            lugar.setNumero(Integer.parseInt(aThis.getLugarEstacionado().getSelectedItem().toString()));
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
            m.setX(2);
            if(aThis.getServLava().isSelected()){
                l.setEstado(true);
            }
            if(aThis.getServManteni().isSelected()){
                mant.setEstado(true);
            }
            s.setL(l);
            s.setM(mant);
            lugar.setNumero(Integer.parseInt(aThis.getLugarEstacionado().getSelectedItem().toString()));
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
            c.setX(3);
            if(aThis.getServLava().isSelected()){
                l.setEstado(true);
            }
            if(aThis.getServManteni().isSelected()){
                mant.setEstado(true);
            }
            s.setL(l);
            s.setM(mant);
            lugar.setNumero(Integer.parseInt(aThis.getLugarEstacionado().getSelectedItem().toString()));
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
    

    //Muestra el listado de vehiculos que se encuentran en el estacionamiento.
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
        fila[6] = convertirHora(tar.getVehiculo().getServicio().getE().getIngreso());
        datos.addRow(fila);
        }
        vl.getjTable1().setModel(datos);
        vl.setVisible(true);
    }
    
    
    // Convierte la hora guardad en minutos, en un String del modo HH:mm
    private String convertirHora(int x){
        if ( (x % 60) < 10){
            return String.valueOf(x/60 + ":0" + x%60 );
        }else{
        return String.valueOf(x/60 + ":" + x%60);}
    }
    
    
    // Busca el auto en el estacionamiento en tiempo real a medida que se teclea,
    // poniendo el casillero en verde cuando se encuentre el dominio buscado,
    // retornando la posicion en la que se encuentra.
    public int buscarDominio(VentanaDeSalida aThis) {
        if(aThis.getDominio().equals("")){
            aThis.getDominio().setBackground(Color.WHITE);
        }else{
        aThis.getDominio().setBackground(Color.red);
            for(int i = 0 ; i<e.getTarifas().size(); i++){
                if(aThis.getDominio().getText().equals(e.getTarifas().get(i).getVehiculo().getPatente())){
                    aThis.getDominio().setBackground(Color.green);
                    aThis.getResponsable().setText(e.getTarifas().get(i).getVehiculo().getResponsable());
                    aThis.getAceptar().setEnabled(true);
                    if(e.getTarifas().get(i).getVehiculo().getServicio().getL().isEstado()){
                        aThis.getLavado().setEnabled(true);
                    }
                    if(e.getTarifas().get(i).getVehiculo().getServicio().getM().isEstado()){
                        aThis.getcAire().setEnabled(true);
                        aThis.getcCombustible().setEnabled(true);
                    }
                    return i;
                }
            }
        }
        return -1; 
    }
    
    
    // Crea la ventana para dar la baja a los vehiculos.
    public void EgresoDeVehiculo() {
        VentanaDeSalida vs = new VentanaDeSalida(this.vp, true);
        vs.setVisible(true);
    }

    
    // Crea una boleta con el importe que debera pagar el vehiculo,
    // de acuerdo a los servicios que se le hayan realizado,
    // y al tiempo que haya estado.
    public void bajaDeVehiculo(VentanaDeSalida aThis,int pos) {
        Calendar calendar = Calendar.getInstance();
        int hora = calendar.getTime().getHours();
        int fecha = hora * 60 + calendar.getTime().getMinutes();
        int n = e.getTarifas().get(pos).getVehiculo().getServicio().getE().getIngreso();        // Recupera la hora de ingreso
        e.getTarifas().get(pos).getVehiculo().getServicio().getE().setEgreso(fecha);            // Guarda la hora de egreso
        int m = e.getTarifas().get(pos).getVehiculo().getServicio().getE().getEgreso();         // Recupera la hora de egreso
        int x = calcularTarifaEstadia(pos);                                                     // Recupera la tarifa de estadia
        int y = 0;
        int z = 0;
        if(aThis.getLavado().isSelected()){                                                     // Recupera el importe de lavado
            y = calcularLavado(pos);                                                            // si es que se confirmo
        }
        if(e.getTarifas().get(pos).getVehiculo().getServicio().getM().isEstado()){              // Recupera el mantenimiento
            z = calcularMantenimiento(aThis);                                                   // si es que se confirmo
        }
        
        VentanaDeTarifa vt = new VentanaDeTarifa(aThis, true);                                  // Crea la ventana con la boleta a
        vt.getDominio().setText(e.getTarifas().get(pos).getVehiculo().getPatente());            // a pagar
        vt.getHoraIngreso().setText(convertirHora(n));
        vt.getHoraEgreso().setText(convertirHora(m));
        vt.getPrecioPorEstacionar().setText(String.valueOf(x));
        vt.getLavado().setText(String.valueOf(y));
        vt.getServicioMantenimiento().setText(String.valueOf(z));
        vt.getTotalAPagar().setText(String.valueOf(x + y + z));
        e.EliminarTarifa(pos);
        vt.setVisible(true);
    }
    
    
    //Calcula el mantenimiento realizado
    
    private int calcularMantenimiento(VentanaDeSalida vs){
        int x = 550;
        
        if(vs.getcAire().isSelected()){
            x = x + 100;
        }
        if(vs.getcCombustible().isSelected()){
            x = x + 200;
        }
        
        return x;
    }
    
    
    // Determina el importe del lavado.
    private int calcularLavado(int pos){
        int tarifa;
        
        switch (e.getTarifas().get(pos).getVehiculo().getX()){
            case 1 : tarifa = TipoDeVehiculo.AUTOMOVIL.getPrecioLavado();
            break;
            case 2 : tarifa = TipoDeVehiculo.MOTOCICLETA.getPrecioLavado();
            break;
            case 3 : tarifa = TipoDeVehiculo.CAMIONETA.getPrecioLavado();
            break;
            default: tarifa = 0;
            break;
        }
        return tarifa;
    }
    
    
    // Determina el importe por estadia, luego de un previo calculo segun el tipo de vehiculo.
    private int calcularTarifaEstadia(int pos){
        int tarifa;
        
        int cantidadHorasEnMinutos = e.getTarifas().get(pos).getVehiculo().getServicio().getE().getEgreso()- // Calculo en minutos
                            e.getTarifas().get(pos).getVehiculo().getServicio().getE().getIngreso();         // de la estadia.
        
        switch (e.getTarifas().get(pos).getVehiculo().getX()){                                               // Identificador.
            case 1 : if(cantidadHorasEnMinutos/60 == 0){                                                     // Calculo parte entera   
                tarifa = TipoDeVehiculo.AUTOMOVIL.getPrecioEstadia();                                        // si no completo la hora.
            }else{                                                                                           // Completo la hora.
                if(cantidadHorasEnMinutos % 60 > 10){                                                        // Supero la tolerancia.
                    tarifa = TipoDeVehiculo.AUTOMOVIL.getPrecioEstadia() * (cantidadHorasEnMinutos /60 + 1);
                }else{                                                                                       // No supero la tolerancia.
                    tarifa = TipoDeVehiculo.AUTOMOVIL.getPrecioEstadia() * (cantidadHorasEnMinutos / 60);
                }
            }
            break;
            case 2 : if(cantidadHorasEnMinutos/60 == 0){
                tarifa = TipoDeVehiculo.MOTOCICLETA.getPrecioEstadia();
            }else{
                if(cantidadHorasEnMinutos % 60 > 10){
                    tarifa = TipoDeVehiculo.MOTOCICLETA.getPrecioEstadia() * (cantidadHorasEnMinutos /60 + 1);
                }else{
                    tarifa = TipoDeVehiculo.MOTOCICLETA.getPrecioEstadia() * (cantidadHorasEnMinutos / 60);
                }
            }
            break;
            case 3 : if(cantidadHorasEnMinutos/60 == 0){
                tarifa = TipoDeVehiculo.CAMIONETA.getPrecioEstadia();
            }else{
                if(cantidadHorasEnMinutos % 60 > 10){
                    tarifa = TipoDeVehiculo.CAMIONETA.getPrecioEstadia() * (cantidadHorasEnMinutos /60 + 1);
                }else{
                    tarifa = TipoDeVehiculo.CAMIONETA.getPrecioEstadia() * (cantidadHorasEnMinutos / 60);
                }
            }
            break;
            default: tarifa = 0;
            break;
        }
        return tarifa;
    }
    
    
    
//Funcion para validar que un String solo tenga letras
    public boolean esLetra(String a, JLabel b) {
        char[] chars = a.toCharArray();
        for (char c : chars) {
            if(!Character.isLetter(c)) {
																JOptionPane.showMessageDialog(ventanaModal, b.getText() + " no puede contener numeros");
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
				
				//Valida si un array está vacío
				public boolean estaVacio(){
						return e.getTarifas().isEmpty();
				}

				//Valida que una patente tenga el formato ASD123
    public boolean validarDominio(String a, JLabel jl){
						if(a.length() == 6){
								String b = a.substring(0, 3);
								String c = a.substring(3);
								return esLetra(b, jl) && esNumero(c);
						}else
								{
										JOptionPane.showMessageDialog(ventanaModal, "Formato de patente incorrecto");
										return false;
								}
				}
    
//Funcion para validar que un String no esté vacía
//Recibe un String y un JLabel
//El JLabel es para obtener el nombre del campo que está vacío
    public boolean validarNoVacio(String a, JLabel b){
        if("".equals(a)){
            JOptionPane.showMessageDialog(ventanaModal, "Ingrese " + b.getText());
            return true;
        }else{
            return false;
        }
    }
    
    
    
				/*public void validaciones(VentanaDeIngreso aThis){
				validarDominio(aThis.getDominio().getText(), aThis.getjLabelDominio());
				validarNoVacio(aThis.getDominio().getText(), aThis.getjLabelDominio()); //valida que dominio no esté vacío
				validarNoVacio(aThis.getResponsable().getText(), aThis.getjLabelResponsable()); //valida que responsable no esté vacío
				esLetra(aThis.getResponsable().getText(), aThis.getjLabelResponsable()); //Valida que el nombre de responsable no tenga numeros
				//valida que los datos especificos de los vehiculos no estén vacíos y que no contengan letras
				switch(aThis.getTipoDeVehiculo().getSelectedItem().toString()){
				case "AUTOMOVIL":
				validarNoVacio(aThis.getPuerta().getText(), aThis.getjLabelCantidadPuertas());
				if(!esNumero(aThis.getPuerta().getText())){
				JOptionPane.showMessageDialog(ventanaModal, "CANTIDAD DE PUERTAS sólo debe contener numeros");
				}
				break;
				case "MOTOCICLETA":
				validarNoVacio(aThis.getCilindrada().getText(), aThis.getjLabelCilindrada());
				if(!esNumero(aThis.getCilindrada().getText())){
				JOptionPane.showMessageDialog(ventanaModal, "CILINDRADA sólo debe contener numeros");}
				break;
				default: break;
				}
				}*/
}