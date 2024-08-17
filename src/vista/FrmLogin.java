
package vista;

import controller.DaoUsuario;
import controller.Negocio;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import utils.ThemeManager;

/*@author Nelson*/
public class FrmLogin extends javax.swing.JFrame {
    private Negocio negocio;
    public FrmLogin(Negocio general) {
        initComponents();
        this.negocio = Negocio.getInstance();
        
        ThemeManager.registerFrame(this);
        ThemeManager.applyTheme();
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
        Logo = new javax.swing.JLabel();
        errorCon = new javax.swing.JLabel();
        errorUs = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        campoUsu = new javax.swing.JTextField();
        Contraseña = new javax.swing.JLabel();
        campoCon = new javax.swing.JPasswordField();
        btnAcerca = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        showHide = new javax.swing.JCheckBox();
        RogImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresar Cuenta");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nelson\\Documents\\NetBeansProjects\\PryQGames_V4.1\\resources\\images\\LogoMin.png")); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 220, 125));
        jPanel1.add(errorCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 20, 20));
        jPanel1.add(errorUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 20, 20));

        Usuario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("Usuario");
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 190, 20));

        campoUsu.setBackground(new java.awt.Color(51, 51, 51));
        campoUsu.setForeground(new java.awt.Color(255, 255, 255));
        campoUsu.setBorder(null);
        campoUsu.setCaretColor(new java.awt.Color(255, 255, 255));
        campoUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoUsuKeyPressed(evt);
            }
        });
        jPanel1.add(campoUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 180, 20));

        Contraseña.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña.setText("Contraseña");
        jPanel1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 190, 20));

        campoCon.setBackground(new java.awt.Color(51, 51, 51));
        campoCon.setForeground(new java.awt.Color(255, 255, 255));
        campoCon.setActionCommand("<Not Set>");
        campoCon.setBorder(null);
        campoCon.setCaretColor(new java.awt.Color(255, 255, 255));
        campoCon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoConKeyPressed(evt);
            }
        });
        jPanel1.add(campoCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 180, 20));

        btnAcerca.setText("Acerca del programa");
        btnAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAcerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, -1, 30));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 130, 30));

        showHide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        showHide.setContentAreaFilled(false);
        showHide.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        showHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconOcultar.png"))); // NOI18N
        showHide.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconMostrar.png"))); // NOI18N
        showHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHideActionPerformed(evt);
            }
        });
        jPanel1.add(showHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        RogImg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nelson\\Documents\\NetBeansProjects\\PryQGames_V4.1\\resources\\images\\background_login.png")); // NOI18N
        jPanel1.add(RogImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

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
    
    private void campoUsuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoUsuKeyPressed
        enterLogin(evt);
    }//GEN-LAST:event_campoUsuKeyPressed
    private void campoConKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoConKeyPressed
        enterLogin(evt);
    }//GEN-LAST:event_campoConKeyPressed
    private void btnAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaActionPerformed
        FrmAcerca acr = new FrmAcerca(negocio);
        acr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAcercaActionPerformed
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String contrasena = new String(campoCon.getPassword());
        String usuario = campoUsu.getText().trim();
        DaoUsuario daoUser = new DaoUsuario(negocio);
        String mensaje = daoUser.validarEntradaDeDatos(usuario, contrasena, errorUs, errorCon);
        if (mensaje.isEmpty()) {
            daoUser.processLogin(usuario, contrasena, this);
        } else {
            JOptionPane.showMessageDialog(null, mensaje, "Faltan Datos", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed
    private void showHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHideActionPerformed
        if (showHide.isSelected()) 
            campoCon.setEchoChar((char) 0);
        else 
            campoCon.setEchoChar('\u2022');
    }//GEN-LAST:event_showHideActionPerformed
    //Presionando el boton de Enter se acciona el boton de inigresar
    public void enterLogin(java.awt.event.KeyEvent evt){
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnIngresarActionPerformed(null);
        }
    }
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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Negocio negocio = new Negocio(); // Create one instance
                FrmLogin loginForm = new FrmLogin(negocio);
                loginForm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel RogImg;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton btnAcerca;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPasswordField campoCon;
    private javax.swing.JTextField campoUsu;
    private javax.swing.JLabel errorCon;
    private javax.swing.JLabel errorUs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox showHide;
    // End of variables declaration//GEN-END:variables
}
