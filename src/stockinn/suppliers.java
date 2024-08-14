/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package stockinn;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author pc
 */
public class suppliers extends javax.swing.JInternalFrame {

    /**
     * Creates new form suppliers
     */
    public suppliers() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane (null);
        loadProductData();
        
    }

    private void loadProductData() {
        String query = "SELECT supplierName,supplierEmail,supplierContact,supplierType FROM products";

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/godamdb", "root", "lamakhu");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                Object[] row = {
                    rs.getString("supplierName"),
                    rs.getString("supplierEmail"),
                    rs.getString("supplierContact"),
                    rs.getString("supplierType"),
                };
                model.addRow(row);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading product data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    private void updateSupplierData(String oldSupplierName, String newSupplierName, String newSupplierEmail, String newSupplierContact, String newSupplierType) {
    String query = "UPDATE products SET supplierName = ?, supplierEmail = ?, supplierContact = ?, supplierType = ? WHERE supplierName = ?";

    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/godamdb", "root", "lamakhu");
         java.sql.PreparedStatement pst = con.prepareStatement(query)) {

        // Set the parameters for the SQL query
        pst.setString(1, newSupplierName);
        pst.setString(2, newSupplierEmail);
        pst.setString(3, newSupplierContact);
        pst.setString(4, newSupplierType);
        pst.setString(5, oldSupplierName);

        // Execute the update
        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Supplier info updated successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "No supplier found with the given name.", "Error", JOptionPane.WARNING_MESSAGE);
        }

        // Refresh the table data
        loadProductData();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error updating supplier data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); // Print the stack trace for debugging
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        edit_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Suppliers Name", "Suppliers Email", "Supplier Contact", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        edit_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit.png"))); // NOI18N
        edit_button.setText("  EDIT");
        edit_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        edit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_buttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/error.png"))); // NOI18N
        jLabel1.setText("Suppleirs Cannot be deleted here:");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(edit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(edit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_buttonActionPerformed
                                            
    int selectedRow = jTable1.getSelectedRow();

    if (selectedRow != -1) {
        // Retrieve the current data from the selected row
        String supplierName = (String) jTable1.getValueAt(selectedRow, 0);
        String supplierEmail = (String) jTable1.getValueAt(selectedRow, 1);
        String supplierContact = (String) jTable1.getValueAt(selectedRow, 2);
        String supplierType = (String) jTable1.getValueAt(selectedRow, 3);

        // Prompt user to enter new values
        String newSupplierName = JOptionPane.showInputDialog(this, "Enter new Supplier Name:", supplierName);
        String newSupplierEmail = JOptionPane.showInputDialog(this, "Enter new Supplier Email:", supplierEmail);
        String newSupplierContact = JOptionPane.showInputDialog(this, "Enter new Supplier Contact:", supplierContact);
        String newSupplierType = JOptionPane.showInputDialog(this, "Enter new Supplier Type:", supplierType);

        // Confirm if the user wants to proceed with the update
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to update the supplier details?", "Confirm Update", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            // Update the supplier data in the database
            updateSupplierData(supplierName, newSupplierName, newSupplierEmail, newSupplierContact, newSupplierType);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to edit.", "Error", JOptionPane.WARNING_MESSAGE);
    }


    }//GEN-LAST:event_edit_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
