package proyecto;


import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import proyecto.VentasClientes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jonat
 */
public class DatosVentas extends javax.swing.JFrame {

    /**
     * Creates new form DatosVentas
     */
    public DatosVentas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigoClienteVentas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        codigoVenta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        productoVenta = new javax.swing.JTextField();
        fechaVenta = new javax.swing.JTextField();
        totalVentas = new javax.swing.JTextField();
        descripcionVenta = new javax.swing.JTextField();
        precioVenta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnRegistrarVenta = new javax.swing.JButton();
        btnEliminarVentas = new javax.swing.JButton();
        btnConsultarVenta = new javax.swing.JButton();
        btnReporteVentas = new javax.swing.JButton();
        btnRegresarDeVentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codigoClienteVentas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        codigoClienteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoClienteVentasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Código venta");

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaVentas);

        codigoVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        codigoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoVentaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Ventas");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Fecha");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Producto");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Descripción");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Código cliente");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Total de ventas");

        productoVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoVentaActionPerformed(evt);
            }
        });

        fechaVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaVentaActionPerformed(evt);
            }
        });

        totalVentas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalVentasActionPerformed(evt);
            }
        });

        descripcionVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descripcionVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionVentaActionPerformed(evt);
            }
        });

        precioVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        precioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioVentaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Precio");

        btnRegistrarVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrarVenta.setText("Registrar venta");
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });

        btnEliminarVentas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminarVentas.setText("Eliminar venta");
        btnEliminarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentasActionPerformed(evt);
            }
        });

        btnConsultarVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConsultarVenta.setText("Consultar venta");
        btnConsultarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVentaActionPerformed(evt);
            }
        });

        btnReporteVentas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReporteVentas.setText("Generar reporte");
        btnReporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteVentasActionPerformed(evt);
            }
        });

        btnRegresarDeVentas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegresarDeVentas.setText("Regresar");
        btnRegresarDeVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarDeVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descripcionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codigoClienteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(precioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnRegistrarVenta)
                        .addGap(31, 31, 31)
                        .addComponent(btnEliminarVentas)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultarVenta)
                        .addGap(18, 18, 18)
                        .addComponent(btnReporteVentas)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresarDeVentas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(codigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descripcionVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoClienteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarVenta)
                    .addComponent(btnEliminarVentas)
                    .addComponent(btnConsultarVenta)
                    .addComponent(btnReporteVentas)
                    .addComponent(btnRegresarDeVentas))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoClienteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoClienteVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoClienteVentasActionPerformed

    private void codigoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoVentaActionPerformed

    private void productoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoVentaActionPerformed

    private void fechaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaVentaActionPerformed

    private void totalVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalVentasActionPerformed

    private void descripcionVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionVentaActionPerformed

    private void precioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioVentaActionPerformed

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        VentasClientes venta = new VentasClientes();
        try{
            
            
        venta.setCod_ventasClientes(Integer.parseInt(codigoVenta.getText()));
        venta.setFecha(fechaVenta.getText());
        venta.setProducto(productoVenta.getText());
        venta.setPrecio(Double.parseDouble(precioVenta.getText()));
        venta.setDescripcion_producto(descripcionVenta.getText());
        venta.setTotal_ventas(Integer.parseInt(totalVentas.getText()));
        venta.setCod_clientes(Integer.parseInt(codigoClienteVentas.getText()));
        
        
        if(venta.getRegistrarVentas(venta)){
            JOptionPane.showMessageDialog(null, "Venta guardada");
        }else{
            JOptionPane.showMessageDialog(null, "Error de guardado");
        }
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,"Debe ingresar datos validos para cada campo");
        }
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void btnEliminarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentasActionPerformed
       VentasClientes venta = new VentasClientes();
        
        venta.setCod_ventasClientes(Integer.parseInt(codigoVenta.getText()));
        if(venta.getEliminarVenta(venta)){
            JOptionPane.showMessageDialog(null, "Venta eliminada");
        }else{
             JOptionPane.showMessageDialog(null, "No se pudo eliminar la venta");
        }
    }//GEN-LAST:event_btnEliminarVentasActionPerformed

    private void btnConsultarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVentaActionPerformed
        VentasClientes venta = new VentasClientes();
        venta.setCod_ventasClientes(Integer.parseInt(codigoVenta.getText()));
        
        tablaVentas.setModel(venta.getConsultarVenta(venta));
    }//GEN-LAST:event_btnConsultarVentaActionPerformed

    private void btnReporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteVentasActionPerformed
       VentasClientes venta = new VentasClientes();
       tablaVentas.setModel(venta.getReporteVentas());
    }//GEN-LAST:event_btnReporteVentasActionPerformed

    private void btnRegresarDeVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarDeVentasActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
           new Inicio().setVisible(true);
       });
       
        hide();
    }//GEN-LAST:event_btnRegresarDeVentasActionPerformed

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
            java.util.logging.Logger.getLogger(DatosVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarVenta;
    private javax.swing.JButton btnEliminarVentas;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JButton btnRegresarDeVentas;
    private javax.swing.JButton btnReporteVentas;
    private javax.swing.JTextField codigoClienteVentas;
    private javax.swing.JTextField codigoVenta;
    private javax.swing.JTextField descripcionVenta;
    private javax.swing.JTextField fechaVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField precioVenta;
    private javax.swing.JTextField productoVenta;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextField totalVentas;
    // End of variables declaration//GEN-END:variables
}