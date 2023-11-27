/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it_btm_pt05_villasis;

import EnrollmentForms.EnrollSubjectTeacher;
import ReadnWrite.EnrollmentRU;
import ReadnWrite.StudentRU;
import ReadnWrite.SubjectRU;
import ReadnWrite.TeacherRU;
import ReadnWrite.TeachingAssignmentRU;
import Source.EnrollmentCRUD;
import Source.Student;
import Source.StudentCRUD;
import Source.SubjectCRUD;
import Source.Enrollment;
import Source.TeacherCRUD;
import Source.TeachingAssignmentCRUD;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class StudentFrame extends javax.swing.JFrame {
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
    
    Student stud;

    public StudentFrame(SubjectCRUD sblist, StudentCRUD slist, TeacherCRUD tlist, EnrollmentCRUD elist, EnrollmentRU enrollru, StudentRU studentru, SubjectRU subjectru, TeacherRU teacherru, Student stud, TeachingAssignmentCRUD tslist, TeachingAssignmentRU tsru) {
        //Initialize Variables
        this.sblist = sblist;
        this.slist = slist;
        this.tlist = tlist;
        this.elist = elist;
        this.enrollru = enrollru;
        this.studentru = studentru;
        this.subjectru = subjectru;
        this.teacherru = teacherru;
        this.stud = stud;
        this.tslist = tslist;
        this.tsru = tsru;
        
        //JFrame Components
        initComponents();
        
        //Initially Disable Button
        jButton1.setEnabled(false);
        
        //Enable Buttons When a Row is Pressed
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                // Check if a row is selected
                if(jTable1.getSelectedRow() != -1){
                    // Enable the buttons
                    jButton1.setEnabled(true);
                }
            }
        });
        
        //Initially Populate JTable
        populateJTable(elist, jTable1);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Log Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 100, -1));

        jLabel3.setText("Year Level: " + stud.getCourse().toUpperCase() + "-" + stud.getYearlevel());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 210, -1));

        jLabel6.setText("Address: " + stud.getAddress());
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 210, -1));

        jLabel4.setText("Name: " + stud.getCname());
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 200, -1));

        jLabel5.setText("ID Number: " + stud.getId());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 200, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 60, -1));

        jButton1.setText("Drop Subject");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 110, -1));

        jButton2.setText("Enroll Subject");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 130, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Subject Code", "Teacher", "Schedule", "Units", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 350, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Frame (5).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Enroll Subject
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EnrollSubjectTeacher enroll = new EnrollSubjectTeacher(tlist, teacherru, elist, enrollru, tslist, tsru, stud);
        enroll.setVisible(true);
        enroll.addWindowListener(new WindowAdapter(){
        @Override
            public void windowClosed(WindowEvent e) {
                jTable1.clearSelection();
                jButton1.setEnabled(false);
                refreshTable();
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    //Center JFrame
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened
    
    //Log Out
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    //Drop Subject
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTable1.getSelectedRow() != -1){
            int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Drop Subject", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);

            if(response == JOptionPane.YES_OPTION){
                Enrollment se = null;
                for(Enrollment enroll : elist.enlist){
                    if(stud == enroll.getStudent()){
                        String code = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                        if (code.equalsIgnoreCase(enroll.getSubject().getTitlecode())) {
                            String teacher = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 1);
                            if(teacher.equalsIgnoreCase(enroll.getTeacher().getCname())){
                                se = enroll;
                            }
                        }
                    }
                }
                elist.deleteSE(elist.retrieveSE(se));
                enrollru.write(elist);
                refreshTable();
            }
            jTable1.clearSelection();
            jButton1.setEnabled(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    //Method For Populating Table
    public void populateJTable(EnrollmentCRUD elist, JTable yourJTable) {
        // Get the jTable1 model from the JTable
        DefaultTableModel model = (DefaultTableModel) yourJTable.getModel();
        
        // Inform the model that data is going to change
        model.fireTableDataChanged();
        
        // Clear the existing rows in the jTable1 model
        model.setRowCount(0);

        // Iterate through the ArrayList and add each object as a new row in the jTable1 model
        for (Enrollment enroll : elist.enlist) {
            if(stud == enroll.getStudent()){
            Object[] rowData = {
                enroll.getSubject().getTitlecode().toUpperCase(),
                enroll.getTeacher().getCname(),
                enroll.getSubject().getSchedule(),
                enroll.getSubject().getUnit(),
                enroll.getGrade()
            };
            model.addRow(rowData);
            }
        }
        
        // Inform the model that data has changed
        model.fireTableDataChanged();
    }
    
    //Method for Refreshing Table After Updates
    public void refreshTable() {
        // Clear and repopulate the JTable with the updated data
        populateJTable(elist, jTable1);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
