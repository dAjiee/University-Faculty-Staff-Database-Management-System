/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReadnWrite;

import Source.Subject;
import Source.SubjectCRUD;
import Source.Teacher;
import Source.TeacherCRUD;
import Source.TeachingAssignment;
import Source.TeachingAssignmentCRUD;
import TestMain.Sanitize;
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
public class TeachingAssignmentRU {
    private final String filename;

    public TeachingAssignmentRU(String filename){
        this.filename = filename;
    }
    //reader
    public void read(TeachingAssignmentCRUD tac, TeacherCRUD tc, SubjectCRUD sc){
        try (BufferedReader bufferedreader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = bufferedreader.readLine()) != null){
                if(line.isEmpty() || line.isBlank() || line.charAt(0) == ';'){continue;}
                String[] arr = line.split(";");
                
                Teacher teacher = null;
                Subject subject = null;
                
                int teachid = Integer.parseInt(Sanitize.sanitize(arr[0]));
                for(Teacher t : tc.teacherlist){
                    if(t.getId() == teachid) teacher = t;
                }
                
                String subid = Sanitize.sanitize(arr[1]);
                for(Subject sub : sc.subjectlist){
                    if(sub.getTitlecode().equals(subid)) subject = sub;
                }
                
                TeachingAssignment ta = new TeachingAssignment(teacher, subject);
                tac.createAssignment(ta);
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error Reading File!\n" + Arrays.toString(e.getStackTrace()), "Error!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);}
    }

    //writer
    public void write(TeachingAssignmentCRUD tac){
        try (FileWriter filewriter = new FileWriter(filename)) {
            for(TeachingAssignment ta : tac.assignmentList){
                filewriter.write(
                        ta.getTeacher().getId() + ";" + 
                        Sanitize.sanitize(ta.getSubject().getTitlecode()) + System.lineSeparator());}
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error Updating File!\n" + Arrays.toString(e.getStackTrace()), "Error!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);}
    }
}
