/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controller.Negocio;
import model.Clientes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/*@author Nelson*/
public class MenuClientes extends javax.swing.JPanel {
    Negocio obj;
    public MenuClientes(Negocio principal) {
        initComponents();
        this.obj = principal;
        muestra();
    }
    
    private void limpiar(){
        txtID.setText("");
        txtNombres.setText("");
        txtDNI.setText("");
        txtEdad.setText("");
    }
    private void muestra(){
        DefaultTableModel dt=(DefaultTableModel)tblClientes.getModel();
        dt.setRowCount(0);
        for (Clientes cl:obj.mostrarClientes()) {
            Object v[]={cl.getId(),cl.getNombre(),cl.getDni(),
                        cl.getEdad(),cl.getActivo()};
                        dt.addRow(v);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        TituloCliente = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        NomyAp1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        DNI = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        Edad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnAnadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        cmbOrdenar = new javax.swing.JComboBox<>();
        btnReiniciar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombres", "DNI", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 750, 360));

        TituloCliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TituloCliente.setText("Cliente");
        jPanel1.add(TituloCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, -1));

        ID.setText("ID");
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 20, 20));

        txtID.setEnabled(false);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 150, -1));

        NomyAp1.setText("Nombres y Apellidos");
        jPanel1.add(NomyAp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 210, -1));

        DNI.setText("DNI");
        jPanel1.add(DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));
        jPanel1.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 100, -1));

        Edad.setText("Edad");
        jPanel1.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 100, -1));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 100, -1));

        btnAnadir.setText("Agregar");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 100, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 100, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 80, 30));

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 100, -1));

        cmbOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordenar x Edad (Shell)", "Ordenar x Nombre (Bubble)", "Ordenar x DNI (QuickShort)", "Ordenar x ID (Recursividad)" }));
        cmbOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrdenarActionPerformed(evt);
            }
        });
        jPanel1.add(cmbOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 190, -1));

        btnReiniciar.setText("Mostrar Todo");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 140, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MenuBackground.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        int fila=tblClientes.getSelectedRow();
        txtID.setText(tblClientes.getValueAt(fila, 0).toString());
        txtNombres.setText(tblClientes.getValueAt(fila, 1).toString());
        txtDNI.setText(tblClientes.getValueAt(fila, 2).toString());
        txtEdad.setText(tblClientes.getValueAt(fila, 3).toString());
        
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnAnadir.setEnabled(false);
    }//GEN-LAST:event_tblClientesMouseClicked

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        String nombre = txtNombres.getText();
        int dni = Integer.parseInt(txtDNI.getText());
        int edad = Integer.parseInt(txtEdad.getText());
        int activo = 1;
        obj.nuevoCliente(nombre, dni, edad, activo);
        
        JOptionPane.showMessageDialog(null,"Registro guardado");
        limpiar();
        muestra();

        btnAnadir.setEnabled(false);
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Seguro de Eliminar","Borrar",
                JOptionPane.YES_NO_OPTION)==0){
            obj.eliminarCliente(Integer.parseInt(txtID.getText()));
            muestra();
            txtNombres.setText("");
            txtDNI.setText("");
            txtEdad.setText("");
            btnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        for (int i = 0; i <= tblClientes.getRowCount()-1; i++) {
            System.out.print("("+i+") - ");
            System.out.print(tblClientes.getValueAt(i, 0));
            System.out.println("");
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Clientes cl = new Clientes();
        cl.setId(Integer.parseInt(txtID.getText()));
        cl.setNombre(txtNombres.getText());
        cl.setDni(Integer.parseInt(txtDNI.getText()));
        cl.setEdad(Integer.parseInt(txtEdad.getText()));
        obj.modificarCliente(cl);
        muestra();
        btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtID.setText("Autogenerados");
        txtNombres.setText("");
        txtDNI.setText("");
        txtEdad.setText("");
        //requestFocus es para que el cursor vaya defrente al cliente!!
        txtNombres.requestFocus();
        muestra();
        btnAnadir.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void cmbOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrdenarActionPerformed
        String Value=cmbOrdenar.getSelectedItem().toString();
        int valueint=cmbOrdenar.getSelectedIndex();
        System.out.println(Value+" - "+valueint);
        switch (cmbOrdenar.getSelectedIndex()) {
            case 0: ordenarEdad(); break;
            case 1: ordenarNombres(); break;
            case 2: ordenarDNI();break;
            case 3: ordenarID();break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_cmbOrdenarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        muestra();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    void ordenarEdad(){
        // Obtener el TableModel asociado al JTable
        TableModel model = tblClientes.getModel();

        // Índice de la columna a ordenar (en este caso, la columna 4)
        int columnToSort = 3;

        // Algoritmo de selección para ordenar el TableModel según la columna elegida
        for (int i = 0; i < model.getRowCount() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < model.getRowCount(); j++) {
                Comparable<Object> minValue = (Comparable<Object>) model.getValueAt(minIndex, columnToSort);
                Comparable<Object> currentValue = (Comparable<Object>) model.getValueAt(j, columnToSort);
                if (currentValue.compareTo(minValue) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                for (int k = 0; k < model.getColumnCount(); k++) {
                    Object temp = model.getValueAt(i, k);
                    model.setValueAt(model.getValueAt(minIndex, k), i, k);
                    model.setValueAt(temp, minIndex, k);
                }
            }
        }

        // Actualizar el JTable con el TableModel ordenado
        tblClientes.setModel(model);
    }
    
    
    
    void ordenarNombres(){
        // Obtener el TableModel asociado al JTable
        TableModel model = tblClientes.getModel();

        // Índice de la columna a ordenar (en este caso, la columna 4)
        int columnToSort = 1;

        // Algoritmo de burbuja para ordenar el TableModel según la columna elegida
        for (int i = 0; i < model.getRowCount() - 1; i++) {
            for (int j = 0; j < model.getRowCount() - i - 1; j++) {
                Comparable<Object> value1 = (Comparable<Object>) model.getValueAt(j, columnToSort);
                Comparable<Object> value2 = (Comparable<Object>) model.getValueAt(j + 1, columnToSort);
                if (value1.compareTo(value2) > 0) {
                    for (int k = 0; k < model.getColumnCount(); k++) {
                        Object temp = model.getValueAt(j, k);
                        model.setValueAt(model.getValueAt(j + 1, k), j, k);
                        model.setValueAt(temp, j + 1, k);
                    }
                }
            }
        }

        // Actualizar el JTable con el TableModel ordenado
        tblClientes.setModel(model);
    }
    
    void ordenarDNI() {
        TableModel model = tblClientes.getModel();
        int columnToSort = 2;
        int rowCount = model.getRowCount();
        quicksort(model, columnToSort, 0, rowCount - 1);
        tblClientes.setModel(model);
    }

    void quicksort(TableModel model, int columnToSort, int low, int high) {
        if (low < high) {
        int pivotIndex = partition(model, columnToSort, low, high);
        quicksort(model, columnToSort, low, pivotIndex - 1);
        quicksort(model, columnToSort, pivotIndex + 1, high);
        }
    }

    int partition(TableModel model, int columnToSort, int low, int high) {
    Comparable<Object> pivot = (Comparable<Object>) model.getValueAt(high, columnToSort);
    int i = low - 1;
    for (int j = low; j < high; j++) {
        Comparable<Object> currentValue = (Comparable<Object>) model.getValueAt(j, columnToSort);
        if (currentValue.compareTo(pivot) <= 0) {
            i++;
            swapRows(model, i, j);
        }
    }
    swapRows(model, i + 1, high);
    return i + 1;
    }

    void swapRows(TableModel model, int i, int j) {
        int columnCount = model.getColumnCount();
        for (int k = 0; k < columnCount; k++) {
            Object temp = model.getValueAt(i, k);
            model.setValueAt(model.getValueAt(j, k), i, k);
            model.setValueAt(temp, j, k);
        }
    }
    /*
    void ordenarID(){
        TableModel model = tblClientes.getModel();
        int columnToSort = 0;
        for (int i = 0; i < model.getRowCount() - 1; i++) {
            for (int j = 0; j < model.getRowCount() - i - 1; j++) {
                Comparable<Object> value1 = (Comparable<Object>) model.getValueAt(j, columnToSort);
                Comparable<Object> value2 = (Comparable<Object>) model.getValueAt(j + 1, columnToSort);
                if (value1.compareTo(value2) > 0) {
                    for (int k = 0; k < model.getColumnCount(); k++) {
                        Object temp = model.getValueAt(j, k);
                        model.setValueAt(model.getValueAt(j + 1, k), j, k);
                        model.setValueAt(temp, j + 1, k);
                    }
                }
            }
        }
        tblClientes.setModel(model);
    }
    */
    void ordenarID() {
        TableModel model = tblClientes.getModel();
        int columnToSort = 0;
        int rowCount = model.getRowCount();
        ordenarRecursivo(model, columnToSort, rowCount, 0);
    }
    
    void ordenarRecursivo(TableModel model, int columnToSort, int rowCount, int startIndex) {
        
        if (startIndex >= rowCount - 1) {
            tblClientes.setModel(model);
            return;
        }
        
        int minIndex = startIndex;
        for (int j = startIndex + 1; j < rowCount; j++) {
            Comparable<Object> minValue = (Comparable<Object>) model.getValueAt(minIndex, columnToSort);
            Comparable<Object> currentValue = (Comparable<Object>) model.getValueAt(j, columnToSort);
            if (currentValue.compareTo(minValue) < 0) {
                minIndex = j;
            }
        }
        if (minIndex != startIndex) {
            for (int k = 0; k < model.getColumnCount(); k++) {
                Object temp = model.getValueAt(startIndex, k);
                model.setValueAt(model.getValueAt(minIndex, k), startIndex, k);
                model.setValueAt(temp, minIndex, k);
            }
        }
        ordenarRecursivo(model, columnToSort, rowCount, startIndex+1);
        //ordenarRecursivo(model, columnToSort, rowCount, startIndex + 1);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DNI;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel NomyAp1;
    private javax.swing.JLabel TituloCliente;
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JComboBox<String> cmbOrdenar;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
