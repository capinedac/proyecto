/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Estructuras.LinkedList;
import Control.*;
import Modelo.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago Mendoza
 */
public class Ingresar extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar
     */
    private Usuario usu;
    private AdministrarUsuario admiusu;
    private Principal princi;
    private AdministrarVehiculo admivehi;
    public static LinkedList<Vehiculo> listaVehiculos = new LinkedList<>();
    public Ingresar() {
        initComponents();
        usu= new Usuario();
        admiusu= new AdministrarUsuario();
        princi = new Principal();
        admivehi=new AdministrarVehiculo();
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
        usuarioTF = new javax.swing.JTextField();
        contrasenaPF = new javax.swing.JPasswordField();
        ingresarBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bienvenido");

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        ingresarBT.setText("Ingresar");
        ingresarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuarioTF, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(contrasenaPF))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(ingresarBT)))
                .addGap(56, 171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usuarioTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(contrasenaPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(ingresarBT)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBTActionPerformed
        // TODO add your handling code here:
    Usuario u= new Usuario();
        u= null;
        u=admiusu.buscarUsuario(usuarioTF.getText());
        if (u!=null){
            if(contrasenaPF.getText().equals(u.getClave())){
                usu=u;
            
                this.setVisible(false);
                princi.setVisible(true); 
                princi.requestFocus();
                
            }
            else{
                JOptionPane.showMessageDialog(this,"La Contraseña es incorrecta.");
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"El ususario no existe.");
        }  
        
        //Leer el archivo
        
        try{
            Scanner input = new Scanner(new File("MOCK_DATA_1.txt"));
            while(input.hasNextLine()){
                input.nextLine();
                String placa = input.next();
                Float kilom = input.nextFloat();
                int year = input.nextInt();
                String marca = input.next();
                String ref = input.next();
                int cilind = input.nextInt();
                int puestos = input.nextInt();
                Vehiculo vehiculo = new Vehiculo(kilom,year,marca,ref,cilind,placa,puestos);
                listaVehiculos.pushFront(vehiculo);
                //System.out.println(listaVehiculos.size() + " " + listaVehiculos.topFront().getPlaca() + " " + listaVehiculos.topFront().getMarca());
                //admivehi.agregarVehiculo(vehiculo);  //No quitar
                System.out.println(admivehi.size());
            }
            input.close();
            
                       
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        princi.setListaVehiculos(listaVehiculos);
        princi.setAdministrarVehiculos(admivehi);
        
        
        
        
    }//GEN-LAST:event_ingresarBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contrasenaPF;
    private javax.swing.JButton ingresarBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField usuarioTF;
    // End of variables declaration//GEN-END:variables
}
