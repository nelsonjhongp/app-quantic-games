
package vista;

import controlador.Negocio;
import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*@author Nelson*/
public class FrmMenu extends javax.swing.JFrame {
    private Negocio principal;
    
    int xMouse, yMouse;
    public FrmMenu(Negocio general) {
        initComponents();
        if (general == null) {
            System.out.println("No hay Negocio, se crea nueva instancia");
            this.principal = new Negocio();
        } else {
            System.out.println("Hay Negocoi, se procede a incorporarlo");
            this.principal =  general;}
        lblcargoAhora.setText(principal.getCargoUsuarioLogin());
        btnVentaMouseClicked(null);
    }

    public void ShowPanel(JPanel panel){
        panel.setSize(800,600);
        panel.setLocation(0,0);
        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
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
        header = new javax.swing.JPanel();
        exitbtn = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();
        minbtn = new javax.swing.JPanel();
        btnMin = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        MenuBtns = new javax.swing.JPanel();
        lblIcono = new javax.swing.JLabel();
        btnVenta = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JPanel();
        text4 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JPanel();
        text5 = new javax.swing.JLabel();
        btnVendedores = new javax.swing.JPanel();
        text6 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        text7 = new javax.swing.JLabel();
        btnCompras = new javax.swing.JPanel();
        text8 = new javax.swing.JLabel();
        btnTiendas = new javax.swing.JPanel();
        text9 = new javax.swing.JLabel();
        lblcargoAhora = new javax.swing.JLabel();
        lbltextocargoahora = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(37, 50, 55));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitbtn.setBackground(new java.awt.Color(89, 89, 89));

