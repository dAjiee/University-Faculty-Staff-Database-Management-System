/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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

public class IT_BTM_PT05_Villasis {

    public static void main(String[] args) {
        //Declare Variables
        SubjectCRUD sblist = new SubjectCRUD();
        StudentCRUD slist = new StudentCRUD();
        TeacherCRUD tlist = new TeacherCRUD();
        EnrollmentCRUD elist = new EnrollmentCRUD();
        TeachingAssignmentCRUD tslist = new TeachingAssignmentCRUD();
        
        EnrollmentRU enrollru = new EnrollmentRU("Enrollment.txt");
        StudentRU studentru = new StudentRU("Student.txt");
        SubjectRU subjectru = new SubjectRU("Subject.txt");
        TeacherRU teacherru = new TeacherRU("Teacher.txt");
        TeachingAssignmentRU tsru = new TeachingAssignmentRU("SubjectTeacher.txt");
        
        //Initialize Variables
        studentru.read(slist);
        subjectru.read(sblist);
        teacherru.read(tlist);
        enrollru.read(elist, sblist, tlist, slist);
        tsru.read(tslist, tlist, sblist);
        
        MainFrame main = new MainFrame(sblist, slist, tlist, elist, enrollru, studentru, subjectru, teacherru, tslist, tsru);
        main.setVisible(true);
    }
    
}
