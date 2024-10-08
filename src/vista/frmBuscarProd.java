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
public class frmBuscarProd extends javax.swing.JFrame {
    Negocio obj;
    
    public frmBuscarProd(Negocio principal) {
        initComponents();
        this.obj = principal;
        filtra("");
    }
    
    public void filtra(String cad){
        DefaultTableModel modelo = (DefaultTableModel) tablaBuscarPro.getModel();
        modelo.setRowCount(0);
        obj.mostrarProductos().stream()
                .filter(x->x.getInfo().toLowerCase().startsWith(cad.toLowerCase()))
                .forEach(x->modelo.addRow(new Object[]{x.getId(),x.getTipo(),x.getInfo(),x.getPrecio(),x.getCantidad()}));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscarProducto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBuscarPro = new javax.swing.JTable();
        RogImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUCTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCAR PRODUCTO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 140, 20));

        txtBuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarProductoKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 180, -1));

        tablaBuscarPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "tipo", "descripción", "precio", "cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBuscarPro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaBuscarPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaBuscarProMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaBuscarPro);
        if (tablaBuscarPro.getColumnModel().getColumnCount() > 0) {
            tablaBuscarPro.getColumnModel().getColumn(0).setResizable(false);
            tablaBuscarPro.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaBuscarPro.getColumnModel().getColumn(1).setResizable(false);
            tablaBuscarPro.getColumnModel().getColumn(2).setResizable(false);
            tablaBuscarPro.getColumnModel().getColumn(2).setPreferredWidth(200);
            tablaBuscarPro.getColumnModel().getColumn(3).setResizable(false);
            tablaBuscarPro.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 560, 350));

        RogImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_login.png"))); // NOI18N
        jPanel1.add(RogImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductoKeyReleased
        // TODO add your handling code here:
        filtra(txtBuscarProducto.getText());
    }//GEN-LAST:event_txtBuscarProductoKeyReleased

    private void tablaBuscarProMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBuscarProMouseReleased
        int fila = tablaBuscarPro.getSelectedRow();
        MenuVenta.txtID.setText(tablaBuscarPro.getValueAt(fila, 0).toString());
        MenuVenta.txtDescripcionPro.setText(tablaBuscarPro.getValueAt(fila, 2).toString());
        MenuVenta.txtPre.setText(tablaBuscarPro.getValueAt(fila, 3).toString());
        MenuVenta.txtStockDis.setText(tablaBuscarPro.getValueAt(fila, 4).toString());
        
        setVisible(false);
        dispose();
    }//GEN-LAST:event_tablaBuscarProMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RogImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaBuscarPro;
    private javax.swing.JTextField txtBuscarProducto;
    // End of variables declaration//GEN-END:variables
}
