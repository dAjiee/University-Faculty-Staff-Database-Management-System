/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Source;

/**
 *
 * @author Alexander
 */
public class TeachingAssignment {
    private Teacher teacher;
    private Subject subject;

    public TeachingAssignment(Teacher teacher, Subject subject) {
        this.teacher = teacher;
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "TeachingAssignment{" +
                "teacher=" + teacher +
                ", subject=" + subject +
                '}';
    }
}
