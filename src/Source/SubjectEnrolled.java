/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

/**
 *
 * @author Extension PC1
 */
public class SubjectEnrolled {
    Subject subject;
    Student student;
    Teacher teacher;
    double grade;
    
    public SubjectEnrolled(){
        subject = null;
        student = null;
        teacher = null;
        grade = 0.0;
    }
    
    public SubjectEnrolled(Subject subject, Student student, Teacher teacher, double grade){
        this.subject = subject;
        this.student = student;
        this.teacher = teacher;
        this.grade = grade;
    }
    
    public void setSubject(Subject subject){this.subject = subject;}
    public void setStudent(Student student){this.student = student;}
    public void setTeacher(Teacher teacher){this.teacher = teacher;}
    public void setGrade(double grade){this.grade = grade;}
    
    public Subject getSubject(){return subject;}
    public Student getStudent(){return student;}
    public Teacher getTeacher(){return teacher;}
    public double getGrade(){return grade;}
    
    @Override
    public String toString(){
        return subject.toString() + "\n" +
                student.toString() + "\n" +
                teacher.toString() + "\n" +
                "Grade: " + grade + "\n";
    }
}
