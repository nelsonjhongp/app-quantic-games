
package vista;

import controller.Negocio;
import estructuradatos.TablaHash;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Usuario;
import vista.FrmUsuarios.*;

/*@author Nelson*/
public class userMostrar extends javax.swing.JPanel implements UserRegistroListener {
    Negocio obj;
    String cargoAhora = "Administrador";
    private UserMostrarListener listenerMost;
    public userMostrar(Negocio principal) {
        initComponents();
        this.obj = principal;
        muestra();
        lblCargo.setText(cargoAhora);
    }

     public void setUserMostrarListener(UserMostrarListener listenerMost) {
        this.listenerMost = listenerMost;
    }
    
    void muestra(){
        // Obtener el DefaultTableModel del JTable
        DefaultTableModel dtm = (DefaultTableModel) tablaUsuarios.getModel();
        dtm.setRowCount(0);
        
        for (TablaHash.EntradaHash entrada : obj.entradaLogin()) {
            TablaHash.EntradaHash actual = entrada;
            while (actual != null) {
                Usuario ush = actual.getUsuario();
                dtm.addRow(new Object[]{actual.getClave(), ocultarContraseña(ush.getContraseña()), ush.getCargo(), ush.getFechaCreacion(), ush.getFechaModificacion()});
                actual = actual.getSiguiente();
            }
        }
        
        // Mostrar todos los datos de usuarios en el JTable
        /*for (Map.Entry<String, Usuario> entry : obj.getTablaLoginV4().entrySet()) {
            String nombreUsuario = entry.getKey();
            Usuario usuario = entry.getValue();

            // Agregar una fila al modelo de la tabla con los datos del usuario
            dtm.addRow(new Object[]{nombreUsuario, ocultarContraseña(usuario.getContraseña()), usuario.getCargo(), usuario.getFechaCreacion(), usuario.getFechaModificacion()});
        }*/
    }
    
    boolean mostrar=false;
    String ocultarContraseña(String contra){
        if (cargoAhora.equals("Administrador") && mostrar) {
            return contra;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < contra.length(); i++) {
                sb.append("*");
            }
            return sb.toString();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnEnviRegis = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblCargo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnEliminar = new javax.swing.JButton();

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Usuario", "Contraseña", "Cargo", "FecCrea", "FechModif"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        btnEnviRegis.setText("Modificar en Registro");
        btnEnviRegis.setEnabled(false);
        btnEnviRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviRegisActionPerformed(evt);
            }
        });

        btnMostrar.setText("NO");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Mostrar Contraseñas :");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblCargo.setText("Default");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnEnviRegis)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviRegis)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviRegisActionPerformed
        String nombre = tablaUsuarios.getValueAt(fila, 0).toString();
        String cargo = tablaUsuarios.getValueAt(fila, 2).toString();
        
        // Notificar al listener con el dato
        if (listenerMost != null) {
            listenerMost.modificaRegistro(nombre,cargo);
        }
    }//GEN-LAST:event_btnEnviRegisActionPerformed
    int fila = 0;
    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        fila = tablaUsuarios.getSelectedRow();
        btnEnviRegis.setEnabled(true);
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_tablaUsuariosMouseClicked
    
    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if (mostrar) {
            btnMostrar.setText("NO");
            mostrar = false;
        } else {
            btnMostrar.setText("SI");
            mostrar = true;
        }
        muestra();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar?", "Confirmación", JOptionPane.YES_NO_OPTION);
        boolean admin = false;
        if (tablaUsuarios.getValueAt(fila, 2).toString().equals("Administrador")) {
            JOptionPane.showMessageDialog(null, "No se puede eliminar este usuario (Administrador).", "Error", JOptionPane.ERROR_MESSAGE);
            admin = true;
        } else {
            if (confirmacion == JOptionPane.YES_OPTION) {
                // El usuario ha confirmado la eliminación
                obj.getTablaLogin().eliminarTabHash(tablaUsuarios.getValueAt(fila, 0).toString());
                //obj.getTablaLoginV4().remove(tablaUsuarios.getValueAt(fila, 0).toString());
                muestra();
                btnEliminar.setEnabled(false);
                btnEnviRegis.setEnabled(false);
                JOptionPane.showMessageDialog(null, "El usuario se eliminó correctamente.");
            } else {
                // El usuario ha cancelado la eliminación
                JOptionPane.showMessageDialog(null, "La eliminación del usuario se canceló.");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaUsuariosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseReleased
        tablaUsuariosMouseClicked(null);
    }//GEN-LAST:event_tablaUsuariosMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnviRegis;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables

    @Override
    public void muestraRegistro() {
        muestra();
    }
}
