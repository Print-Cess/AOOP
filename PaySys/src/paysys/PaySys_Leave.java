/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paysys;
import paysys.PaySys_Login;
import PaySys_Classes.Leave;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.Timer;
/**
 *
 * @author Giann Gernale
 */
public class PaySys_Leave extends javax.swing.JFrame {
    int EmployeeID = Integer.parseInt(PaySys_Login.password);
    private String SCHEMA = "payrolldb"; // Replace with your schema name
    private String TABLE = "`leave`"; // Replace with your table name
    private String USER = "root"; // Replace with your database username
    private String PASSWORD = "user123"; // Replace with your database password
    DefaultTableModel model = new DefaultTableModel();
    private Timer refreshTimer;
    /**
     * Creates new form PaySys_Leave
     */
    public PaySys_Leave() {
        initComponents();
        model.setColumnIdentifiers(new String[] {"employeeID", "typeOfLeave", "startDate", "endDate", "reason", "leaveStatus", "leaveDuration", "credits"});
        try {
            displayLeaveDetails(jTable1);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
         setResizeTable();
        refreshTimer = new Timer(5000, e -> refreshTableData()); // Refresh every 5 seconds
        refreshTimer.start();
    }
    
    public void displayLeaveDetails(JTable jTable1) throws SQLException, ClassNotFoundException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + SCHEMA, USER, PASSWORD);
        Statement statement = connection.createStatement();

        // Prepare a query to fetch all columns except leaveID
        String sql = "SELECT employeeID, typeOfLeave, startDate, endDate, reason, leaveStatus, leaveDuration, credits FROM " + TABLE;
        ResultSet resultSet = statement.executeQuery(sql);


        // Add rows from the result set
        while (resultSet.next()) {
            Object[] row = new Object[resultSet.getMetaData().getColumnCount()];
            for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                row[i - 1] = resultSet.getObject(i);
            }
            model.addRow(row);
        }

        // Set the table model for the JTable
        jTable1.setModel(model);

        // Close the connection
        connection.close();
    }
    private void displayTable(JTable jTable){
         jTable1.setModel(model);
    }
    
    private void setResizeTable(){
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
    }
    
    private void refreshTableData() {
        try {
            model.setRowCount(0); // Clear existing data
            displayLeaveDetails(jTable1);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    private boolean isValidLeaveDates(Date startDate, Date endDate) {
        if (startDate.after(endDate)) {
            return false;
        }

        // Check if start date is before today
        Date today = new Date();
        return !startDate.before(today);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        LeaveStart = new com.toedter.calendar.JDateChooser();
        LeaveEnd = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LeaveReason = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        TypeOfLeave = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        usernametext = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Leave Application Menu");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Apply");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 0));
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Start Date");

        jLabel2.setText("End Date");

        LeaveReason.setColumns(20);
        LeaveReason.setRows(5);
        jScrollPane1.setViewportView(LeaveReason);

        jLabel3.setText("Reason");

        TypeOfLeave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacation", "Sick", "Emergency" }));

        jLabel4.setText("Leave Type");

        usernametext.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        usernametext.setForeground(new java.awt.Color(0, 0, 102));
        usernametext.setText("UserName");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernametext)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(TypeOfLeave, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LeaveStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LeaveEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(usernametext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(LeaveStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(LeaveEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(TypeOfLeave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Leave leave = new Leave();
        Date startDate = LeaveStart.getDate();
        Date endDate = LeaveEnd.getDate();
        String leaveStatus = "Pending";
        int leaveCredits = 5;

        // Check for invalid dates
        if (!isValidLeaveDates(startDate, endDate)) {
            JOptionPane.showMessageDialog(null, "Invalid leave dates. Please ensure the start date is before the end date and after today.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if dates are invalid
        }

        try {
            leave.setLeaveDetails(EmployeeID, startDate, endDate, TypeOfLeave.getSelectedItem().toString(),
                    LeaveReason.getText(), leaveStatus, leaveCredits);
            leave.recordLeave(); // Call recordLeave method after setting details
            // Display success message (optional)
            JOptionPane.showMessageDialog(null, "Leave application submitted!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | ClassNotFoundException | ParseException ex) {
            // Handle database errors and ParseException (optional)
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error submitting leave application: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PaySys_Leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaySys_Leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaySys_Leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaySys_Leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaySys_Leave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser LeaveEnd;
    private javax.swing.JTextArea LeaveReason;
    private com.toedter.calendar.JDateChooser LeaveStart;
    private javax.swing.JComboBox<String> TypeOfLeave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel usernametext;
    // End of variables declaration//GEN-END:variables
}
