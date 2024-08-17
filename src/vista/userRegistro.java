
package vista;

import controller.Negocio;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import model.Usuario;
import vista.FrmUsuarios.*;

/**
 *
 * @author Nelson
 */
public class userRegistro extends javax.swing.JPanel implements UserMostrarListener {
    Negocio obj;
    private UserRegistroListener listenerReg;
    
    public userRegistro(Negocio principal) {
        initComponents();
        this.obj = principal;
        cambiarImagen(0);
    }

    void cambiarImagen(int cargoNum){
        String iconUrl;
        switch (cargoNum) {
            case 0:  iconUrl = "iconAdmin.png"; break;
            case 1:  iconUrl = "iconVendor.png"; break;
            case 2:  iconUrl = "iconEmpleado.png"; break;
            case 3:  iconUrl = "iconClient.png"; break;
            case 4:  iconUrl = "iconCajero.png"; break;
            default: iconUrl = "iconAdmin.png";
        }
        
        
        URL resource = getClass().getResource("/images/" + iconUrl);
        ImageIcon iconLogo = new ImageIcon(resource);

        Image image = iconLogo.getImage();
        Image imgRescalado = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);

        iconLogo = new ImageIcon(imgRescalado);
        lblImage.setIcon(iconLogo);
    }
    
    boolean esIgual(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public int cargoCmb(String cargo){
        int valor;
        switch (cargo) {
            case "Administrador":valor = 0;break;
            case "Vendedor":valor = 1;break;
            case "Empleado":valor = 2;break;
            case "Cliente":valor = 3;break;
            case "Cajero":valor = 4;break;
            default:valor = -1; 
        }
        return valor;
    }
    
    @Override
    public void modificaRegistro(String nombre, String cargo) {
        btnRegistrar.setEnabled(false);
        btnModificar.setEnabled(true);
        txtNombre.setEnabled(false);
        
        txtNombre.setText(nombre);
        nombreInicial = nombre;
        
        cmbCargo.setSelectedIndex(cargoCmb(cargo));
        txtContrasena.setText("");
        txtConfirmContra.setText("");
    }
    
    boolean validacionDatos(boolean datosValicion){
        char[] contrasena = txtContrasena.getPassword();
        char[] confirmContra = txtConfirmContra.getPassword();
        
        String mensaje = "";
        
        if (txtNombre.getText().trim().isEmpty()) {
            datosValicion = false;
            mensaje = "Falta Nombre.";
        } else if (confirmContra.length == 0) {
            datosValicion = false;
            mensaje = "Por favor, ingresa la confirmación de contraseña.";
        } else if (!esIgual(contrasena, confirmContra)) {
            datosValicion = false;
            mensaje = "Las contraseñas no coinciden.";
        }
        lblTextContra.setText(mensaje);
        return datosValicion;
    }
    
    public void UserRegistroListener(UserRegistroListener listenerReg) {
        this.listenerReg = listenerReg;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        lblConfirmar = new javax.swing.JLabel();
        Separador = new javax.swing.JSeparator();
        cmbCargo = new javax.swing.JComboBox<>();
        lblImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtContrasena = new javax.swing.JPasswordField();
        txtConfirmContra = new javax.swing.JPasswordField();
        btnMostrarContrasena = new javax.swing.JButton();
        lblTextContra = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();

        lblNombre.setText("Nombre");

        lblCargo.setText("Cargo");

        lblContra.setText("Contraseña");

        lblConfirmar.setText("Confirmar Contraseña");

        Separador.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Vendedor", "Empleado", "Cliente", "Cajero" }));
        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("¡ Necesita Permisos de Administrador para Registrar Cuentas !");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtContrasena.setText("contrasena1");

        txtConfirmContra.setText("contrasena2");

        btnMostrarContrasena.setText("Mostrar Contraseña");
        btnMostrarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarContrasenaActionPerformed(evt);
            }
        });

        lblTextContra.setForeground(new java.awt.Color(51, 153, 255));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.setFocusCycleRoot(true);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Registro de Usuarios");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblContra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtConfirmContra, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnMostrarContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTextContra, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfirmContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addComponent(btnRegistrar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnModificar)
                    .addComponent(btnMostrarContrasena))
                .addGap(17, 17, 17)
                .addComponent(lblTextContra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        boolean datosValicion = true;
        datosValicion = validacionDatos(datosValicion);
        
        if (datosValicion) {
            lblTextContra.setText("Registro exitoso.");
            
            String nombre = txtNombre.getText();
            String contra = new String(txtContrasena.getPassword());
            String cargo = cmbCargo.getSelectedItem().toString();
            
            obj.getTablaLogin().insertarTabHash(nombre, new Usuario(contra, cargo, obj.obtenerFechaActual(), obj.obtenerFechaActual()));
            //obj.insertarUsuario(nombre, contra, cargo, obj.obtenerFechaActual(), obj.obtenerFechaActual());

            txtNombre.setText("");
            txtContrasena.setText("");
            txtConfirmContra.setText("");

            if (listenerReg != null) {
                listenerReg.muestraRegistro();
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    boolean mostrarContrasena = false;
    private void btnMostrarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarContrasenaActionPerformed
        mostrarContrasena = !mostrarContrasena;
        if (mostrarContrasena) {
            txtContrasena.setEchoChar((char) 0); // Mostrar contraseña sin asteriscos
            txtConfirmContra.setEchoChar((char) 0);
            btnMostrarContrasena.setText("Ocultar Contraseña");
        } else {
            txtContrasena.setEchoChar('*'); // Mostrar contraseña con asteriscos
            txtConfirmContra.setEchoChar('*');
            btnMostrarContrasena.setText("Mostrar Contraseña");
        }
    }//GEN-LAST:event_btnMostrarContrasenaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        txtContrasena.setText("");
        txtConfirmContra.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed
    
    String nombreInicial = "";
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        boolean datosValicion = true;
        datosValicion = validacionDatos(datosValicion);
        
        if (obj.getTablaLogin().contieneClaveTabHash(nombreInicial) && datosValicion) {
            Usuario usuarioExistente = obj.getTablaLogin().obtenerValorTabHash(nombreInicial);
        
            char[] contrasena = txtContrasena.getPassword();
            
            String ctrna = String.valueOf(contrasena);
            String crgo = cmbCargo.getSelectedItem().toString();
            obj.getTablaLogin().eliminarTabHash(nombreInicial);
            obj.getTablaLogin().insertarTabHash(
                    nombreInicial, 
                    new Usuario(ctrna, crgo, usuarioExistente.getFechaCreacion(), obj.obtenerFechaActual())
            );
            
            nombreInicial = "";
            System.out.println("Usuario editado correctamente");
            btnNuevoActionPerformed(null);
            
        } else {
            System.out.println("No se encontró el usuario con la clave " + txtNombre.getText().toString());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtNombre.setText("");
        txtContrasena.setText("");
        txtConfirmContra.setText("");
        cmbCargo.setSelectedIndex(0);
        
        btnModificar.setEnabled(false);
        btnRegistrar.setEnabled(true);
        txtNombre.setEditable(true);
        txtNombre.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        System.out.println("cargo : "+cmbCargo.getSelectedItem());
        cambiarImagen(cmbCargo.getSelectedIndex());
    }//GEN-LAST:event_cmbCargoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separador;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarContrasena;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblConfirmar;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTextContra;
    private javax.swing.JPasswordField txtConfirmContra;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
