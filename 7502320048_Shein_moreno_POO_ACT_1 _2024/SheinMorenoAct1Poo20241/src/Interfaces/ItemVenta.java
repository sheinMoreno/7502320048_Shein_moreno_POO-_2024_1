/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

import java.awt.BorderLayout;

/**
 *
 * @author ASUS
 */
public class ItemVenta extends javax.swing.JPanel {

    /**
     * Creates new form ItemVenta
     */
    public ItemVenta() {
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

        jPanel2 = new javax.swing.JPanel();
        buttonNuevaVenta = new javax.swing.JButton();
        buttonEditarVenta = new javax.swing.JButton();
        buttonEliminarVenta = new javax.swing.JButton();
        buttonListaVenta = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setEnabled(false);
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonNuevaVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonNuevaVenta.setForeground(new java.awt.Color(255, 255, 255));
        buttonNuevaVenta.setText("Nueva Venta");
        buttonNuevaVenta.setBorder(null);
        buttonNuevaVenta.setContentAreaFilled(false);
        buttonNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNuevaVentaActionPerformed(evt);
            }
        });
        jPanel2.add(buttonNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 50));

        buttonEditarVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonEditarVenta.setForeground(new java.awt.Color(255, 255, 255));
        buttonEditarVenta.setText("Editar Venta");
        buttonEditarVenta.setBorder(null);
        buttonEditarVenta.setContentAreaFilled(false);
        buttonEditarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(buttonEditarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, 50));

        buttonEliminarVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonEliminarVenta.setForeground(new java.awt.Color(255, 255, 255));
        buttonEliminarVenta.setText("Eliminar Venta");
        buttonEliminarVenta.setBorder(null);
        buttonEliminarVenta.setContentAreaFilled(false);
        jPanel2.add(buttonEliminarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 50));

        buttonListaVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonListaVenta.setForeground(new java.awt.Color(255, 255, 255));
        buttonListaVenta.setText("Lista Venta");
        buttonListaVenta.setBorder(null);
        buttonListaVenta.setContentAreaFilled(false);
        jPanel2.add(buttonListaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, 50));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 20, 30));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 20, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 20, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/itemhorizontal2.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 752, -1));

        content.setOpaque(false);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 750, 596));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuevaVentaActionPerformed
        
        
       VendedorNuevaVenta ventaNueva =new VendedorNuevaVenta();
        ventaNueva.setSize(750,525);
        ventaNueva.setLocation(0, 0);
        
        content.removeAll();
        content.add(ventaNueva,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_buttonNuevaVentaActionPerformed

    private void buttonEditarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarVentaActionPerformed
        
        
        VendedorEditarVenta ventaEditar =new VendedorEditarVenta();
        ventaEditar.setSize(750,525);
        ventaEditar.setLocation(0, 0);
        
        content.removeAll();
        content.add(ventaEditar,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_buttonEditarVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarVenta;
    private javax.swing.JButton buttonEliminarVenta;
    private javax.swing.JButton buttonListaVenta;
    private javax.swing.JButton buttonNuevaVenta;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}