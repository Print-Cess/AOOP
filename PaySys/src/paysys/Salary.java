/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paysys;

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Seirrah
 */
public final class Salary extends javax.swing.JFrame {
    private Connection Connect;
    /**
     * Creates new form Test
     * @throws java.sql.SQLException
     */
        public Salary() throws SQLException {
            initComponents();
            DatabaseConnection();
            ShowPayslipTable();
            MonthlySalary = new javax.swing.JComboBox<>();
            MonthlySalary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

            // Add action listener for the Combo Box
            MonthlySalary.addActionListener((java.awt.event.ActionEvent evt) -> {
            MonthlySalaryActionPerformed(evt);
            });
        }
        
        public void DatabaseConnection() {
            try {
                Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/payrollsystem_db", "root", "092403");
            } catch (SQLException ex) {
                Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        private void ShowPayslipTable() throws SQLException {
            int CountColumns;

            try {
                PreparedStatement Text = Connect.prepareStatement("SELECT * FROM salary ORDER BY EmployeeID");
                ResultSet TableResult = Text.executeQuery();

                ResultSetMetaData RSMD = TableResult.getMetaData();
                CountColumns = RSMD.getColumnCount();
                DefaultTableModel DefaultTable = (DefaultTableModel) PayslipTable.getModel();
                DefaultTable.setRowCount(0);

                while (TableResult.next()) {
                    Vector<String> VectorValue = new Vector<>();

                    for (int ii = 1; ii <= CountColumns; ii++) {
                        VectorValue.add(TableResult.getString(ii));
                    }
                    DefaultTable.addRow(VectorValue);
                }
            } 
            catch (SQLException e) {
                Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        // Helper method to convert month name to month index
    private int GetMonthIndex(String monthName) {
        return switch (monthName) {
            case "January" -> 1;
            case "February" -> 2;
            case "March" -> 3;
            case "April" -> 4;
            case "May" -> 5;
            case "June" -> 6;
            case "July" -> 7;
            case "August" -> 8;
            case "September" -> 9;
            case "October" -> 10;
            case "November" -> 11;
            case "December" -> 12;
            default -> 0;
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Default = new javax.swing.JPanel();
        Label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PayslipTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        AllSalary = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        Record = new javax.swing.JLabel();
        Leave = new javax.swing.JLabel();
        Overtime = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Request = new javax.swing.JLabel();
        Overview = new javax.swing.JLabel();
        Payslip = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Generate = new javax.swing.JLabel();
        Management = new javax.swing.JLabel();
        Salary = new javax.swing.JLabel();
        Profile = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        Employee = new javax.swing.JLabel();
        Attendance = new javax.swing.JLabel();
        MonthlySalary = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Default.setBackground(new java.awt.Color(255, 255, 255));

        Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Label.setText("Employee Dashboard");

        PayslipTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Start Date", "End Date", "Hours Worked", "Overtime Hours Worked", "Gross Income", "Net Income"
            }
        ));
        jScrollPane2.setViewportView(PayslipTable);

        jButton2.setText("Print Payslip");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        AllSalary.setText("Show All");
        AllSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllSalaryActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setText("Employee ID: 0000");

        jLabel2.setText("Full Name: Taylor Christian Tayengco");

        jLabel3.setText("Position: Chief Executive Officer");

        jLabel4.setText("Department: Executive Management");

        jLabel5.setText("Pay Period Start Date: 2024-09-24");

        jLabel6.setText("Pay Period End Date: 2024-09-24");

        jLabel7.setText("Total Hours Worked: 80 Hours");

        jLabel8.setText("Total Overtime Hours: 2 Hours");

        jLabel9.setText("SSS Contribution: Php 0000.00");

        jLabel10.setText("Philhealth Contribution: Php 0000.00");

        jLabel11.setText("Pag Ibig Contribution: Php 0000.00");

        jLabel12.setText("Withholding Tax: Php 0000.00");

        jLabel13.setText("Rice Subsidy: Php 0000.00");

        jLabel14.setText("Phone Allowance: Php 0000.00");

        jLabel15.setText("Clothing Allowance: Php. 0000.00");

        jLabel16.setText("Gross Income: Php 0000.00");

        jLabel17.setText("Total Deductions: Php 0000.00");

        jLabel18.setText("Net Income: Php 0000.00");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Signed By: Accounting Manager");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel16))
                .addGap(150, 150, 150)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel17))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19))
                    .addComponent(jLabel16))
                .addGap(20, 20, 20))
        );

        Time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/clock-three.png"))); // NOI18N
        Time.setText("Time In/Out");

        Record.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/calendar-lines.png"))); // NOI18N
        Record.setText("Record");

        Leave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/calendar-day.png"))); // NOI18N
        Leave.setText("Leave");

        Overtime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/calendar-clock.png"))); // NOI18N
        Overtime.setText("Overtime");

        Name.setBackground(new java.awt.Color(104, 107, 122));
        Name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/profile.png"))); // NOI18N
        Name.setText("Taylor Christian Tayengco");

        Request.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/calendar-pen.png"))); // NOI18N
        Request.setText("Request");

        Overview.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Overview.setText("Overview");

        Payslip.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Payslip.setText("Payslip");

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/house-window.png"))); // NOI18N
        Home.setText("Home");

        Generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/wallet-arrow.png"))); // NOI18N
        Generate.setText("Generate");

        Management.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Management.setText("Management");

        Salary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/credit-card-buyer.png"))); // NOI18N
        Salary.setText("Payslip");

        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/user.png"))); // NOI18N
        Profile.setText("Profile");

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/exit.png"))); // NOI18N
        Exit.setText("Sign Out");

        Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/users.png"))); // NOI18N
        Employee.setText("Employee");

        Attendance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Attendance.setText("Attendance");

        MonthlySalary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        MonthlySalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthlySalaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DefaultLayout = new javax.swing.GroupLayout(Default);
        Default.setLayout(DefaultLayout);
        DefaultLayout.setHorizontalGroup(
            DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefaultLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home)
                    .addComponent(Management)
                    .addComponent(Profile)
                    .addComponent(Employee)
                    .addComponent(Request)
                    .addComponent(Salary)
                    .addComponent(Attendance)
                    .addComponent(Time)
                    .addComponent(Record)
                    .addComponent(Leave)
                    .addComponent(Overtime)
                    .addComponent(Payslip)
                    .addComponent(Generate)
                    .addComponent(Exit)
                    .addComponent(Name)
                    .addComponent(Overview))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DefaultLayout.createSequentialGroup()
                        .addComponent(MonthlySalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AllSalary)
                        .addGap(98, 98, 98)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(DefaultLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Label)))
                .addGap(16, 16, 16))
        );
        DefaultLayout.setVerticalGroup(
            DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefaultLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DefaultLayout.createSequentialGroup()
                        .addComponent(Name)
                        .addGap(12, 12, 12)
                        .addComponent(Overview)
                        .addGap(12, 12, 12)
                        .addComponent(Home)
                        .addGap(18, 18, 18)
                        .addComponent(Management)
                        .addGap(12, 12, 12)
                        .addComponent(Profile)
                        .addGap(12, 12, 12)
                        .addComponent(Employee)
                        .addGap(12, 12, 12)
                        .addComponent(Request)
                        .addGap(12, 12, 12)
                        .addComponent(Salary)
                        .addGap(18, 18, 18)
                        .addComponent(Attendance)
                        .addGap(12, 12, 12)
                        .addComponent(Time)
                        .addGap(12, 12, 12)
                        .addComponent(Record)
                        .addGap(12, 12, 12)
                        .addComponent(Leave)
                        .addGap(12, 12, 12)
                        .addComponent(Overtime)
                        .addGap(18, 18, 18)
                        .addComponent(Payslip)
                        .addGap(12, 12, 12)
                        .addComponent(Generate)
                        .addGap(12, 12, 12)
                        .addComponent(Exit))
                    .addGroup(DefaultLayout.createSequentialGroup()
                        .addComponent(Label)
                        .addGap(63, 63, 63)
                        .addGroup(DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AllSalary)
                                .addComponent(MonthlySalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Default, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Default, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AllSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllSalaryActionPerformed

    }//GEN-LAST:event_AllSalaryActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void MonthlySalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthlySalaryActionPerformed
    String selectedMonth = (String) MonthlySalary.getSelectedItem();
    
    // Debugging statement to check method invocation
    System.out.println("MonthlySalaryActionPerformed triggered. Selected Month: " + selectedMonth);
    
    if (selectedMonth != null) {
        try {
            // Prepare and execute the SQL query
            String sqlQuery = "SELECT * FROM salary WHERE MID(`Start Date`, 6, 2) = ? ORDER BY EmployeeID";
            PreparedStatement stmt = Connect.prepareStatement(sqlQuery);
            
            // Convert month name to two-digit format ("01" for January, "02" for February, etc.)
            String monthNumber = String.format("%02d", GetMonthIndex(selectedMonth));
            stmt.setString(1, monthNumber); // Set the month number as parameter
            
            ResultSet rs = stmt.executeQuery();

            // Clear the existing rows in the table model
            DefaultTableModel model = (DefaultTableModel) PayslipTable.getModel();
            model.setRowCount(0);

            // Iterate through the result set and populate the table model
            while (rs.next()) {
                Vector<String> row = new Vector<>();
                row.add(rs.getString("EmployeeID"));
                row.add(rs.getString("Start Date"));
                row.add(rs.getString("End Date"));
                row.add(rs.getString("Hours Worked"));
                row.add(rs.getString("Overtime Hours"));
                row.add(rs.getString("Gross Income"));
                row.add(rs.getString("Net Income"));

                model.addRow(row);
            }
        } 
        catch (SQLException e) {
            // Handle SQL exceptions
            JOptionPane.showMessageDialog(this, "Error fetching data from database: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }   // TODO add your handling code here:
    }//GEN-LAST:event_MonthlySalaryActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Salary().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllSalary;
    private javax.swing.JLabel Attendance;
    private javax.swing.JPanel Default;
    private javax.swing.JLabel Employee;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Generate;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel Leave;
    private javax.swing.JLabel Management;
    private javax.swing.JComboBox<String> MonthlySalary;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Overtime;
    private javax.swing.JLabel Overview;
    private javax.swing.JLabel Payslip;
    private javax.swing.JTable PayslipTable;
    private javax.swing.JLabel Profile;
    private javax.swing.JLabel Record;
    private javax.swing.JLabel Request;
    private javax.swing.JLabel Salary;
    private javax.swing.JLabel Time;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}