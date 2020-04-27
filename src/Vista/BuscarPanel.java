/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.AdministrarVehiculo;
import Estructuras.*;
import Modelo.Vehiculo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Santiago Mendoza
 */
public class BuscarPanel extends javax.swing.JPanel {

    private AdministrarVehiculo admivehi;
    DefaultTableModel modelo;
    String tipo=null;
    
    
    public Stack<Vehiculo> Buscar(String tipo, String valor, LinkedList<Vehiculo> listaVehic){
        Stack<Vehiculo> pilaVehiculos = new Stack<>();
        
        switch(tipo){
            case "placa":
                /*
                for(int i=1; i<= listaVehic.size(); i++){
                    Vehiculo vehiculo = listaVehic.valueAtPosition(i);
                    if(vehiculo.getPlaca().toLowerCase().equals(valor.toLowerCase())){
                        pilaVehiculos.push(vehiculo);
                    }
                }
                */
                while(!listaVehic.isEmpty()){
                    Vehiculo vehiculo = listaVehic.popFront();
                    if(vehiculo.getPlaca().toLowerCase().equals(valor.toLowerCase())){
                        pilaVehiculos.push(vehiculo);
                    }
                }   
                
                break;
            case "marca":
                /*
                for(int i=1; i<= listaVehic.size(); i++){
                    Vehiculo vehiculo = listaVehic.valueAtPosition(i);
                    if(vehiculo.getMarca().toLowerCase().equals(valor.toLowerCase())){
                        pilaVehiculos.push(vehiculo);
                    }
                }
                */
                while(!listaVehic.isEmpty()){
                    Vehiculo vehiculo = listaVehic.popFront();
                    if(vehiculo.getMarca().toLowerCase().equals(valor.toLowerCase())){
                        pilaVehiculos.push(vehiculo);
                    }
                }
                
                break;
            case "modelo":
                /*
                for(int i=1; i<= listaVehic.size(); i++){
                    Vehiculo vehiculo = listaVehic.valueAtPosition(i);
                    if(vehiculo.getReferencia().toLowerCase().equals(valor.toLowerCase())){
                        pilaVehiculos.push(vehiculo);
                    }
                }
                */
                while(!listaVehic.isEmpty()){
                    Vehiculo vehiculo = listaVehic.popFront();
                    if(vehiculo.getReferencia().toLowerCase().equals(valor.toLowerCase())){
                        pilaVehiculos.push(vehiculo);
                    }
                }
                
                break;
            }
        return pilaVehiculos;
    }
   
