/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it_btm_pt05_villasis;

import ReadnWrite.EnrollmentRU;
import ReadnWrite.StudentRU;
import ReadnWrite.SubjectRU;
import ReadnWrite.TeacherRU;
import ReadnWrite.TeachingAssignmentRU;
import Source.EnrollmentCRUD;
import Source.StudentCRUD;
import Source.SubjectCRUD;
import Source.TeacherCRUD;
import Source.TeachingAssignmentCRUD;

public class MainFrame extends javax.swing.JFrame {
    //Declare Variables
    SubjectCRUD sblist;
    StudentCRUD slist;
    TeacherCRUD tlist;
    EnrollmentCRUD elist;
    TeachingAssignmentCRUD tslist;
    
    EnrollmentRU enrollru;
    StudentRU studentru;
    SubjectRU subjectru;
    TeacherRU teacherru;
    TeachingAssignmentRU tsru;
    
    public MainFrame(SubjectCRUD sblist, StudentCRUD slist, TeacherCRUD tlist, EnrollmentCRUD elist, EnrollmentRU enrollru, StudentRU studentru, SubjectRU subjectru, TeacherRU teacherru, TeachingAssignmentCRUD tslist, TeachingAssignmentRU tsru) {
        //Initialize Variables
        this.sblist = sblist;
        this.slist = slist;
        this.tlist = tlist;
        this.elist = elist;
        this.enrollru = enrollru;
        this.studentru = studentru;
        this.teacherru = teacherru;
        this.subjectru = subjectru;
        this.tslist = tslist;
        this.tsru = tsru;
        
        //JFrame Components
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Teacher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 110, 30));

        jButton2.setText("Admin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 110, 30));

        jButton3.setText("Student");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Frame (8).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Center JFrame
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened
    
    //Open Teacher
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginFrame login = new LoginFrame(sblist, slist, tlist, elist, enrollru, studentru, subjectru, teacherru, "Teacher", tslist, tsru);
        login.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    //Open Student
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        LoginFrame login = new LoginFrame(sblist, slist, tlist, elist, enrollru, studentru, subjectru, teacherru, "Student", tslist, tsru);
        login.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    //Open Admin
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LoginFrame login = new LoginFrame(sblist, slist, tlist, elist, enrollru, studentru, subjectru, teacherru, "Admin", tslist, tsru);
        login.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
