
package controller;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Usuario;
import utils.IconUtils;
import vista.FrmMenu;

/* 🚀 Developed by NelsonJGP */
public class DaoUsuario {
    private Negocio nlogin;

    public DaoUsuario(Negocio nlogin) {
        this.nlogin = nlogin;
    }
    
    public String validarEntradaDeDatos(String usuario, String contrasena, JLabel errorUs, JLabel errorCon) {
        StringBuilder mensaje = new StringBuilder();

        if (usuario.isEmpty()) {
            mensaje.append("Falta Usuario\n");
            IconUtils.cambiarIconoPersonalizado("/images/infoerror.png", errorUs, 20, 20);
        } else {
            errorUs.setIcon(null);
        }

        if (contrasena.isEmpty()) {
            mensaje.append("Falta Contraseña\n");
            IconUtils.cambiarIconoPersonalizado("/images/infoerror.png", errorCon, 20, 20);
        } else {
            errorCon.setIcon(null);
        }

        return mensaje.toString().trim();
    }

    public void processLogin(String usuario, String contrasena, JFrame aaaa) {
        Usuario userdato = nlogin.getTablaLogin().obtenerValorTabHash(usuario);

        if (userdato != null) {
            if (contrasena.equals(userdato.getContraseña())) {
                nlogin.setCargoUsuarioLogin(userdato.getCargo());
                new FrmMenu(nlogin).setVisible(true);
                aaaa.dispose();
            } else {
                showErrorMessage("Contraseña incorrecta", "La Contraseña no coincide");
            }
        } else {
            showErrorMessage("El usuario no existe", "Usuario no encontrado");
        }
    }

    public void showErrorMessage(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
    }
}
