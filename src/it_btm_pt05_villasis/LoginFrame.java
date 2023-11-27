/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it_btm_pt05_villasis;

import AdminForms.AdminMainFrame;
import ReadnWrite.EnrollmentRU;
import ReadnWrite.StudentRU;
import ReadnWrite.SubjectRU;
import ReadnWrite.TeacherRU;
import ReadnWrite.TeachingAssignmentRU;
import Source.EnrollmentCRUD;
import Source.Student;
import Source.StudentCRUD;
import Source.SubjectCRUD;
import Source.Teacher;
import Source.TeacherCRUD;
import Source.TeachingAssignmentCRUD;

public class LoginFrame extends javax.swing.JFrame {
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
    
    String text;
    
    public LoginFrame(SubjectCRUD sblist, StudentCRUD slist, TeacherCRUD tlist, EnrollmentCRUD elist, EnrollmentRU enrollru, StudentRU studentru, SubjectRU subjectru, TeacherRU teacherru, String text) {
        //Initialize Variables
        this.sblist = sblist;
        this.slist = slist;
        this.tlist = tlist;
        this.elist = elist;
        this.enrollru = enrollru;
        this.studentru = studentru;
        this.teacherru = teacherru;
        this.subjectru = subjectru;
        this.text = text;
        
        //JFrame Components
        initComponents();
        
        //Hide jLabel7
        jLabel7.setVisible(false);
    }

    LoginFrame(SubjectCRUD sblist, StudentCRUD slist, TeacherCRUD tlist, EnrollmentCRUD elist, EnrollmentRU enrollru, StudentRU studentru, SubjectRU subjectru, TeacherRU teacherru, String text, TeachingAssignmentCRUD tslist, TeachingAssignmentRU tsru) {
        //Initialize Variables
        this.sblist = sblist;
        this.slist = slist;
        this.tlist = tlist;
        this.elist = elist;
        this.enrollru = enrollru;
        this.studentru = studentru;
        this.teacherru = teacherru;
        this.subjectru = subjectru;
        this.text = text;
        this.tslist = tslist;
        this.tsru = tsru;
        
        //JFrame Components
        initComponents();
        
        //Hide jLabel7
        jLabel7.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText(text + " account does not exist!");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel6.setText(text);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 190, 70));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID Number:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 190, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 190, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setText("Log In");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 190, 70));

        jButton2.setText("Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 80, -1));

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Frame (3).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Confirm
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Student Frame Open
        if(text.equalsIgnoreCase("student")){
            for(Student stud: slist.studentlist){
                if(Integer.parseInt(jTextField2.getText()) == stud.getId()){
                    if (jTextField1.getText().equalsIgnoreCase(stud.getCname())) {
                        this.dispose();
                        StudentFrame student = new StudentFrame(sblist, slist, tlist, elist, enrollru, studentru, subjectru, teacherru, stud, tslist, tsru);
                        student.setVisible(true);
                    }
                }
            }
            jLabel7.setVisible(true);
        }
        
        //Teacher Frame Open
        else if(text.equalsIgnoreCase("teacher")){
            for(Teacher teach: tlist.teacherlist){
                if(Integer.parseInt(jTextField2.getText()) == teach.getId()){
                    if (jTextField1.getText().equalsIgnoreCase(teach.getCname())) {
                        this.dispose();
                        TeacherFrame teacher = new TeacherFrame(sblist, slist, tlist, elist, enrollru, studentru, subjectru, teacherru, teach, tslist, tsru);
                        teacher.setVisible(true);
                    }
                }
            }
            jLabel7.setVisible(true);
        }
        
        //Admin Frame Open
        else{
            jTextField2.setText("0000");
            jTextField1.setText("admin");
            if((Integer.parseInt(jTextField2.getText())== 0000) && (jTextField1.getText().equalsIgnoreCase("admin"))){
                this.dispose();
                AdminMainFrame admin = new AdminMainFrame(sblist, slist, tlist, elist, enrollru, studentru, subjectru, teacherru, tslist, tsru);
                admin.setVisible(true);
            }
            jLabel7.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    //Cancel
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //Center JFrame
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
