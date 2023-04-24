/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.util.ArrayList;

/**
 *
 * @author Extension PC1
 */
public class StudentCRUD {
    public ArrayList<Student> studentlist;
    
    public StudentCRUD(){
        studentlist = new ArrayList<Student>();
    }
    
    public void createStudent(Student student){
        studentlist.add(student);
    }
    
    public Student retrieveStudent(Student student){
        for(Student s: studentlist){
            if(s.equals(student)) return s;
        }
        return null;
    }
    
    public void updateStudent(Student student, Student newstudent){
        Student tempstudent = retrieveStudent(student);
        if(tempstudent != null){
            tempstudent.setFname(newstudent.getFname());
            tempstudent.setLname(newstudent.getLname());
            tempstudent.setAddress(newstudent.getAddress());
            tempstudent.setId(newstudent.getId());
            tempstudent.setCourse(newstudent.getCourse());
            tempstudent.setYearlevel(newstudent.getYearlevel());
        }
    }
    
    public void deleteStudent(Student student){
        boolean found = false;
        for(int i = 0; i < studentlist.size() && found != true; i++){
            found = studentlist.get(i).equals(student);
            if (found){
                studentlist.remove(i);
                return;
            }
        }
    }
    
    @Override
    public String toString(){
        String str = "";
        for (Student student: studentlist){
            str += (student.getFname() + ";" + student.getLname() + ";" + student.getAddress() + ";" + student.getId() + ";" + student.getCourse() + ";" + student.getYearlevel() + "\n");
        }
        return str;
    }
}
