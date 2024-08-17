
package utils;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/* 🚀 Developed by NelsonJGP */
public class IconUtils {
    
    public static void cambiarIconoPersonalizado(String imagePath, JLabel iconoMod, int ancho, int alto) {
        URL resource = IconUtils.class.getResource(imagePath);
        if (resource != null) {
            ImageIcon iconLogo = new ImageIcon(resource);
            Image image = iconLogo.getImage();
            Image imgRescalado = image.getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH);
            iconoMod.setIcon(new ImageIcon(imgRescalado));
        } else {
            System.err.println("No se pudo cargar la imagen: " + imagePath);
        }
    }
}
