/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ReadnWrite.EnrollmentRU;
import ReadnWrite.StudentRU;
import ReadnWrite.SubjectRU;
import ReadnWrite.TeacherRU;
import Source.*;

/**
 *
 * @author Extension PC1
 */
public class Villasis_PT04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //List
        SubjectCRUD sblist = new SubjectCRUD();
        StudentCRUD slist = new StudentCRUD();
        TeacherCRUD tlist = new TeacherCRUD();
        EnrollmentCRUD elist = new EnrollmentCRUD();
        
        //File Reader and Writer
        EnrollmentRU enrollru = new EnrollmentRU("Enrollment.txt");
        StudentRU studentru = new StudentRU("Student.txt");
        SubjectRU subjectru = new SubjectRU("Subject.txt");
        TeacherRU teacherru = new TeacherRU("Teacher.txt");
        
        studentru.read(slist);
        subjectru.read(sblist);
        teacherru.read(tlist);
        enrollru.read(elist, sblist, tlist, slist);
        
        Subject sub = new Subject("IC124", "Programming Paradigm", "2:30 - 4:30", 3);
        sblist.createSubject(sub);
        Student stud1 = new Student("Alexander", "Villasis", "Dacoville", 1, "BSIT", 1);
        slist.createStudent(stud1);
        Student stud2 = new Student("Julius", "Ayuno", "SM Lanang", 2, "BSIT", 1);
        slist.createStudent(stud2);
        Teacher t = new Teacher("Vera", "Tequin", "USEP", 12345, "Gold", "Very Good Teacher");
        tlist.createTeacher(t);
        
        
        
        SubjectEnrolled se1 = new SubjectEnrolled(sub, stud1, t, 95.2);
        SubjectEnrolled se2 = new SubjectEnrolled(sub, stud2, t, 95.2);
        
        elist.createSE(se1);
        elist.createSE(se2);
        
        System.out.println(elist.retrieveSE(se1));
        System.out.println(elist.retrieveSE(se2));
        
        studentru.write(slist);
        subjectru.write(sblist);
        teacherru.write(tlist);
        enrollru.write(elist);
        
    }
}
