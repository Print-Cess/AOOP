/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paysys;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Seirrah
 */
public class Home extends javax.swing.JFrame {

public class Overtime extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Default = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        Overview = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Management = new javax.swing.JLabel();
        Profile = new javax.swing.JLabel();
        Employee = new javax.swing.JLabel();
        Attendance = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        Record = new javax.swing.JLabel();
        Leave = new javax.swing.JLabel();
        Overtime = new javax.swing.JLabel();
        Request = new javax.swing.JLabel();
        Payslip = new javax.swing.JLabel();
        Generate = new javax.swing.JLabel();
        Salary = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Default.setBackground(new java.awt.Color(255, 255, 255));

        Name.setBackground(new java.awt.Color(104, 107, 122));
        Name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/profile.png"))); // NOI18N
        Name.setText("Taylor Christian Tayengco");

        Overview.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Overview.setText("Overview");

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/house-window.png"))); // NOI18N
        Home.setText("Home");

        Management.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Management.setText("Management");

        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/user.png"))); // NOI18N
        Profile.setText("Profile");

        Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/users.png"))); // NOI18N
        Employee.setText("Employee");

        Attendance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Attendance.setText("Attendance");

        Time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/clock-three.png"))); // NOI18N
        Time.setText("Time In/Out");

        Record.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/calendar-lines.png"))); // NOI18N
        Record.setText("Record");

        Leave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/calendar-day.png"))); // NOI18N
        Leave.setText("Leave");

        Overtime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/calendar-clock.png"))); // NOI18N
        Overtime.setText("Overtime");

        Request.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/calendar-pen.png"))); // NOI18N
        Request.setText("Request");

        Payslip.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Payslip.setText("Payslip");

        Generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/wallet-arrow.png"))); // NOI18N
        Generate.setText("Generate");

        Salary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/credit-card-buyer.png"))); // NOI18N
        Salary.setText("Payslip");

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Collaterals/exit.png"))); // NOI18N
        Exit.setText("Sign Out");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Employee Dashboard");

        javax.swing.GroupLayout DefaultLayout = new javax.swing.GroupLayout(Default);
        Default.setLayout(DefaultLayout);
        DefaultLayout.setHorizontalGroup(
            DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefaultLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Overview)
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
                    .addGroup(DefaultLayout.createSequentialGroup()
                        .addComponent(Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 675, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16))))
        );
        DefaultLayout.setVerticalGroup(
            DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefaultLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(DefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addComponent(Overview)
                .addGap(12, 12, 12)
                .addComponent(Home)
                .addGap(22, 22, 22)
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
                .addGap(18, 18, 18)
                .addComponent(Exit))
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InstantiationException {
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
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Attendance;
    private javax.swing.JPanel Default;
    private javax.swing.JLabel Employee;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Generate;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Leave;
    private javax.swing.JLabel Management;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Overtime;
    private javax.swing.JLabel Overview;
    private javax.swing.JLabel Payslip;
    private javax.swing.JLabel Profile;
    private javax.swing.JLabel Record;
    private javax.swing.JLabel Request;
    private javax.swing.JLabel Salary;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
}
