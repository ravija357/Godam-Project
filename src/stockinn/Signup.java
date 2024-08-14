package stockinn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class Signup extends javax.swing.JFrame {

    public Signup() {
        initComponents();
    }

    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Signup_button = new javax.swing.JButton();
        S_to_L_label = new javax.swing.JButton();
        ShowP_checkbox = new javax.swing.JCheckBox();
        Uname_textfield = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        business_name_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        CPassword_label = new javax.swing.JLabel();
        business_name_textfield = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jConPasswordField2 = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        sigup_bg = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(117, 53, 147));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1);
        jPanel1.setBounds(1433, 81, 0, 0);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(463, 6, 870, 0);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(463, 0, 436, 0);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("   ..SignUp 😊..");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        jLabel4.setOpaque(true);
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 240, -1));

        Signup_button.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        Signup_button.setText("SignUp");
        Signup_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        Signup_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Signup_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(Signup_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 428, 356, 36));

        S_to_L_label.setBackground(new java.awt.Color(102, 102, 102));
        S_to_L_label.setForeground(new java.awt.Color(255, 255, 255));
        S_to_L_label.setText("Already have an account? Login");
        S_to_L_label.setBorder(null);
        S_to_L_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        S_to_L_label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_to_L_labelActionPerformed(evt);
            }
        });
        jPanel4.add(S_to_L_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 476, -1, -1));

        ShowP_checkbox.setBackground(new java.awt.Color(255, 255, 255));
        ShowP_checkbox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ShowP_checkbox.setText("Show Password");
        ShowP_checkbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        ShowP_checkbox.setOpaque(true);
        ShowP_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowP_checkboxActionPerformed(evt);
            }
        });
        jPanel4.add(ShowP_checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 324, 152, 29));

        Uname_textfield.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Uname_textfield.setForeground(new java.awt.Color(255, 255, 255));
        Uname_textfield.setText("Username :");
        jPanel4.add(Uname_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 146, 93, 22));

        UsernameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel4.add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 145, 233, -1));

        business_name_label.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        business_name_label.setForeground(new java.awt.Color(255, 255, 255));
        business_name_label.setText("Business Name:");
        jPanel4.add(business_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 189, 125, 22));

        password_label.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        password_label.setForeground(new java.awt.Color(255, 255, 255));
        password_label.setText("Password:");
        jPanel4.add(password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 224, 125, 22));

        CPassword_label.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        CPassword_label.setForeground(new java.awt.Color(255, 255, 255));
        CPassword_label.setText("Confirm Password:");
        jPanel4.add(CPassword_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 268, -1, 22));

        business_name_textfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel4.add(business_name_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 185, 233, -1));

        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel4.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 223, 233, -1));

        jConPasswordField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel4.add(jConPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 267, 233, -1));

        getContentPane().add(jPanel4);
        jPanel4.setBounds(200, 10, 440, 530);

        sigup_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/signup_bg.png"))); // NOI18N
        sigup_bg.setText("jLabel1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sigup_bg, javax.swing.GroupLayout.PREFERRED_SIZE, 850, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sigup_bg, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 850, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents


       
    private void Signup_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Signup_buttonActionPerformed
        // TODO add your handling code here:
        String username = UsernameTextField.getText(); // Assuming jTextField1 is where the username is entered
        String businessName = business_name_textfield.getText(); // Assuming business_name_tesxtfield is the correct field name for business name
        String password = new String(jPasswordField1.getPassword()); // Convert JPasswordField to String
        String confirmPassword = new String(jConPasswordField2.getPassword()); // Convert JPasswordField to String

        //Validate is null entries are tempted
        if (username.isEmpty() || businessName.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled out!");
            return;
        }
        // Validate if the passwords match
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match!");
            return;
        }
        //Validate if password <8
        if (password.length() < 8) {
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long!");
            return;
        }
        
        // Establish a connection to the database
        Connection conn = connectDatabase();
        if (conn != null) {
            try {
                boolean usernameExists = false;
                boolean businessNameExists = false;

                // Check if the username already exists
                String checkUsernameSql = "SELECT COUNT(*) FROM users WHERE username=?";
                PreparedStatement checkUsernameStmt = conn.prepareStatement(checkUsernameSql);
                checkUsernameStmt.setString(1, username);
                ResultSet usernameResultSet = checkUsernameStmt.executeQuery(); // Corrected here
                if (usernameResultSet.next() && usernameResultSet.getInt(1) > 0) {
                    usernameExists = true;
                }

                // Check if the business name already exists
                String checkBusinessNameSql = "SELECT COUNT(*) FROM users WHERE businessname = ?";
                PreparedStatement checkBusinessNameStmt = conn.prepareStatement(checkBusinessNameSql);
                checkBusinessNameStmt.setString(1, businessName);
                ResultSet businessNameResultSet = checkBusinessNameStmt.executeQuery(); // Corrected here
                if (businessNameResultSet.next() && businessNameResultSet.getInt(1) > 0) {
                    businessNameExists = true;
                }

                if (usernameExists && businessNameExists) {
                    JOptionPane.showMessageDialog(this, "Username and Business Name already exist!");
                    return;
                } else if (usernameExists) {
                    JOptionPane.showMessageDialog(this, "Username already exists!");
                    return;
                } else if (businessNameExists) {
                    JOptionPane.showMessageDialog(this, "Business Name already exists!");
                    return;
                }
                // Insert user data into the database
                String sql = "INSERT INTO users (username, businessname, password, confirmpassword) VALUES (?, ?, ?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, username);
                pstmt.setString(2, businessName);
                pstmt.setString(3, password);
                pstmt.setString(4, confirmPassword);

                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Signup successful!");
                    // Redirect to login page
                    S_to_L_labelActionPerformed(evt);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error during signup: " + e.getMessage());
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Failed to close the database connection: " + e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_Signup_buttonActionPerformed

    private void ShowP_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowP_checkboxActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (ShowP_checkbox.isSelected()) {
            // Show password
            jPasswordField1.setEchoChar((char) 0);
            jConPasswordField2.setEchoChar((char) 0);
        } else {
            // Hide password
            jPasswordField1.setEchoChar('•');
            jConPasswordField2.setEchoChar('•');
        }
    }//GEN-LAST:event_ShowP_checkboxActionPerformed

    private void S_to_L_labelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_to_L_labelActionPerformed
        // TODO add your handling code here:
        Login Login = new Login();
        Login.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_S_to_L_labelActionPerformed

    private Connection connectDatabase() {
        Connection conn = null;
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/godamdb", "root","lamakhu");
            
      
            
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Database connection failed: " + e.getMessage());
        }
        return conn;
    }

     


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Signup().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPassword_label;
    private javax.swing.JButton S_to_L_label;
    private javax.swing.JCheckBox ShowP_checkbox;
    private javax.swing.JButton Signup_button;
    private javax.swing.JLabel Uname_textfield;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel business_name_label;
    private javax.swing.JTextField business_name_textfield;
    private javax.swing.JButton jButton3;
    private javax.swing.JPasswordField jConPasswordField2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel password_label;
    private javax.swing.JLabel sigup_bg;
    // End of variables declaration//GEN-END:variables
}
