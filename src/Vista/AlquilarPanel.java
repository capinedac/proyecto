/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.*;
import Control.*;
import Estructuras.*;
import javax.swing.JOptionPane;

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
    private LinkedList<Vehiculo> vehiculosAlquilados;
    
    public AlquilarPanel() {
        initComponents();
        vehiculosAlquilados=new LinkedList<Vehiculo>();
        
        
        
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        alquilarBoton = new javax.swing.JButton();
        marcaTF = new javax.swing.JTextField();
        referenciaTF = new javax.swing.JTextField();
        placaTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        devolverBT = new javax.swing.JButton();

        jLabel1.setText("Alquilar");

        jLabel2.setText("Marca");

        jLabel3.setText("Referencia");

        alquilarBoton.setText("Alquilar");
        alquilarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alquilarBotonActionPerformed(evt);
            }
        });

        jLabel4.setText(" Placa");

        devolverBT.setText("Devolver");
        devolverBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverBTActionPerformed(evt);
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
                            .addComponent(jLabel2)
                            .addComponent(marcaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(referenciaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(devolverBT)
                                    .addComponent(alquilarBoton)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(placaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(alquilarBoton)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(marcaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(referenciaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devolverBT))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
     
    public void setAdministrarVehiculo(AdministrarVehiculo adv){
        this.admivehi=adv;
    }
    public void setListaVehiculosAlP(LinkedList lista){
        this.listaVehiculosAlP= lista;
    }
    
    private void alquilarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alquilarBotonActionPerformed
        // TODO add your handling code here:
        String marca= marcaTF.getText();
        String referencia= referenciaTF.getText();
        int cantidadVehiculos= admivehi.size();
        //System.out.println(cantidadVehiculos);
        Nodo<Vehiculo> sentinela= admivehi.listaDeVehiculos.top;
        boolean estado=false;
        for(int i=0;i<cantidadVehiculos;i++){
            //System.out.println(sentinela.key.getMarca()+" "+sentinela.key.getReferencia());
            if(sentinela.key.getMarca().equals(marca)){
                
                if(sentinela.key.getReferencia().equals(referencia)){
                    admivehi.borrarVehiculo(sentinela.key);
                    Vehiculo alquilado=sentinela.key;
                    
                    vehiculosAlquilados.pushBack(alquilado);
                    //System.out.println(vehiculosAlquilados.size());
                    //System.out.println(admivehi.size());
                    estado=true;
                    JOptionPane.showMessageDialog(this, "El vehiculo alquilado es:"+alquilado.getMarca()+" "+alquilado.getReferencia()+" de placa "+alquilado.getPlaca());
                    
                    break;
                }
            }
            sentinela=sentinela.next;
        }
        if(!estado){
            JOptionPane.showMessageDialog(this, "No hay un vehiculo de esta marca y referencia disponible para alquilar");
        }
        System.out.println(admivehi.size());
        System.out.println(vehiculosAlquilados.size());
        //Vehiculo alquilado=colaMarca.dequeue();
        //JOptionPane.showMessageDialog(this, "El vehiculo a alquilar es: "+alquilado.getMarca()+" "+alquilado.getReferencia()+" de placa "+alquilado.getPlaca());
        
        
        
        //JOptionPane.showMessageDialog(this,"El vehiculo alquilado es el: "+alquilado.getMarca()+" "+alquilado.getReferencia()+" de placa "+alquilado.getPlaca());
    }//GEN-LAST:event_alquilarBotonActionPerformed

    private void devolverBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverBTActionPerformed
        // TODO add your handling code here:
        int tamañoAlquilados=vehiculosAlquilados.size();
        Nodo<Vehiculo> sentinela=vehiculosAlquilados.top;
        boolean estado=false;
        for(int i=0;i<tamañoAlquilados;i++){
            if(sentinela.key.getPlaca().equals(placaTF.getText())){
                vehiculosAlquilados.Eliminar(sentinela.key);
                admivehi.agregarVehiculo(sentinela.key);
                JOptionPane.showMessageDialog(this,"Se ha registrado la devolucion del vehiculo");
                estado=true;
            }
            sentinela=sentinela.next;
        }
        if(!estado){
            JOptionPane.showMessageDialog(this, "El vehiculo con estas placas no esta alquilado o no existe");
        }
        System.out.println(admivehi.size());
        System.out.println(vehiculosAlquilados.size());
        
    }//GEN-LAST:event_devolverBTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alquilarBoton;
    private javax.swing.JButton devolverBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField marcaTF;
    private javax.swing.JTextField placaTF;
    private javax.swing.JTextField referenciaTF;
    // End of variables declaration//GEN-END:variables
}
