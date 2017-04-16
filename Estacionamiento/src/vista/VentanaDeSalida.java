package vista;

import controlador.Controlador;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class VentanaDeSalida extends javax.swing.JDialog {
    private int x;
    
    public VentanaDeSalida(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.responsable.setText("");
        this.aceptar.setEnabled(false);
    }

    controlador.Controlador c = new Controlador();

    public JRadioButton getcAceite() {
        return cAceite;
    }

    public void setcAceite(JRadioButton cAceite) {
        this.cAceite = cAceite;
    }

    public JRadioButton getcAire() {
        return cAire;
    }

    public void setcAire(JRadioButton cAire) {
        this.cAire = cAire;
    }

    public JRadioButton getcCombustible() {
        return cCombustible;
    }

    public void setcCombustible(JRadioButton cCombustible) {
        this.cCombustible = cCombustible;
    }

    public JTextField getDominio() {
        return dominio;
    }

    public void setDominio(JTextField dominio) {
        this.dominio = dominio;
    }

    public JRadioButton getLavado() {
        return lavado;
    }

    public void setLavado(JRadioButton lavado) {
        this.lavado = lavado;
    }

    public JLabel getResponsable() {
        return responsable;
    }

    public void setResponsable(JLabel responsable) {
        this.responsable = responsable;
    }
    
    public JToggleButton getAceptar(){
        return aceptar;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        responsable = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lavado = new javax.swing.JRadioButton();
        cAire = new javax.swing.JRadioButton();
        cCombustible = new javax.swing.JRadioButton();
        cAceite = new javax.swing.JRadioButton();
        aceptar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        cancelar = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        dominio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("RESPONSABLE:");

        responsable.setText("jLabel4");

        jLabel4.setText("SELECCIONE LOS SERVICIOS REALIZADOS:");

        lavado.setText("Lavado");

        cAire.setText("Cambio de filtro de aire");

        cCombustible.setText("Cambio de filtro de combustible");

        cAceite.setText("Cambio de aceite");

        aceptar.setText("ACEPTAR");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("EGRESO DE VEHICULO");

        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("DOMINIO:");

        dominio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dominioKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lavado))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cAire))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cCombustible))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cAceite))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(aceptar)
                        .addGap(43, 43, 43)
                        .addComponent(cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(responsable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dominio, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(responsable))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lavado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cAire)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cCombustible)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cAceite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(cancelar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dominioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dominioKeyReleased
        x = c.buscarDominio(this);
    }//GEN-LAST:event_dominioKeyReleased

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        c.bajaDeVehiculo(this,x);
    }//GEN-LAST:event_aceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton aceptar;
    private javax.swing.JRadioButton cAceite;
    private javax.swing.JRadioButton cAire;
    private javax.swing.JRadioButton cCombustible;
    private javax.swing.JToggleButton cancelar;
    private javax.swing.JTextField dominio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton lavado;
    private javax.swing.JLabel responsable;
    // End of variables declaration//GEN-END:variables
}
