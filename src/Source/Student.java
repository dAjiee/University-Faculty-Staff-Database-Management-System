/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

/**
 *
 * @author Extension PC1
 */
public class Student extends Person{
    
    private String course;
    private int yearlevel;
    
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
    
    
}
