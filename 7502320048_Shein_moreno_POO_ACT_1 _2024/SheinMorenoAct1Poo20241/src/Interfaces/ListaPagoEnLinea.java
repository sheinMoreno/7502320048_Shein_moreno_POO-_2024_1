/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

/**
 *
 * @author ASUS
 */
public class ListaPagoEnLinea extends javax.swing.JPanel {

    /**
     * Creates new form ListaPagoEnLinea
     */
    public ListaPagoEnLinea() {
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
        buscar = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        text_buscar = new javax.swing.JTextField();
        button_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_cliente = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(59, 75, 82));
        buscar.setText("Buscar:");
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 70, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 220, 10));

        text_buscar.setBorder(null);
        text_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(text_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 210, -1));

        button_buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\GitHub\\7502320048_Shein_moreno_POO-_2024_1\\7502320048_Shein_moreno_POO_ACT_1 _2024\\SheinMorenoAct1Poo20241\\src\\Interfaces\\iconos\\lupa.png")); // NOI18N
        button_buscar.setBorder(null);
        button_buscar.setBorderPainted(false);
        button_buscar.setContentAreaFilled(false);
        button_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(button_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        table_cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "ID", "Nombres", "Apellidos", "Celular", "Correo", "DIreccion", "Modelo", "Marca", "Tipo de Mantenimiento", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_cliente.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(table_cliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 720, 430));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void text_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_buscarActionPerformed

    private void button_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_buscarActionPerformed

    }//GEN-LAST:event_button_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscar;
    private javax.swing.JButton button_buscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable table_cliente;
    private javax.swing.JTextField text_buscar;
    // End of variables declaration//GEN-END:variables
}
