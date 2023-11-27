/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it_btm_pt05_villasis;

import EnrollmentForms.EnrollStudent;
import ReadnWrite.EnrollmentRU;
import ReadnWrite.StudentRU;
import ReadnWrite.SubjectRU;
import ReadnWrite.TeacherRU;
import Source.EnrollmentCRUD;
import Source.StudentCRUD;
import Source.Subject;
import Source.SubjectCRUD;
import Source.Enrollment;
import Source.Teacher;
import Source.TeacherCRUD;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ClassList extends javax.swing.JFrame {
    //Declare Variables
    SubjectCRUD sblist;
    StudentCRUD slist;
    TeacherCRUD tlist;
    EnrollmentCRUD elist;
    
    EnrollmentRU enrollru;
    StudentRU studentru;
    SubjectRU subjectru;
    TeacherRU teacherru;
    
    Teacher teach;
    Subject sub;
    
    public ClassList(SubjectCRUD sblist, StudentCRUD slist, TeacherCRUD tlist, EnrollmentCRUD elist, EnrollmentRU enrollru, StudentRU studentru, SubjectRU subjectru, TeacherRU teacherru, Teacher teach, Subject sub) {
        //Initialize Variables
        this.sblist = sblist;
        this.slist = slist;
        this.tlist = tlist;
        this.elist = elist;
        this.enrollru = enrollru;
        this.studentru = studentru;
        this.teacherru = teacherru;
        this.teach = teach;
        this.sub = sub;
        
        
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
        
        // Update Changes Made on Grade
        jTable1.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                // Check if the event is for a valid row and column
                if (e.getFirstRow() != TableModelEvent.HEADER_ROW && e.getColumn() != TableModelEvent.ALL_COLUMNS) {
                    int row = e.getFirstRow();
                    int column = e.getColumn();
                    TableModel model = (TableModel) e.getSource();

                    // Check if the row and column indices are within the valid range
                    if (row >= 0 && row < model.getRowCount() && column >= 0 && column < model.getColumnCount()) {
                        Object data = model.getValueAt(row, column);
                        Enrollment temp = null;

                        for (Enrollment enroll : elist.enlist) {
                            if (((String) jTable1.getModel().getValueAt(row, 0)).equalsIgnoreCase(enroll.getStudent().getCname())
                                    && enroll.getTeacher().getId() == teach.getId() && enroll.getSubject().getTitlecode().equalsIgnoreCase(sub.getTitlecode())) {
                                temp = enroll;
                                break;
                            }
                        }

                        if (temp != null) {
                            temp.setGrade(Double.parseDouble((String) data));
                            enrollru.write(elist);
                        }
                    }
                }
            }
        });


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Schedule: " + sub.getSchedule());
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 330, 30));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student", "Course", "Year Level", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 530, 180));

        jButton1.setText("Remove Student");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 120, -1));

        jButton3.setText("Add Student");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 120, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText(sub.getDescription());
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 230, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText(sub.getTitlecode().toUpperCase());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Frame (7).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Center JFrame
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened
    
    //Remove Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow != -1){
            int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Drop Student", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if(response == JOptionPane.YES_OPTION){
                Enrollment se = null;
                for(Enrollment enroll : elist.enlist){
                    if(teach == enroll.getTeacher()){
                        String student = (String) jTable1.getValueAt(selectedRow, 0);
                        if (student.equalsIgnoreCase(enroll.getStudent().getCname())) {
                            String titlecode = sub.getTitlecode();
                            if(enroll.getSubject().getTitlecode().equalsIgnoreCase(titlecode)){
                                se = enroll;
                            }
                        }
                    }
                }
                elist.deleteSE(elist.retrieveSE(se));
                enrollru.write(elist);
            }
            refreshTable();
            jTable1.clearSelection();
            jButton1.setEnabled(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //Enroll Student
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        EnrollStudent enroll = new EnrollStudent(slist, elist, enrollru, teach, sub);
        enroll.setVisible(true);
        enroll.addWindowListener(new WindowAdapter(){
        @Override
            public void windowClosed(WindowEvent e) {
                jTable1.clearSelection();
                jButton1.setEnabled(false);
                refreshTable();
            }
        });
    }//GEN-LAST:event_jButton3ActionPerformed

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
            if(teach == enroll.getTeacher() && sub == enroll.getSubject()){
            Object[] rowData = {
                enroll.getStudent().getCname(),
                enroll.getStudent().getCourse(),
                enroll.getStudent().getYearlevel(),
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
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
