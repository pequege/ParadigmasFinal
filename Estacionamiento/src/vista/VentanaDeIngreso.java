/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author millo
 */
public class VentanaDeIngreso extends javax.swing.JDialog {
    controlador.Controlador c = new Controlador();
    public VentanaDeIngreso(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
								cilindrada.setEditable(false);
								puerta.setEditable(false);
								cabina.setEnabled(false);
    }

    public JButton getCancelar() {
        return cancelar;
    }

    public void setCancelar(JButton cancelar) {
        this.cancelar = cancelar;
    }

    public JButton getRegistrar() {
        return registrar;
    }

    public void setRegistrar(JButton registrar) {
        this.registrar = registrar;
    }

    
    public JRadioButton getServLava() {
        return servLava;
    }

    public void setServLava(JRadioButton servLava) {
        this.servLava = servLava;
    }

    public JRadioButton getServManteni() {
        return servManteni;
    }

    public void setServManteni(JRadioButton servManteni) {
        this.servManteni = servManteni;
    }

    
    public JComboBox<String> getCabina() {
        return cabina;
    }

    public void setCabina(JComboBox<String> cabina) {
        this.cabina = cabina;
    }

    public JTextField getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(JTextField cilindrada) {
						this.cilindrada = cilindrada;
    }

    public JLabel getDatoEspecifico() {
        return datoEspecifico;
    }

    public void setDatoEspecifico(JLabel datoEspecifico) {
        this.datoEspecifico = datoEspecifico;
    }

    public JTextField getDominio() {
        return dominio;
    }

    public void setDominio(JTextField dominio) {
        this.dominio = dominio;
    }

    public JComboBox<String> getLugarEstacionado() {
        return lugarEstacionado;
    }

    public void setLugarEstacionado(JComboBox<String> lugarEstacionado) {
        this.lugarEstacionado = lugarEstacionado;
    }

    public JTextField getPuerta() {
        return puerta;
    }

    public void setPuerta(JTextField puerta) {
        this.puerta = puerta;
    }

    public JTextField getResponsable() {
        return responsable;
    }

				public JLabel getjLabelDominio() {
						return jLabelDominio;
				}

				public JLabel getjLabelResponsable() {
						return jLabelResponsable;
				}
				
    public void setResponsable(JTextField responsable) {
        this.responsable = responsable;
    }

    public JComboBox<String> getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    public void setTipoDeVehiculo(JComboBox<String> tipoDeVehiculo) {
        this.tipoDeVehiculo = tipoDeVehiculo;
    }

		@Override
		public String toString() {
				return "VentanaDeIngreso{" + "dominio=" + dominio + ", responsable=" + responsable + '}';
		}
				
				
       
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    dominio = new javax.swing.JTextField();
    registrar = new javax.swing.JButton();
    jLabelResponsable = new javax.swing.JLabel();
    datoEspecifico = new javax.swing.JLabel();
    responsable = new javax.swing.JTextField();
    puerta = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    cilindrada = new javax.swing.JTextField();
    tipoDeVehiculo = new javax.swing.JComboBox<>();
    jLabel5 = new javax.swing.JLabel();
    cabina = new javax.swing.JComboBox<>();
    servManteni = new javax.swing.JRadioButton();
    jLabel7 = new javax.swing.JLabel();
    servLava = new javax.swing.JRadioButton();
    jLabel8 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    lugarEstacionado = new javax.swing.JComboBox<>();
    jLabelDominio = new javax.swing.JLabel();
    cancelar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    registrar.setText("REGISTRAR");
    registrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        registrarActionPerformed(evt);
      }
    });

    jLabelResponsable.setText("RESPONSABLE:");

    datoEspecifico.setText("DATO ESPECIFICO:");

    jLabel4.setText("TIPO DE VEHICULO");

    cilindrada.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cilindradaActionPerformed(evt);
      }
    });

    tipoDeVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "AUTOMOVIL", "MOTOCICLETA", "CAMIONETA" }));
    tipoDeVehiculo.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        tipoDeVehiculoItemStateChanged(evt);
      }
    });
    tipoDeVehiculo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tipoDeVehiculoActionPerformed(evt);
      }
    });

    jLabel5.setText("SELECCIONE LOS SERVICIOS ADICIONALES:");

    cabina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIMPLE", "DOBLE" }));

    servManteni.setText("Servicio de Mantenimiento");

    jLabel7.setText("cilindradas");

    servLava.setText("Servicio de Lavado");

    jLabel8.setText("cant. puertas");

    jLabel6.setText("LUGAR:");

    jLabel9.setText("tipo cabina");

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel1.setText("REGISTRO DE INGRESO DE VEHICULO");

    lugarEstacionado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
    lugarEstacionado.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        lugarEstacionadoFocusGained(evt);
      }
    });

    jLabelDominio.setText("DOMINIO:");

    cancelar.setText("CANCELAR");
    cancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cancelarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(89, 89, 89))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(servLava)
          .addComponent(jLabel1)
          .addComponent(servManteni)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel6)
            .addGap(18, 18, 18)
            .addComponent(lugarEstacionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jLabel5)
          .addComponent(datoEspecifico)
          .addGroup(layout.createSequentialGroup()
            .addComponent(cilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(puerta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cabina, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
              .addComponent(jLabel4)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(tipoDeVehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
              .addComponent(jLabelResponsable)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(responsable))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
              .addComponent(jLabelDominio)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(dominio, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(jLabel7)
            .addGap(52, 52, 52)
            .addComponent(jLabel8)
            .addGap(42, 42, 42)
            .addComponent(jLabel9)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelDominio)
          .addComponent(dominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabelResponsable)
          .addComponent(responsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(lugarEstacionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(11, 11, 11)
            .addComponent(tipoDeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel4)))
        .addGap(18, 18, 18)
        .addComponent(datoEspecifico)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(jLabel8)
          .addComponent(jLabel9))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(puerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cabina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel5)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(servManteni)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(servLava)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
          .addComponent(registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void lugarEstacionadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lugarEstacionadoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_lugarEstacionadoFocusGained

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void tipoDeVehiculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoDeVehiculoItemStateChanged
        c.HabilitarCampoEspecifico(this);
    }//GEN-LAST:event_tipoDeVehiculoItemStateChanged

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
						c.validaciones(this);
						c.RegistrarVehiculo(this);
        
    }//GEN-LAST:event_registrarActionPerformed

  private void tipoDeVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDeVehiculoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tipoDeVehiculoActionPerformed

  private void cilindradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cilindradaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cilindradaActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> cabina;
  private javax.swing.JButton cancelar;
  private javax.swing.JTextField cilindrada;
  private javax.swing.JLabel datoEspecifico;
  private javax.swing.JTextField dominio;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JLabel jLabelDominio;
  private javax.swing.JLabel jLabelResponsable;
  private javax.swing.JComboBox<String> lugarEstacionado;
  private javax.swing.JTextField puerta;
  private javax.swing.JButton registrar;
  private javax.swing.JTextField responsable;
  private javax.swing.JRadioButton servLava;
  private javax.swing.JRadioButton servManteni;
  private javax.swing.JComboBox<String> tipoDeVehiculo;
  // End of variables declaration//GEN-END:variables
}
