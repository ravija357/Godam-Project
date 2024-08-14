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
public class product_details extends javax.swing.JInternalFrame {

    /**
     * Creates new form product_details
     */
    public product_details() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane (null);
        loadProductData();
    }
    private void loadProductData() {
        String query = "SELECT productCode, productName, rate, quantity, supplierName, quantity * rate AS totalAmount FROM products";

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/godamdb", "root", "lamakhu");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("productCode"),
                    rs.getString("productName"),
                    rs.getFloat("rate"),
                    rs.getInt("quantity"),
                    rs.getString("supplierName"),
                    rs.getFloat("totalAmount")
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



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        delete_button = new javax.swing.JButton();
        edit_button = new javax.swing.JButton();
        sell_button = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product Code", "Product Name", "Rate Per Unit", "Quantity", "Suppliers", "Total amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 718, 310));

        delete_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete.png"))); // NOI18N
        delete_button.setText("DELETE");
        delete_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        edit_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit.png"))); // NOI18N
        edit_button.setText("  EDIT");
        edit_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        edit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_buttonActionPerformed(evt);
            }
        });

        sell_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sell_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sell.png"))); // NOI18N
        sell_button.setText("SELL");
        sell_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        sell_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sell_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(edit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(sell_button, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sell_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 321, 720, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   //private void updateProductData(int productCode, String productName, int quantity, float rate, String supplierName) {
//    String query = "UPDATE products SET productCode=?,productName = ?, quantity = ?, rate = ?, supplierName = ? WHERE productCode = ?";
//
//    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/godamdb", "root", "lamakhu");
//        java.sql.PreparedStatement pst = con.prepareStatement(query)) {
//
//        // Set the parameters for the SQL query
//        pst.setInt(0, productCode);
//        pst.setString(1, productName);
//        pst.setInt(2, quantity);
//        pst.setFloat(3, rate);
//        pst.setString(4, supplierName);
//
//        // Execute the update
//        int rowsAffected = pst.executeUpdate();
//        if (rowsAffected > 0) {
//            JOptionPane.showMessageDialog(this, "Product updated successfully!");
//        } else {
//            JOptionPane.showMessageDialog(this, "No product found with the given code.", "Error", JOptionPane.WARNING_MESSAGE);
//        }
//
//        // Refresh the table data
//        loadProductData();
//
//    } catch (SQLException e) {
//        JOptionPane.showMessageDialog(this, "Error updating product data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        e.printStackTrace(); // Print the stack trace for debugging
//    }
//}

private void updateProductData(int productCode, String productName, int quantity, float rate, String supplierName) {
    String query = "UPDATE products SET productName = ?, quantity = ?, rate = ?, supplierName = ? WHERE productCode = ?";

    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/godamdb", "root", "lamakhu");
         java.sql.PreparedStatement pst = con.prepareStatement(query)) {

        // Set the parameters for the SQL query
        pst.setString(1, productName);
        pst.setInt(2, quantity);
        pst.setFloat(3, rate);
        pst.setString(4, supplierName);
        pst.setInt(5, productCode);  // productCode is used in WHERE clause

        // Execute the update
        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Product updated successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "No product found with the given code.", "Error", JOptionPane.WARNING_MESSAGE);
        }

        // Refresh the table data
        loadProductData();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error updating product data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); // Print the stack trace for debugging
    }
}

    private void edit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_buttonActionPerformed
        // TODO add your handling code here:                                        
    int selectedRow = jTable1.getSelectedRow();

    if (selectedRow != -1) {
        // Retrieve the current data from the selected row
        int productCode = (Integer) jTable1.getValueAt(selectedRow, 0);
        String productName = (String) jTable1.getValueAt(selectedRow, 1);
        float rate = (Float) jTable1.getValueAt(selectedRow, 2);
        int quantity = (Integer) jTable1.getValueAt(selectedRow, 3);
        String supplierName = (String) jTable1.getValueAt(selectedRow, 4);

        // Create a dialog or form for editing (this is a simple example; you might want to use a more sophisticated approach)
        String newProductName = JOptionPane.showInputDialog(this, "Enter new Product Name:", productName);
        String newRateStr = JOptionPane.showInputDialog(this, "Enter new Rate Per Unit:", rate);
        String newQuantityStr = JOptionPane.showInputDialog(this, "Enter new Quantity:", quantity);
        String newSupplierName = JOptionPane.showInputDialog(this, "Enter new Supplier Name:", supplierName);

        try {
            float newRate = Float.parseFloat(newRateStr);
            int newQuantity = Integer.parseInt(newQuantityStr);

            // Update the product data in the database
            updateProductData(productCode, newProductName, newQuantity, newRate, newSupplierName);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid number format entered.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to edit.", "Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_edit_buttonActionPerformed
    
    
    
    private void deleteProduct(int productCode) {
    String query = "DELETE FROM products WHERE productCode = ?";

    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/godamdb", "root", "lamakhu");
         java.sql.PreparedStatement pst = con.prepareStatement(query)) {

        // Set the parameter for the SQL query
        pst.setInt(1, productCode);

        // Execute the delete
        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Product deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "No product found with the given code.", "Error", JOptionPane.WARNING_MESSAGE);
        }

        // Refresh the table data
        loadProductData();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error deleting product: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); // Print the stack trace for debugging
    }
    }
    
    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        // TODO add your handling code here:
            int selectedRow = jTable1.getSelectedRow();

    if (selectedRow != -1) {
        // Retrieve the product code from the selected row
        int productCode = (Integer) jTable1.getValueAt(selectedRow, 0);

        // Confirm deletion
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the selected product?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            // Perform the deletion
            deleteProduct(productCode);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void sell_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sell_buttonActionPerformed
    int selectedRow = jTable1.getSelectedRow();

    if (selectedRow != -1) {
        int productCode = (Integer) jTable1.getValueAt(selectedRow, 0);
        String productName = (String) jTable1.getValueAt(selectedRow, 1);
        float rate = (Float) jTable1.getValueAt(selectedRow, 2);
        int quantity = (Integer) jTable1.getValueAt(selectedRow, 3);
        String supplierName = (String) jTable1.getValueAt(selectedRow, 4); // Ensure this matches your table schema
        float totalAmount  = (Float) jTable1.getValueAt(selectedRow, 5);

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/godamdb", "root", "lamakhu");
            
            // Make sure 'supplierName' and 'total_amount' columns exist in the 'sales' table or adjust the column names accordingly
            String insertQuery = "INSERT INTO sales (productCode, productName, rate, quantity, supplierName, total_amount) VALUES (?, ?, ?, ?, ?, ?)";
            java.sql.PreparedStatement pstInsert = con.prepareStatement(insertQuery);
            pstInsert.setInt(1, productCode);
            pstInsert.setString(2, productName);
            pstInsert.setFloat(3, rate);
            pstInsert.setInt(4, quantity);
            pstInsert.setString(5, supplierName); // Ensure this matches your table schema
            pstInsert.setFloat(6, totalAmount);
            pstInsert.executeUpdate();

            String deleteQuery = "DELETE FROM products WHERE productCode = ?";
            java.sql.PreparedStatement pstDelete = con.prepareStatement(deleteQuery);
            pstDelete.setInt(1, productCode);
            pstDelete.executeUpdate();

            JOptionPane.showMessageDialog(this, "Product moved to sales successfully!");
            loadProductData();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error moving product to sales: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to sell.", "Error", JOptionPane.WARNING_MESSAGE);
    }

    }//GEN-LAST:event_sell_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_button;
    private javax.swing.JButton edit_button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton sell_button;
    // End of variables declaration//GEN-END:variables
}