    public BuscarPanel() {
        initComponents();
        this.jTable1.setVisible(false);
        modelo = new DefaultTableModel();
        modelo.addColumn("Placa");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Año");
        modelo.addColumn("Kilom.");
        modelo.addColumn("Cilindraje");
        modelo.addColumn("Puestos");
        modelo.addColumn("Alquilado");
        this.jTable1.setModel(modelo);
        
    }
    public void setAdministrarVehiculo(AdministrarVehiculo av){
        this.admivehi=av;
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
        jCheckBoxPlaca = new javax.swing.JCheckBox();
        jCheckBoxMarca = new javax.swing.JCheckBox();
        jCheckBoxModelo = new javax.swing.JCheckBox();
        jTextFieldValor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("Buscar");

        jCheckBoxPlaca.setText("Placa");
        jCheckBoxPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPlacaActionPerformed(evt);
            }
        });

        jCheckBoxMarca.setText("Marca");
        jCheckBoxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMarcaActionPerformed(evt);
            }
        });

        jCheckBoxModelo.setText("Modelo");
        jCheckBoxModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxModeloActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBoxPlaca)
                        .addGap(80, 80, 80)
                        .addComponent(jCheckBoxMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBoxModelo)))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxPlaca)
                    .addComponent(jCheckBoxMarca)
                    .addComponent(jCheckBoxModelo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMarcaActionPerformed
        // TODO add your handling code here:
        if (jCheckBoxMarca.isSelected()){
            tipo = "marca";
            jCheckBoxPlaca.setEnabled(false);
            jCheckBoxModelo.setEnabled(false);
            
        }else{
            tipo = null;
            jCheckBoxPlaca.setEnabled(true);
            jCheckBoxModelo.setEnabled(true);
        }
        
    }//GEN-LAST:event_jCheckBoxMarcaActionPerformed

    private void jCheckBoxModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxModeloActionPerformed
        // TODO add your handling code here:
        if (jCheckBoxModelo.isSelected()){
            tipo = "modelo";
            jCheckBoxMarca.setEnabled(false);
            jCheckBoxPlaca.setEnabled(false);
            
        }else{
            tipo = null;
            jCheckBoxMarca.setEnabled(true);
            jCheckBoxPlaca.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBoxModeloActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for (int i = jTable1.getRowCount()-1; i>=0; i--){
            modelo.removeRow(i);
        }
        Stack<Vehiculo> pilaVehiculos;
        Stack<Vehiculo> pilaVehiculos2;
        //LinkedList<Vehiculo> list = Ingresar.listaVehiculos;
        LinkedList<Vehiculo> list = new LinkedList(admivehi.listaDeVehiculos);
        //LinkedList<Vehiculo> list2 = new LinkedList(admivehi.vehiculosAlquilados); //Para que?
        if(tipo!=null){
            String valor = jTextFieldValor.getText().replace(' ', '-');
            pilaVehiculos = Buscar(tipo, valor, list);
            pilaVehiculos2=Buscar(tipo,valor,admivehi.vehiculosAlquilados/*list2*/);
            //pilaVehiculos = Buscar(tipo, valor, admivehi.listaDeVehiculos);
            int coincidencias=pilaVehiculos.size()+pilaVehiculos2.size();
            
            System.out.println(coincidencias + " coincidencias");
            if(coincidencias==0){
                JOptionPane.showMessageDialog(this, "No se encontraron coincidencias");
            }else{
                this.jTable1.setVisible(true);
                
                while(!pilaVehiculos.isEmpty()){
                    Vehiculo vehic = pilaVehiculos.pop();
                    String[] Datos = new String[8];
                    Datos[0] = vehic.getPlaca();
                    Datos[1] = vehic.getMarca();
                    Datos[2] = vehic.getReferencia();
                    Datos[3] = String.valueOf(vehic.getYear());
                    Datos[4] = String.valueOf(vehic.getKilometraje());
                    Datos[5] = String.valueOf(vehic.getCilindraje());
                    Datos[6] = String.valueOf(vehic.getPuestos());
                    Datos[7] = "No";
                    
                    modelo.addRow(Datos);
                }
                //System.out.println(pilaVehiculos2.size());
                while(!pilaVehiculos2.isEmpty()){
                    Vehiculo vehic = pilaVehiculos2.pop();
                    String[] Datos = new String[8];
                    Datos[0] = vehic.getPlaca();
                    Datos[1] = vehic.getMarca();
                    Datos[2] = vehic.getReferencia();
                    Datos[3] = String.valueOf(vehic.getYear());
                    Datos[4] = String.valueOf(vehic.getKilometraje());
                    Datos[5] = String.valueOf(vehic.getCilindraje());
                    Datos[6] = String.valueOf(vehic.getPuestos());
                    Datos[7] = "Si";
                    
                    modelo.addRow(Datos);
                }
            }     
        }else{
            JOptionPane.showMessageDialog(this, "Escoja la variable por la que desea Buscar");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPlacaActionPerformed
        // TODO add your handling code here:
        if (jCheckBoxPlaca.isSelected()){
            tipo = "placa";
            jCheckBoxMarca.setEnabled(false);
            jCheckBoxModelo.setEnabled(false);
            
        }else{
            tipo = null;
            jCheckBoxMarca.setEnabled(true);
            jCheckBoxModelo.setEnabled(true);
        }
        
    }//GEN-LAST:event_jCheckBoxPlacaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxMarca;
    private javax.swing.JCheckBox jCheckBoxModelo;
    private javax.swing.JCheckBox jCheckBoxPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
