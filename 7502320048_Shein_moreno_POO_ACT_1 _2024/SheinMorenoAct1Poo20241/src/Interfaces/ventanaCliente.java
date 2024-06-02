/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import java.awt.BorderLayout;

/**
 *
 * @author ASUS
 */
public class ventanaCliente extends javax.swing.JFrame {

    /**
     * Creates new form ventanaCliente
     */
    public ventanaCliente() {
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

        jPanel1 = new javax.swing.JPanel();
        cliente = new javax.swing.JLabel();
        buttonHistorialMantenimiento = new javax.swing.JButton();
        buttonProgramacion = new javax.swing.JButton();
        buttonPagosEnLinea = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        itemBarraVertical = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cliente.setForeground(new java.awt.Color(255, 255, 255));
        cliente.setText("Cliente");
        cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 90, 40));

        buttonHistorialMantenimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonHistorialMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        buttonHistorialMantenimiento.setText("Historial Mantenimiento");
        buttonHistorialMantenimiento.setBorder(null);
        buttonHistorialMantenimiento.setContentAreaFilled(false);
        buttonHistorialMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHistorialMantenimientoActionPerformed(evt);
            }
        });
        jPanel1.add(buttonHistorialMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 215, 50));

        buttonProgramacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonProgramacion.setForeground(new java.awt.Color(255, 255, 255));
        buttonProgramacion.setText("Programacion ");
        buttonProgramacion.setBorder(null);
        buttonProgramacion.setContentAreaFilled(false);
        buttonProgramacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProgramacionActionPerformed(evt);
            }
        });
        jPanel1.add(buttonProgramacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 215, 50));

        buttonPagosEnLinea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonPagosEnLinea.setForeground(new java.awt.Color(255, 255, 255));
        buttonPagosEnLinea.setText("Pago en Liena");
        buttonPagosEnLinea.setBorder(null);
        buttonPagosEnLinea.setContentAreaFilled(false);
        buttonPagosEnLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPagosEnLineaActionPerformed(evt);
            }
        });
        jPanel1.add(buttonPagosEnLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 215, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\GitHub\\7502320048_Shein_moreno_POO-_2024_1\\7502320048_Shein_moreno_POO_ACT_1 _2024\\SheinMorenoAct1Poo20241\\src\\Interfaces\\menuVertical.png")); // NOI18N
        jLabel1.setName(""); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 215, 596));

        itemBarraVertical.setOpaque(false);
        itemBarraVertical.setPreferredSize(new java.awt.Dimension(750, 596));
        itemBarraVertical.setRequestFocusEnabled(false);

        javax.swing.GroupLayout itemBarraVerticalLayout = new javax.swing.GroupLayout(itemBarraVertical);
        itemBarraVertical.setLayout(itemBarraVerticalLayout);
        itemBarraVerticalLayout.setHorizontalGroup(
            itemBarraVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        itemBarraVerticalLayout.setVerticalGroup(
            itemBarraVerticalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(itemBarraVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHistorialMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHistorialMantenimientoActionPerformed

        ItemHistorialMantenimiento historialMantenimiento = new ItemHistorialMantenimiento();
        historialMantenimiento.setSize(750, 600);
        historialMantenimiento.setLocation(0, 0);

        itemBarraVertical.removeAll();
        itemBarraVertical.add(historialMantenimiento,BorderLayout.CENTER);
        itemBarraVertical.revalidate();
        itemBarraVertical.repaint();

    }//GEN-LAST:event_buttonHistorialMantenimientoActionPerformed

    private void buttonProgramacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProgramacionActionPerformed

        ItemVenta venta = new ItemVenta();
        venta.setSize(750, 600);
        venta.setLocation(0, 0);

        itemBarraVertical.removeAll();
        itemBarraVertical.add(venta,BorderLayout.CENTER);
        itemBarraVertical.revalidate();
        itemBarraVertical.repaint();
    }//GEN-LAST:event_buttonProgramacionActionPerformed

    private void buttonPagosEnLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPagosEnLineaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPagosEnLineaActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHistorialMantenimiento;
    private javax.swing.JButton buttonPagosEnLinea;
    private javax.swing.JButton buttonProgramacion;
    private javax.swing.JLabel cliente;
    private javax.swing.JPanel itemBarraVertical;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
