/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Source;

import java.util.ArrayList;

/**
 *
 * @author Alexander
 */
public class TeachingAssignmentCRUD {
    public ArrayList<TeachingAssignment> assignmentList;
    
    public TeachingAssignmentCRUD() {
        this.assignmentList = new ArrayList<>();
    }

    public void createAssignment(TeachingAssignment assignment){
        assignmentList.add(assignment);
    }

    public TeachingAssignment retrieveAssignment(Teacher teacher, Subject subject){
        for(TeachingAssignment assignment: assignmentList){
            if(assignment.getTeacher().equals(teacher) && assignment.getSubject().equals(subject)) return assignment;
        }
        return null;
    }

    public void updateAssignment(TeachingAssignment oldAssignment, TeachingAssignment newAssignment){
        TeachingAssignment tempAssignment = retrieveAssignment(oldAssignment.getTeacher(), oldAssignment.getSubject());
        if(tempAssignment != null){
            tempAssignment.setTeacher(newAssignment.getTeacher());
            tempAssignment.setSubject(newAssignment.getSubject());
        }
    }

    public void deleteAssignment(TeachingAssignment assignment){
        boolean found = false;
        for(int i = 0; i < assignmentList.size(); i++){
            found = assignmentList.get(i).equals(assignment);
            if (found){
                assignmentList.remove(i);
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (TeachingAssignment assignment : assignmentList){
            str.append("Teacher: ").append(assignment.getTeacher().getFname()).append(" ").append(assignment.getTeacher().getLname()).append("\n");
            str.append("Subject: ").append(assignment.getSubject().getTitlecode()).append("\n\n");
        }
        return str.toString();
    }
}
