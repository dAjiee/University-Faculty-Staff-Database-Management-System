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
public class EnrollmentCRUD {
    public ArrayList<SubjectEnrolled> enlist;
    
    public EnrollmentCRUD(){
        enlist = new ArrayList<SubjectEnrolled>();
    }
    
    public void createSE(SubjectEnrolled se){
        enlist.add(se);
    }
    
    public SubjectEnrolled retrieveSE(SubjectEnrolled se){
        for(SubjectEnrolled s: enlist){
            if(s.equals(se)) return s;
        }
        return null;
    }
    
    public void updateSE(SubjectEnrolled se, SubjectEnrolled newse){
        SubjectEnrolled tempse = retrieveSE(se);
        if(tempse != null){
            tempse.setSubject(newse.getSubject());
            tempse.setStudent(newse.getStudent());
            tempse.setTeacher(newse.getTeacher());
            tempse.setGrade(newse.getGrade());
        }
    }
    
    public void deleteSE(SubjectEnrolled se){
        boolean found = false;
        for(int i = 0; i < enlist.size() && found != true; i++){
            found = enlist.get(i).equals(se);
            if (found){
                enlist.remove(i);
                return;
            }
        }
    }
    
    @Override
    public String toString(){
        String str = "";
        for (SubjectEnrolled se: enlist){
            str += (se.getSubject().getTitlecode() + ";" + se.getStudent().getId() + ";" + se.getTeacher().getId() + ";" + se.getGrade() + "\n");
        }
        return str;
    }
    
}