        btnExit.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitbtnLayout = new javax.swing.GroupLayout(exitbtn);
        exitbtn.setLayout(exitbtnLayout);
        exitbtnLayout.setHorizontalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        header.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 30, -1));

        minbtn.setBackground(new java.awt.Color(89, 89, 89));

        btnMin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnMin.setForeground(new java.awt.Color(255, 255, 255));
        btnMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMin.setText("_");
        btnMin.setToolTipText("");
        btnMin.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout minbtnLayout = new javax.swing.GroupLayout(minbtn);
        minbtn.setLayout(minbtnLayout);
        minbtnLayout.setHorizontalGroup(
            minbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMin, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        minbtnLayout.setVerticalGroup(
            minbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        header.add(minbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 30, 30));

        titulo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Menu QuantGames");
        header.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 130, 20));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        MenuBtns.setBackground(new java.awt.Color(92, 107, 115));
        MenuBtns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMenu.png"))); // NOI18N
        lblIcono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIcono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIconoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIconoMouseExited(evt);
            }
        });
        MenuBtns.add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 160));

        btnVenta.setBackground(new java.awt.Color(92, 107, 115));
        btnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentaMouseExited(evt);
            }
        });

        text3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        text3.setForeground(new java.awt.Color(255, 255, 255));
        text3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        text3.setText("Venta");

        javax.swing.GroupLayout btnVentaLayout = new javax.swing.GroupLayout(btnVenta);
        btnVenta.setLayout(btnVentaLayout);
        btnVentaLayout.setHorizontalGroup(
            btnVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVentaLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        btnVentaLayout.setVerticalGroup(
            btnVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuBtns.add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 40));

        btnCerrar.setBackground(new java.awt.Color(92, 107, 115));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });

        text4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        text4.setForeground(new java.awt.Color(255, 255, 255));
        text4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        text4.setText("Cerrar Sesion");

        javax.swing.GroupLayout btnCerrarLayout = new javax.swing.GroupLayout(btnCerrar);
        btnCerrar.setLayout(btnCerrarLayout);
        btnCerrarLayout.setHorizontalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnCerrarLayout.setVerticalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuBtns.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 200, 50));

        btnProductos.setBackground(new java.awt.Color(92, 107, 115));
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductosMouseExited(evt);
            }
        });

        text5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        text5.setForeground(new java.awt.Color(255, 255, 255));
        text5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        text5.setText("Productos");

        javax.swing.GroupLayout btnProductosLayout = new javax.swing.GroupLayout(btnProductos);
        btnProductos.setLayout(btnProductosLayout);
        btnProductosLayout.setHorizontalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProductosLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        btnProductosLayout.setVerticalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuBtns.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 200, 40));

        btnVendedores.setBackground(new java.awt.Color(92, 107, 115));
        btnVendedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVendedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVendedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVendedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVendedoresMouseExited(evt);
            }
        });

        text6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        text6.setForeground(new java.awt.Color(255, 255, 255));
        text6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        text6.setText("Vendedores");

        javax.swing.GroupLayout btnVendedoresLayout = new javax.swing.GroupLayout(btnVendedores);
        btnVendedores.setLayout(btnVendedoresLayout);
        btnVendedoresLayout.setHorizontalGroup(
            btnVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVendedoresLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnVendedoresLayout.setVerticalGroup(
            btnVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVendedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuBtns.add(btnVendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 200, 40));

        btnClientes.setBackground(new java.awt.Color(92, 107, 115));
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
        });

        text7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        text7.setForeground(new java.awt.Color(255, 255, 255));
        text7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        text7.setText("Clientes");

        javax.swing.GroupLayout btnClientesLayout = new javax.swing.GroupLayout(btnClientes);
        btnClientes.setLayout(btnClientesLayout);
        btnClientesLayout.setHorizontalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnClientesLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(text7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnClientesLayout.setVerticalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text7, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuBtns.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 40));

        btnCompras.setBackground(new java.awt.Color(92, 107, 115));
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprasMouseExited(evt);
            }
        });

        text8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        text8.setForeground(new java.awt.Color(255, 255, 255));
        text8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        text8.setText("Compras");

        javax.swing.GroupLayout btnComprasLayout = new javax.swing.GroupLayout(btnCompras);
        btnCompras.setLayout(btnComprasLayout);
        btnComprasLayout.setHorizontalGroup(
            btnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnComprasLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnComprasLayout.setVerticalGroup(
            btnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuBtns.add(btnCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 200, 40));

        btnTiendas.setBackground(new java.awt.Color(92, 107, 115));
        btnTiendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTiendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTiendasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTiendasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTiendasMouseExited(evt);
            }
        });

        text9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        text9.setForeground(new java.awt.Color(255, 255, 255));
        text9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        text9.setText("Tiendas");

        javax.swing.GroupLayout btnTiendasLayout = new javax.swing.GroupLayout(btnTiendas);
        btnTiendas.setLayout(btnTiendasLayout);
        btnTiendasLayout.setHorizontalGroup(
            btnTiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTiendasLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(text9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnTiendasLayout.setVerticalGroup(
            btnTiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnTiendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text9, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuBtns.add(btnTiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 200, 40));

        lblcargoAhora.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblcargoAhora.setForeground(new java.awt.Color(102, 204, 255));
        lblcargoAhora.setText("#######");
        MenuBtns.add(lblcargoAhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 120, 20));

        lbltextocargoahora.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lbltextocargoahora.setForeground(new java.awt.Color(102, 204, 255));
        lbltextocargoahora.setText("c:");
        MenuBtns.add(lbltextocargoahora, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 20, 20));

        jPanel1.add(MenuBtns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, 600));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 800, 600));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseExited
        btnCompras.setBackground(new java.awt.Color(92,107,115));
    }//GEN-LAST:event_btnComprasMouseExited

    private void btnComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseEntered
        btnCompras.setBackground(new java.awt.Color(133, 158, 171));
    }//GEN-LAST:event_btnComprasMouseEntered

    private void btnComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseClicked
        MenuCompras pan = new MenuCompras(principal);
        ShowPanel(pan);
    }//GEN-LAST:event_btnComprasMouseClicked

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        btnClientes.setBackground(new java.awt.Color(92,107,115));
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        btnClientes.setBackground(new java.awt.Color(133, 158, 171));
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked
        MenuClientes pan = new MenuClientes(principal);
        ShowPanel(pan);
    }//GEN-LAST:event_btnClientesMouseClicked

    private void btnVendedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendedoresMouseExited
        btnVendedores.setBackground(new java.awt.Color(92,107,115));
    }//GEN-LAST:event_btnVendedoresMouseExited

    private void btnVendedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendedoresMouseEntered
        btnVendedores.setBackground(new java.awt.Color(133, 158, 171));
    }//GEN-LAST:event_btnVendedoresMouseEntered

    private void btnVendedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendedoresMouseClicked
        MenuVendedor pan = new MenuVendedor();
        ShowPanel(pan);
    }//GEN-LAST:event_btnVendedoresMouseClicked

    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        btnProductos.setBackground(new java.awt.Color(92,107,115));
    }//GEN-LAST:event_btnProductosMouseExited

    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        btnProductos.setBackground(new java.awt.Color(133, 158, 171));
    }//GEN-LAST:event_btnProductosMouseEntered

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        MenuProductos pan = new MenuProductos(principal);
        ShowPanel(pan);
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        btnCerrar.setBackground(new java.awt.Color(92,107,115));
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrar.setBackground(new java.awt.Color(133, 158, 171));
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        FrmLogin lgn = new FrmLogin(principal);
        
        principal.setCargoUsuarioLogin("");
        
        lgn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseExited
        btnVenta.setBackground(new java.awt.Color(92,107,115));
    }//GEN-LAST:event_btnVentaMouseExited

    private void btnVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseEntered
        btnVenta.setBackground(new java.awt.Color(133, 158, 171));
    }//GEN-LAST:event_btnVentaMouseEntered

    private void btnVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseClicked
        MenuVenta ven = new MenuVenta(principal);
        ShowPanel(ven);
    }//GEN-LAST:event_btnVentaMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void btnMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseExited
        minbtn.setBackground(new java.awt.Color(89,89,89));
    }//GEN-LAST:event_btnMinMouseExited

    private void btnMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseEntered
        minbtn.setBackground(new java.awt.Color(120,120,120));
    }//GEN-LAST:event_btnMinMouseEntered

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        this.setExtendedState(FrmLogin.ICONIFIED);
    }//GEN-LAST:event_btnMinMouseClicked

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        exitbtn.setBackground(new java.awt.Color(89,89,89));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        exitbtn.setBackground(new java.awt.Color(211,77,77));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnTiendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiendasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTiendasMouseClicked

    private void btnTiendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiendasMouseEntered
        btnTiendas.setBackground(new java.awt.Color(133, 158, 171));
    }//GEN-LAST:event_btnTiendasMouseEntered

    private void btnTiendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiendasMouseExited
        btnTiendas.setBackground(new java.awt.Color(92,107,115));
    }//GEN-LAST:event_btnTiendasMouseExited

    private void lblIconoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoMouseExited
        int xicon = lblIcono.getX();
        int yicon = lblIcono.getY();
        lblIcono.setLocation(xicon,yicon+2);
    }//GEN-LAST:event_lblIconoMouseExited

    private void lblIconoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoMouseEntered
        int xicon = lblIcono.getX();
        int yicon = lblIcono.getY();
        lblIcono.setLocation(xicon,yicon-2);
    }//GEN-LAST:event_lblIconoMouseEntered

    private void lblIconoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoMouseClicked
        if (principal.getCargoUsuarioLogin().equals("Administrador")) {
            FrmUsuarios frm = new FrmUsuarios(principal);
            frm.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Para Acceder a Usuarios necesita permisos de administrador",
                "Necesita Permisos",
                JOptionPane.WARNING_MESSAGE
            );
        }
    }//GEN-LAST:event_lblIconoMouseClicked
    
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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Negocio aux = null;
                new FrmMenu(aux).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuBtns;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnCompras;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnMin;
    private javax.swing.JPanel btnProductos;
    private javax.swing.JPanel btnTiendas;
    private javax.swing.JPanel btnVendedores;
    private javax.swing.JPanel btnVenta;
    private javax.swing.JPanel content;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblcargoAhora;
    private javax.swing.JLabel lbltextocargoahora;
    private javax.swing.JPanel minbtn;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    private javax.swing.JLabel text6;
    private javax.swing.JLabel text7;
    private javax.swing.JLabel text8;
    private javax.swing.JLabel text9;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    public Negocio getPrincipal() {
        return principal;
    }

    public void setPrincipal(Negocio principal) {
        this.principal = principal;
    }
}
