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
    public ArrayList<Enrollment> enlist;
    
    public EnrollmentCRUD(){
        enlist = new ArrayList<Enrollment>();
    }
    
    public void createSE(Enrollment se){
        enlist.add(se);
    }
    
    public Enrollment retrieveSE(Enrollment se){
        for(Enrollment s: enlist){
            if(s.equals(se)) return s;
        }
        return null;
    }
    
    public void updateSE(Enrollment se, Enrollment newse){
        Enrollment tempse = retrieveSE(se);
        if(tempse != null){
            tempse.setSubject(newse.getSubject());
            tempse.setStudent(newse.getStudent());
            tempse.setTeacher(newse.getTeacher());
            tempse.setGrade(newse.getGrade());
        }
    }
    
    public void deleteSE(Enrollment se){
        boolean found = false;
        for(int i = 0; i < enlist.size() && found != true; i++){
            found = enlist.get(i).equals(se);
            if (found){
                enlist.remove(i);
                return;
            }
        }
    }
    
    public ArrayList<Enrollment> getClassList(Subject sub){
        ArrayList<Enrollment> tempCL = new ArrayList<Enrollment>();
        for(Enrollment se : enlist){
            if(se.getSubject().equals(sub)) tempCL.add(se);
        }
        return tempCL;
    }
    
    public ArrayList<Enrollment> getSubjectsEnrolled (Student stud){
        ArrayList<Enrollment> tempCL = new ArrayList<Enrollment>();
        for(Enrollment se : enlist){
            if(se.getStudent().equals(stud)) tempCL.add(se);
        }
        return tempCL;
    }
    
    public ArrayList<Enrollment> getFacultyLoad (Teacher t){
        ArrayList<Enrollment> tempCL = new ArrayList<Enrollment>();
        for(Enrollment se : enlist){
            if(se.getTeacher().equals(t)) tempCL.add(se);
        }
        return tempCL;
    }
    
    @Override
    public String toString(){
        String str = "";
        for (Enrollment se: enlist){
            str += (se.getSubject().getTitlecode() + ";" + se.getStudent().getId() + ";" + se.getTeacher().getId() + ";" + se.getGrade() + "\n");
        }
        return str;
    }
    
}
