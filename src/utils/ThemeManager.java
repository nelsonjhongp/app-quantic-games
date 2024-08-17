
package utils;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/* 🚀 Developed by NelsonJGP */
public class ThemeManager {
    private static final List<JFrame> frames = new ArrayList<>();
    private static Image icon;

    static {
        // Cargar el ícono desde la ruta especificada
        String iconPath = "/images/iconLogo.png";  // Ajusta la ruta según tu estructura de proyectos
        icon = Toolkit.getDefaultToolkit().getImage(ThemeManager.class.getResource(iconPath));
    }
    
    private static void updateAllFrames() {
        for (JFrame frame : frames) {
            SwingUtilities.updateComponentTreeUI(frame);
            frame.setIconImage(icon);  // Aplicar el ícono a cada frame registrado
        }
    }
    
    public static void applyTheme() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
            updateAllFrames();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }
    
    public static void registerFrame(JFrame frame) {
        frames.add(frame);
        frame.setIconImage(icon);  // Aplicar el ícono al frame registrado
    }
}
