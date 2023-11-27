/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it_btm_pt05_villasis;

import EnrollmentForms.EnrollSubject;
import ReadnWrite.EnrollmentRU;
import ReadnWrite.StudentRU;
import ReadnWrite.SubjectRU;
import ReadnWrite.TeacherRU;
import ReadnWrite.TeachingAssignmentRU;
import Source.EnrollmentCRUD;
import Source.StudentCRUD;
import Source.Subject;
import Source.SubjectCRUD;
import Source.Enrollment;
import Source.Teacher;
import Source.TeacherCRUD;
import Source.TeachingAssignment;
import Source.TeachingAssignmentCRUD;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class TeacherFrame extends javax.swing.JFrame {
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
    
    Teacher teach;

    public TeacherFrame(SubjectCRUD sblist, StudentCRUD slist, TeacherCRUD tlist, EnrollmentCRUD elist, EnrollmentRU enrollru, StudentRU studentru, SubjectRU subjectru, TeacherRU teacherru, Teacher teach, TeachingAssignmentCRUD tslist, TeachingAssignmentRU tsru) {
        //Initialize Variables
        this.sblist = sblist;
        this.slist = slist;
        this.tlist = tlist;
        this.elist = elist;
        this.enrollru = enrollru;
        this.studentru = studentru;
        this.teacherru = teacherru;
        this.teach = teach;
        this.tslist = tslist;
        this.tsru = tsru;
        
        //JFrame Components
        initComponents();
        
        //Initially Disable Button
        jButton3.setEnabled(false);
        jButton1.setEnabled(false);
        
        //Enable Buttons When a Row is Pressed
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                // Check if a row is selected
                if(jTable1.getSelectedRow() != -1){
                    // Enable the buttons
                    jButton3.setEnabled(true);
                    jButton1.setEnabled(true);
                }
            }
        });
        
        //Initially Populate JTable
        populateJTable(tslist, elist, jTable1);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Log Out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 100, -1));

        jLabel6.setText("Address: " + teach.getAddress());
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 190, -1));

        jLabel4.setText("Name: " + teach.getCname());
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 190, -1));

        jLabel5.setText("ID Number: " + teach.getId());
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 190, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 60, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Subject Code", "# of Students", "Schedule", "Units"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 350, 220));

        jButton2.setText("Add Subject");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 100, -1));

        jButton3.setText("Remove Subject");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 120, -1));

        jButton1.setText("View Class List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 110, -1));

        jLabel8.setText("Rank: " + teach.getRank());
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 180, -1));

        jLabel7.setText("Designation: " + teach.getDesignation());
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 180, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Frame (5).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Add Subject Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EnrollSubject enroll = new EnrollSubject(sblist, tslist, tsru, teach);
        enroll.setVisible(true);
        enroll.addWindowListener(new WindowAdapter(){
        @Override
            public void windowClosed(WindowEvent e) {
                jTable1.clearSelection();
                jButton3.setEnabled(false);
                jButton1.setEnabled(false);
                refreshTable();
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    //Remove Subject Button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if(jTable1.getSelectedRow() != -1){
            int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Drop Subject", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if(response == JOptionPane.YES_OPTION){
                for(Enrollment enroll : elist.enlist){
                    if(teach == enroll.getTeacher()){
                        String code = (String) jTable1.getValueAt(selectedRow, 0);
                        if (code.equalsIgnoreCase(enroll.getSubject().getTitlecode())) {
                                elist.deleteSE(elist.retrieveSE(enroll));
                                enrollru.write(elist);
                        }
                    }
                }
                TeachingAssignment sb = null;
                for(TeachingAssignment enroll : tslist.assignmentList){
                    if(teach == enroll.getTeacher()){
                        String code = (String) jTable1.getValueAt(selectedRow, 0);
                        if (code.equalsIgnoreCase(enroll.getSubject().getTitlecode())) {
                            tslist.deleteAssignment(enroll);
                            tsru.write(tslist);
                        }
                    }
                }
            }
            jTable1.clearSelection();
            jButton1.setEnabled(false);
            jButton3.setEnabled(false);
            refreshTable();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    //View Classlist
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClassList classlist;
        TeachingAssignment sub1 = null;
        if(jTable1.getSelectedRow() != -1){
            for(TeachingAssignment sub : tslist.assignmentList){
                if(sub.getSubject().getTitlecode().equalsIgnoreCase((String) jTable1.getValueAt(jTable1.getSelectedRow(), 0))){
                    sub1 = sub;
                }
            }
        }
        classlist = new ClassList(sblist, slist, tlist, elist, enrollru, studentru, subjectru, teacherru, teach, sub1.getSubject());
        classlist.setVisible(true);
        classlist.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosed(WindowEvent e) {
                jTable1.clearSelection();
                jButton1.setEnabled(false);
                jButton3.setEnabled(false);
                refreshTable();
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    //Center JFrame
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened
    
    //Log Out
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed
    
    //Method For Populating Table
    public void populateJTable(TeachingAssignmentCRUD tac, EnrollmentCRUD elist, JTable yourJTable) {
        // Get the jTable1 model from the JTable
        DefaultTableModel model = (DefaultTableModel) yourJTable.getModel();

        // Inform the model that data is going to change
        model.fireTableDataChanged();

        // Clear the existing rows in the jTable1 model
        model.setRowCount(0);

        // Iterate through the ArrayList and add each object as a new row in the jTable1 model
        for (TeachingAssignment assignment : tac.assignmentList) {
            if(teach == assignment.getTeacher()){
                Subject subject = assignment.getSubject();
                Object[] rowData = {
                    subject.getTitlecode().toUpperCase(),
                    getStudentCount(subject, elist),
                    subject.getSchedule(),
                    subject.getUnit()
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
        populateJTable(tslist, elist, jTable1);
    }
    
    //Get Student Count
    public int getStudentCount(Subject sub, EnrollmentCRUD elist) {
        int count = 0;
        for(Enrollment arr : elist.enlist){
            if(arr.getSubject() == sub && arr.getTeacher() == teach){
                count++;
            }
        }
        return count;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
