/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReadnWrite;

import TestMain.Sanitize;
import Source.Student;
import Source.StudentCRUD;
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
public class StudentRU {
    private final String filename;

    public StudentRU(String filename){
        this.filename = filename;
    }
    //reader
    public void read(StudentCRUD student){
        try (BufferedReader bufferedreader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = bufferedreader.readLine()) != null){
                if(line.isEmpty() || line.isBlank() || line.charAt(0) == ';'){continue;}
                String[] arr = line.split(";");
                String fname = Sanitize.sanitize(arr[0]);
                String lname = Sanitize.sanitize(arr[1]);
                String address = Sanitize.sanitize(arr[2]);
                int id = Integer.parseInt(Sanitize.sanitize(arr[3]));
                String course = Sanitize.sanitize(arr[4]);
                int yearlevel = Integer.parseInt(Sanitize.sanitize(arr[5]));
                Student stud = new Student(fname, lname, address, id, course, yearlevel);
                student.createStudent(stud);
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error Reading File!\n" + Arrays.toString(e.getStackTrace()), "Error!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);}
    }

    //writer
    public void write(StudentCRUD student){
        try (FileWriter filewriter = new FileWriter(filename)) {
            for(Student stud : student.studentlist){
                filewriter.write(Sanitize.sanitize(stud.getFname()) + ";" + 
                        Sanitize.sanitize(stud.getLname()) + ";" + 
                        Sanitize.sanitize(stud.getAddress()) + ";" + 
                        stud.getId() + ";" + 
                        Sanitize.sanitize(stud.getCourse()) + ";" + 
                        stud.getYearlevel() + System.lineSeparator());}
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error Updating File!\n" + Arrays.toString(e.getStackTrace()), "Error!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);}
    }

}
