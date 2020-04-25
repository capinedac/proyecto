/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.*;
import Control.*;
import Estructuras.*;

/**
 *
 * @author Santiago Mendoza
 */
public class AlquilarPanel extends javax.swing.JPanel {

    /**
     * Creates new form Alquilar
     */
    private AdministrarVehiculo admivehi;
    LinkedList listaVehiculosAlP;
    public AlquilarPanel() {
        initComponents();
        toyotaComboBox.setVisible(false);
        cheveroletComboBox.setVisible(false);
        alquilarBoton.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        marcaComboBox = new javax.swing.JComboBox<>();
        toyotaComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cheveroletComboBox = new javax.swing.JComboBox<>();
        next1 = new javax.swing.JButton();
        alquilarBoton = new javax.swing.JButton();

        jLabel1.setText("Alquilar");

        marcaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toyota", "Cheverolet", "Nissan", "Kia", " " }));
        marcaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaComboBoxActionPerformed(evt);
            }
        });

        toyotaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prado", "Runner" }));

        jLabel2.setText("Marca");

        jLabel3.setText("Referencia");

        cheveroletComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seal", "Spark" }));

        next1.setText("->");
        next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next1ActionPerformed(evt);
            }
        });

        alquilarBoton.setText("Alquilar");
        alquilarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alquilarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(marcaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(next1))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cheveroletComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(toyotaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(alquilarBoton)))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(next1)
                            .addComponent(toyotaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alquilarBoton))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(marcaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)
                        .addComponent(cheveroletComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void setAdministrarVehiculo(AdministrarVehiculo adv){
        this.admivehi=adv;
    }
    public void setListaVehiculosAlP(LinkedList lista){
        this.listaVehiculosAlP= lista;
    }
    
    private void marcaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaComboBoxActionPerformed

    private void next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next1ActionPerformed
        // TODO add your handling code here:
        Queue<Vehiculo> colaVehiculosMarca= new Queue<Vehiculo>();
        int sizeInstante=admivehi.size();
        System.out.println(sizeInstante);
        Nodo<Vehiculo> vehiculoSentinela=admivehi.listaDeVehiculos.top;
        
        for(int i=0;i<sizeInstante;i++){
            System.out.println("Hola");
            if(vehiculoSentinela.key.getMarca().equals(this.marcaComboBox.getSelectedItem().toString())){
                colaVehiculosMarca.enqueue(vehiculoSentinela.key);
            }
            vehiculoSentinela=vehiculoSentinela.next;
            
        }
        
        if(this.marcaComboBox.getSelectedItem().toString().equals("Toyota")){
            
            //while()
            
            toyotaComboBox.setVisible(true);
            cheveroletComboBox.setVisible(false);
        }
        if(this.marcaComboBox.getSelectedItem().toString().equals("Cheverolet")){
            cheveroletComboBox.setVisible(true);
            toyotaComboBox.setVisible(false);
        }
        alquilarBoton.setVisible(true);
    }//GEN-LAST:event_next1ActionPerformed

    private void alquilarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alquilarBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alquilarBotonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alquilarBoton;
    private javax.swing.JComboBox<String> cheveroletComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> marcaComboBox;
    private javax.swing.JButton next1;
    private javax.swing.JComboBox<String> toyotaComboBox;
    // End of variables declaration//GEN-END:variables
}
