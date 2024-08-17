/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controller.Negocio;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DAVID
 */
public class frmBuscarCliente extends javax.swing.JFrame {
    Negocio obj;
    public frmBuscarCliente(Negocio principal) {
        initComponents();
        this.obj = principal;
        filtra("");
    }
    
    public void filtra(String cad){
        DefaultTableModel modelo = (DefaultTableModel) tablaClient.getModel();
        modelo.setRowCount(0);
        obj.mostrarClientes().stream()
                .filter(x->(Integer.toString(x.getDni())).toLowerCase().startsWith(cad.toLowerCase()))
                .forEach(x->modelo.addRow(new Object[]{x.getDni(),x.getNombre()}));
    }

    /**
     DefaultTableModel modelo = (DefaultTableModel) tablaBuscarPro.getModel();
        modelo.setRowCount(0);
        obj.lisProducto().stream()
                .filter(x->x.getInfo().toLowerCase().startsWith(cad.toLowerCase()))
                .forEach(x->modelo.addRow(new Object[]{x.getId(),x.getTipo(),x.getInfo(),x.getPrecio(),x.getCantidad()}));
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarClientes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClient = new javax.swing.JTable();
        RogImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CLIENTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCAR CLIENTES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 20, 160, 20));

        txtBuscarClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarClientesKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 180, -1));

        tablaClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "DNI", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaClientMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClient);
        if (tablaClient.getColumnModel().getColumnCount() > 0) {
            tablaClient.getColumnModel().getColumn(0).setResizable(false);
            tablaClient.getColumnModel().getColumn(1).setResizable(false);
            tablaClient.getColumnModel().getColumn(1).setPreferredWidth(300);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 560, 350));

        RogImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_login.png"))); // NOI18N
        jPanel1.add(RogImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

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
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarClientesKeyReleased
        // TODO add your handling code here:
        filtra(txtBuscarClientes.getText());
    }//GEN-LAST:event_txtBuscarClientesKeyReleased

    private void tablaClientMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientMouseReleased
        int fila = tablaClient.getSelectedRow();
        MenuVenta.txtDNI.setText(tablaClient.getValueAt(fila, 0).toString());
        MenuVenta.txtName.setText(tablaClient.getValueAt(fila, 1).toString());
        
        setVisible(false);
        dispose();
    }//GEN-LAST:event_tablaClientMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RogImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClient;
    private javax.swing.JTextField txtBuscarClientes;
    // End of variables declaration//GEN-END:variables
}
