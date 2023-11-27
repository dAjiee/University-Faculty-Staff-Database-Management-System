/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminForms;

import it_btm_pt05_villasis.*;
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

public class AdminMainFrame extends javax.swing.JFrame {
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
    
    public AdminMainFrame(SubjectCRUD sblist, StudentCRUD slist, TeacherCRUD tlist, EnrollmentCRUD elist, EnrollmentRU enrollru, StudentRU studentru, SubjectRU subjectru, TeacherRU teacherru, TeachingAssignmentCRUD tslist, TeachingAssignmentRU tsru) {
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

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Administrator Enrollement");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jButton1.setText("Teacher Enrollment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 170, 30));

        jButton2.setText("Subject Enrollment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 170, 30));

        jButton3.setText("Student Enrollment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 170, 30));

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
        TeacherDataView teacher = new TeacherDataView(tlist, teacherru, elist, enrollru, tslist, tsru);
        teacher.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    //Open Student
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        StudentDataView student = new StudentDataView(slist, studentru, elist, enrollru);
        student.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    //Open Subject
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SubjectDataView subject = new SubjectDataView(sblist, subjectru, elist, enrollru, tslist, tsru);
        subject.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
