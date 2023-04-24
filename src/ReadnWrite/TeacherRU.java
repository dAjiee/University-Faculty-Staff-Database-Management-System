/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReadnWrite;

import Main.Sanitize;
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
public class TeacherRU {
    private final String filename;

    public TeacherRU(String filename){
        this.filename = filename;
    }
    //reader
    public void read(TeacherCRUD teacher){
        try (BufferedReader bufferedreader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = bufferedreader.readLine()) != null){
                if(line.isEmpty() || line.isBlank() || line.charAt(0) == ';'){continue;}
                String[] arr = line.split(";");
                String fname = Sanitize.sanitize(arr[0]);
                String lname = Sanitize.sanitize(arr[1]);
                String address = Sanitize.sanitize(arr[2]);
                int id = Integer.parseInt(Sanitize.sanitize(arr[3]));
                String rank = Sanitize.sanitize(arr[4]);
                String designation = Sanitize.sanitize(arr[5]);
                Teacher t = new Teacher(fname, lname, address, id, rank, designation);
                teacher.createTeacher(t);
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error Reading File!\n" + Arrays.toString(e.getStackTrace()), "Error!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);}
    }

    //writer
    public void write(TeacherCRUD teacher){
        try (FileWriter filewriter = new FileWriter(filename)) {
            for(Teacher t : teacher.teacherlist){
                filewriter.write(t.getFname() + ";" + t.getLname() + ";" + t.getAddress() + ";" + t.getId() + ";" + t.getRank() + ";" + t.getDesignation() + System.lineSeparator());}
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error Updating File!\n" + Arrays.toString(e.getStackTrace()), "Error!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);}
    }
}
