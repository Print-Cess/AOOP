/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paysys;
import PaySys_Classes.Employee;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author Giann Gernale
 */
public class PaySys_Login extends javax.swing.JFrame {
    static String username,password;
    /**
     * Creates new form PaySys_Login
     */
    public PaySys_Login() {
        initComponents();
        scaleImage();
        scaleImage1();
    }
    private void scaleImage(){
        ImageIcon icon = new ImageIcon("C:/Users/Giann Gernale/Documents/NetBeansProjects/PaySys/Motorph_logo.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);

    }
    private void scaleImage1(){
        ImageIcon icon = new ImageIcon("C:/Users/Giann Gernale/Documents/NetBeansProjects/PaySys/User.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label1.getWidth(), label1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label1.setIcon(scaledIcon);

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
        jPanel2 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        passwordfield = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();
        ShowPassword = new javax.swing.JCheckBox();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));
        jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 110, 110));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Username");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Password ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));
        jPanel2.add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 250, -1));

        passwordfield.setText("00000");
        passwordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordfieldActionPerformed(evt);
            }
        });
        jPanel2.add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 250, -1));

        loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(0, 102, 51));
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel2.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 120, -1));

        closebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        closebtn.setForeground(new java.awt.Color(153, 0, 0));
        closebtn.setText("Exit");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        jPanel2.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 120, -1));

        ShowPassword.setText("Show Password");
        ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(ShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
       username = usernamefield.getText();
       password = String.valueOf(passwordfield.getPassword());
        String Position;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrolldb", "root", "user123"); Statement statement = con.createStatement()) {

            // Prepare a parameterized query for login validation
            String sql = "SELECT * FROM login WHERE username = ? AND password = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet RS = preparedStatement.executeQuery();

            // Check if a valid login is found
            if (RS.next()) {
                String employeeID = RS.getString("loginID"); // Assuming loginID maps to EmployeeID

                // Prepare a query to fetch employee details based on retrieved employeeID
                sql = "SELECT * FROM employee WHERE employeeID = ?";
                preparedStatement = con.prepareStatement(sql);
                preparedStatement.setString(1, employeeID);

                ResultSet employeeRS = preparedStatement.executeQuery();

                // Check if employee data is found
                if (employeeRS.next()) {
                    // Populate the Employee class object with retrieved data
                    Employee employee = new Employee();
                    employee.setEmployeeID(employeeRS.getString("employeeID"));
                    employee.setFirstName(employeeRS.getString("firstName"));
                    employee.setLastName(employeeRS.getString("lastName"));
                    employee.setBirthday(employeeRS.getString("birthday"));  // Assuming a "birthday" column exists
                    employee.setAddress(employeeRS.getString("address"));  // Assuming an "address" column exists
                    employee.setPhoneNum(employeeRS.getString("phoneNumber"));  
                    employee.setSSS(employeeRS.getString("sssNumber")); 
                    employee.setPhilHealth(employeeRS.getString("philHealthnumber"));  
                    employee.setTIN(employeeRS.getString("tinNumber"));  
                    employee.setPagIbig(employeeRS.getString("pagIbigNumber"));  
                    employee.setPosition(employeeRS.getString("position")); 
                    employee.setBasicSal(employeeRS.getDouble("basicSalary"));  
                    employee.setGrossSemiMonthly(employeeRS.getDouble("grossSemiMonthlyRate"));  
                    employee.setHourlyRate(employeeRS.getDouble("hourlyRate"));  
                   
                    PaySys_Homepage HomePage = new PaySys_Homepage();
                    HomePage.setVisible(true);
                    HomePage.setUserName(employee.getFirstName());
                    HomePage.setEmployeeDetails(employee);
                    JOptionPane.showMessageDialog(this, "Login Successful!");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Employee data not found for loginID: " + employeeID, "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Username or Password is incorrect. Try Again.", "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordActionPerformed
        // TODO add your handling code here:
        if (ShowPassword.isSelected()){
            passwordfield.setEchoChar((char)0);
        }else{
            passwordfield.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPasswordActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closebtnActionPerformed

    private void passwordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordfieldActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaySys_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaySys_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaySys_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaySys_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaySys_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ShowPassword;
    private javax.swing.JButton closebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables
}
