package vista;

import controlador.Negocio;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;

/*@author Nelson*/
public class MenuDetalles extends javax.swing.JPanel {
    /*=========================================*/
    /*<<---{ Detalles Nelson (AVANCE 2) }---->>*/
    /*=========================================*/
    
    Negocio obj;
    public MenuDetalles(Negocio principal) {
        initComponents();
        this.obj = principal;
        tablaVentas();
        tablaDetalles();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtVend = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnIrVenta = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        jLabel5.setText("STOCK DIS.");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Cliente", "Vendedor", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVenta);
        if (tablaVenta.getColumnModel().getColumnCount() > 0) {
            tablaVenta.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablaVenta.getColumnModel().getColumn(1).setPreferredWidth(140);
            tablaVenta.getColumnModel().getColumn(2).setPreferredWidth(80);
            tablaVenta.getColumnModel().getColumn(3).setPreferredWidth(45);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 370, 410));

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Cod_Pro", "Cantidad", "Precio", "Id_Venta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaDetalle);
        if (tablaDetalle.getColumnModel().getColumnCount() > 0) {
            tablaDetalle.getColumnModel().getColumn(1).setPreferredWidth(140);
            tablaDetalle.getColumnModel().getColumn(2).setPreferredWidth(80);
            tablaDetalle.getColumnModel().getColumn(3).setPreferredWidth(45);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 370, 410));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Detalles");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 200, 30));

        txtVend.setText("VENDEDOR1");
        jPanel1.add(txtVend, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel11.setText("Detalles");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Venta");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, 30));

        btnIrVenta.setText("Ir a Venta");
        btnIrVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnIrVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 550, 150, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MenuBackground.png"))); // NOI18N
        fondo.setText("jLabel2");
        fondo.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrVentaActionPerformed
        MenuVenta mvent = new MenuVenta(obj);      
        mvent.setSize(800,600);
        mvent.setLocation(0,0);
        
        this.removeAll();
        this.add(mvent, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnIrVentaActionPerformed

    void tablaVentas(){
        DefaultTableModel dt = (DefaultTableModel)tablaVenta.getModel();
        dt.setRowCount(0);
        dt = obj.tablaVentas(dt);
    }
    void tablaDetalles(){
        DefaultTableModel dt = (DefaultTableModel)tablaDetalle.getModel();
        dt.setRowCount(0);
        dt = obj.tablaDetalles(dt);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIrVenta;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JLabel txtVend;
    // End of variables declaration//GEN-END:variables
}

    
