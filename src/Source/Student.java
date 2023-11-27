/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.util.Objects;

/**
 *
 * @author Extension PC1
 */
public class Student extends Person{
    
    private String course;
    private int yearlevel;
    
    public Student(){
        super();
        this.course = "";
        this.yearlevel = 0;
    }
    
    public Student(String fname, String lname, String address, int id, String course, int yearlevel) {
        super(fname, lname, address, id);
        this.course = course;
        this.yearlevel = yearlevel;
    }
    
    public void setCourse(String course){this.course = course;}
    public void setYearlevel(int yearlevel){this.yearlevel = yearlevel;}
    
    public String getCourse(){return course;}
    public int getYearlevel(){return yearlevel;}
    
    @Override
    public String toString(){
        String str;
        str = super.toString();
        return str +
                "Course: " + course + "\n" +
                "Year Level: " + yearlevel + "\n";
        
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return Objects.equals(super.getFname(), student.getFname()) &&
               Objects.equals(super.getLname(), student.getLname()) &&
               Objects.equals(super.getAddress(), student.getAddress()) &&
               Objects.equals(super.getId(), student.getId()) &&
               Objects.equals(course, student.course) &&
               Objects.equals(yearlevel, student.yearlevel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.getFname(), super.getLname(), super.getAddress(), super.getId(), course, yearlevel);
    }
    
    
}
