/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReadnWrite;

import Main.Sanitize;
import Source.EnrollmentCRUD;
import Source.Student;
import Source.StudentCRUD;
import Source.Subject;
import Source.SubjectCRUD;
import Source.SubjectEnrolled;
import Source.Teacher;
import Source.TeacherCRUD;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander
 */
public class EnrollmentRU {
    private final String filename;

    public EnrollmentRU(String filename){
        this.filename = filename;
    }
    //reader
    public void read(EnrollmentCRUD enrollment, SubjectCRUD subc, TeacherCRUD tc, StudentCRUD sc){
        try (BufferedReader bufferedreader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = bufferedreader.readLine()) != null){
                if(line.isEmpty() || line.isBlank() || line.charAt(0) == ';'){continue;}
                String[] arr = line.split(";");
                
                Subject subject = null;
                Student student = null;
                Teacher teacher = null;
                
                String subid = Sanitize.sanitize(arr[0]);
                for(Subject sub : subc.subjectlist){
                    if(sub.getTitlecode().equals(subid)) subject = sub;
                }
                    
                int studid = Integer.parseInt(Sanitize.sanitize(arr[1]));
                for(Student stud : sc.studentlist){
                    if(stud.getId() == studid) student = stud;
                }
                
                int teachid = Integer.parseInt(Sanitize.sanitize(arr[2]));
                for(Teacher t : tc.teacherlist){
                    if(t.getId() == teachid) teacher = t;
                }
                
                Double grade = Double.valueOf(Sanitize.sanitize(arr[3]));
                
                SubjectEnrolled se = new SubjectEnrolled(subject, student, teacher, grade);
                enrollment.createSE(se);
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error Reading File!\n" + Arrays.toString(e.getStackTrace()), "Error!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);}
    }

    //writer
    public void write(EnrollmentCRUD enrollment){
        try (FileWriter filewriter = new FileWriter(filename)) {
            for(SubjectEnrolled se : enrollment.enlist){
                filewriter.write(se.getSubject().getTitlecode() + ";" + se.getStudent().getId() + ";" + se.getTeacher().getId() + ";" + se.getGrade() + System.lineSeparator());}
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error Updating File!\n" + Arrays.toString(e.getStackTrace()), "Error!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);}
    }
    
}
