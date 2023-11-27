/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminForms;

import ReadnWrite.EnrollmentRU;
import ReadnWrite.StudentRU;
import Source.EnrollmentCRUD;
import Source.Student;
import Source.StudentCRUD;
import Source.Enrollment;
import TestMain.Sanitize;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class StudentDataView extends javax.swing.JFrame {
    StudentRU studentru;
    StudentCRUD slist;
    EnrollmentCRUD elist;
    EnrollmentRU enrollru;
    
    public StudentDataView(StudentCRUD slist, StudentRU studentru, EnrollmentCRUD elist, EnrollmentRU enrollru) {
        this.slist = slist;
        this.studentru = studentru;
        this.elist = elist;
        this.enrollru = enrollru;
        initComponents();
        
        populateJTable(slist, jTable1);
        
        //Table Sorter
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
        jTable1.setRowSorter(sorter);
        jTextField1.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                filter();
            }
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                filter();
            }
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                filter();
            }
            private void filter() {
                String text = jTextField1.getText();
                int columnIndex = jComboBox1.getSelectedIndex();
                if (text.isEmpty()) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text, columnIndex));
                }
            }
        });
        
        //Initially Disable Buttons
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        
        //Enable Buttons When a Row is Pressed
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                // Check if a row is selected
                if(jTable1.getSelectedRow() != -1){
                    // Enable the buttons
                    jButton2.setEnabled(true);
                    jButton3.setEnabled(true);
                }
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Search:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Student Data Viewer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, 40));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 370, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "First Name", "Last Name", "Address", "Course", "Year Level" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 150, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Firstname", "Lastname", "Address", "Course", "Year Level"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 570, 140));

        jButton1.setText("Input");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Frame (11).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Delete
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTable1.getSelectedRow() != -1){
            int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Data Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);

            if(response == JOptionPane.YES_OPTION){
            Student student = new Student( 
                    (String)jTable1.getValueAt(jTable1.getSelectedRow(), 1), 
                    (String)jTable1.getValueAt(jTable1.getSelectedRow(), 2), 
                    (String) jTable1.getValueAt(jTable1.getSelectedRow(), 3),
                    (int)jTable1.getValueAt(jTable1.getSelectedRow(), 0),
                    Sanitize.sanitize((String)jTable1.getValueAt(jTable1.getSelectedRow(), 4)),
                    (int)jTable1.getValueAt(jTable1.getSelectedRow(), 5)
            );
            
            for(Enrollment obj: elist.enlist){
                if(obj.getStudent().getId() == student.getId()){
                    elist.deleteSE(obj);
                    break;
                }
            }
            
            enrollru.write(elist);
            
            slist.deleteStudent(slist.retrieveStudent(student));
            studentru.write(slist);
            refreshTable();}
            jTable1.clearSelection();
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    //Input
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StudentDataForm create = new StudentDataForm(slist, studentru);
        create.setVisible(true);
        create.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosed(WindowEvent e) {
                jTable1.clearSelection();
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                refreshTable();
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    //Update
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Old Person
        int viewIndex = jTable1.getSelectedRow();
        int modelIndex = jTable1.convertRowIndexToModel(viewIndex);
        Student oldStudent = slist.studentlist.get(modelIndex);
        
        StudentDataForm update = new StudentDataForm(slist, studentru, oldStudent);
        update.setVisible(true);
        update.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosed(WindowEvent e) {
                jTable1.clearSelection();
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                refreshTable();
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed
    
    //Center JFrame
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    //Method For Populating Table
    public void populateJTable(StudentCRUD list, JTable yourJTable) {
        // Get the jTable1 model from the JTable
        DefaultTableModel model = (DefaultTableModel) yourJTable.getModel();
        
        // Inform the model that data is going to change
        model.fireTableDataChanged();
        
        // Clear the existing rows in the jTable1 model
        model.setRowCount(0);

        // Iterate through the ArrayList and add each object as a new row in the jTable1 model
        for (Student student : list.studentlist) {
            Object[] rowData = {
                student.getId(),
                student.getFname(),
                student.getLname(),
                student.getAddress(),
                student.getCourse().toUpperCase(),
                student.getYearlevel()
            };
        model.addRow(rowData);
        }
        
        // Inform the model that data has changed
        model.fireTableDataChanged();
    }
    
    //Method for Refreshing Table After Updates
    public void refreshTable() {
        // Clear and repopulate the JTable with the updated data
        populateJTable(slist, jTable1);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
