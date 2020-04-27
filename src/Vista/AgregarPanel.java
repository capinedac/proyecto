/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.AdministrarVehiculo;
import Estructuras.LinkedList;
import Modelo.Vehiculo;
import static Vista.Ingresar.princi;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago Mendoza
 */
public class AgregarPanel extends javax.swing.JPanel {

    /**
     * Creates new form AgregarPanel
     */ 
    public static AdministrarVehiculo admiVehi;
    public LinkedList<Vehiculo> lista = Ingresar.listaVehiculos;
    private AdministrarVehiculo admivehi;
    private int size;
    
    public AgregarPanel() {
        initComponents();
    }
    public void setNull(){
        placaField.setText(null);
        kilomField.setText(null);
        yearField.setText(null);
        marcaField.setText(null);
        referenciaField.setText(null);
        cilindField.setText(null);
        puestosField.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void setAdministrarVehiculo(AdministrarVehiculo av){
        this.admivehi=av;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        marcaField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        puestosField = new javax.swing.JTextField();
        placaField = new javax.swing.JTextField();
        kilomField = new javax.swing.JTextField();
        referenciaField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        yearField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cilindField = new javax.swing.JTextField();

        jLabel1.setText("Agregar");

        marcaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca");

        puestosField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puestosFieldActionPerformed(evt);
            }
        });

        placaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaFieldActionPerformed(evt);
            }
        });

        kilomField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kilomFieldActionPerformed(evt);
            }
        });

        referenciaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciaFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Puestos");

        jLabel5.setText("Placa");

        jLabel6.setText("Kilometraje");

        jLabel7.setText("Referencia");

        jLabel8.setText("Año");

        yearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFieldActionPerformed(evt);
            }
        });

        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Cilindraje");

        cilindField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cilindFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(cilindField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kilomField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addComponent(marcaField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(puestosField)
                                    .addComponent(placaField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27)
                                .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(referenciaField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(puestosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(referenciaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(placaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kilomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cilindField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void marcaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaFieldActionPerformed

    private void puestosFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestosFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puestosFieldActionPerformed

    private void placaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placaFieldActionPerformed

    private void kilomFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kilomFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kilomFieldActionPerformed

    private void referenciaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciaFieldActionPerformed

    private void yearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String placa = placaField.getText();
            Float kilom = Float.parseFloat(kilomField.getText());
            int year = Integer.parseInt(yearField.getText());
            String marca = marcaField.getText();
            String ref = referenciaField.getText();
            int cilind = Integer.parseInt(cilindField.getText());
            int puestos = Integer.parseInt(puestosField.getText());
            Vehiculo vehiculo = new Vehiculo(kilom,year,marca,ref,cilind,placa,puestos);
            //lista.pushBack(vehiculo);
            size=admivehi.size();
            admivehi.agregarVehiculo(vehiculo);
            //admiVehi.agregarVehiculo(vehiculo);
            
            
            //lista.pushBack(vehiculo);
            //princi.admivehi.agregarVehiculo(vehiculo);
            //Ingresar.princi.setAdministrarVehiculos(admiVehi);
            if(admivehi.size() == size){
                JOptionPane.showMessageDialog(this,"Error al agregar vehículo");
            }else{
                JOptionPane.showMessageDialog(this,"Vehículo agregado correctamente");
                //Ingresar.listaVehiculos = lista;
                //princi.setListaVehiculos(lista);
                //princi.setAdministrarVehiculos(admiVehi);
                //Ingresar.admivehi = admiVehi;
                setNull();
            }
         
        }    
         catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,"Error al agregar vehículo");
        }
        //System.out.println(admiVehi.size());
        System.out.println(lista.size());
        System.out.println(lista.topFront().getMarca());
        System.out.println(lista.topBack().getMarca());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cilindFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cilindFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cilindFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cilindField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kilomField;
    private javax.swing.JTextField marcaField;
    private javax.swing.JTextField placaField;
    private javax.swing.JTextField puestosField;
    private javax.swing.JTextField referenciaField;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables
}
