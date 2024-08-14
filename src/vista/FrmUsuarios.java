package vista;

import controlador.Negocio;
import javax.swing.*;

/*@author Nelson*/
public class FrmUsuarios extends javax.swing.JFrame {
    private Negocio obj;
    
    String cargoNegocio = "";
    userRegistro usreg;
    userMostrar usmost;
    
    public interface UserMostrarListener {
        void modificaRegistro(String nombre, String cargo);
    }
    public interface UserRegistroListener {
        void muestraRegistro();
    }
    
    public FrmUsuarios(Negocio principal) {
        initComponents();
        
        if (principal == null) {System.out.println("No hay Negocio, se crea nueva instancia");this.obj = new Negocio();
        } else {System.out.println("Hay Negocoi, se procede a incorporarlo");this.obj =  principal;}
        
        usreg = new userRegistro(this.obj);
        usmost = new userMostrar(this.obj);
        //comprobarNegocio(principal);
        
        btnRegistroActionPerformed(null);
        usmost.setUserMostrarListener(usreg);
        usreg.UserRegistroListener(usmost);
        lblCargoCond.setText(cargoNegocio);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelGeneral = new javax.swing.JPanel();
        btnRegistro = new javax.swing.JButton();
        btnMostrarUsuarios = new javax.swing.JButton();
        lblCargoCond = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuarios");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel1.add(panelGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 580, 300));

        btnRegistro.setText("Registrar");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 110, -1));

        btnMostrarUsuarios.setText("Mostrar");
        btnMostrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 20, 110, -1));

        lblCargoCond.setText("Cargo Actual : NULL");
        jPanel1.add(lblCargoCond, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MenuBackground.png"))); // NOI18N
        fondo.setText("jLabel2");
        fondo.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

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

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        ShowPanel(usreg);
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnMostrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarUsuariosActionPerformed
        ShowPanel(usmost);
    }//GEN-LAST:event_btnMostrarUsuariosActionPerformed

    public void ShowPanel(JPanel panel) {
        panel.setSize(580, 300);
        panel.setLocation(0, 0);
        this.panelGeneral.removeAll();
        this.panelGeneral.add(panel, "Center");
        this.panelGeneral.revalidate();
        this.panelGeneral.repaint();
    }
    
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
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Negocio aux = null;
                new FrmUsuarios(aux).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarUsuarios;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCargoCond;
    private javax.swing.JPanel panelGeneral;
    // End of variables declaration//GEN-END:variables
}
