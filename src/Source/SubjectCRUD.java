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
public class SubjectCRUD {
    public ArrayList<Subject> subjectlist;
    
    public SubjectCRUD(){
        subjectlist = new ArrayList<Subject>();
    }
    
    public void createSubject(Subject subject){
        subjectlist.add(subject);
    }
    
    public Subject retrieveSubject(Subject subject){
        for(Subject s: subjectlist){
            if(s.equals(subject)) return s;
        }
        return null;
    }
    
    public void updateSubject(Subject subject, Subject newsubject){
        Subject tempsubject = retrieveSubject(subject);
        if(tempsubject != null){
            tempsubject.setTitlecode(newsubject.getTitlecode());
            tempsubject.setDescription(newsubject.getDescription());
            tempsubject.setSchedule(newsubject.getSchedule());
            tempsubject.setUnit(newsubject.getUnit());
            
        }
    }
    
    public void deleteSubject(Subject subject){
        boolean found = false;
        for(int i = 0; i < subjectlist.size() && found != true; i++){
            found = subjectlist.get(i).equals(subject);
            if (found){
                subjectlist.remove(i);
                return;
            }
        }
    }
    
    @Override
    public String toString(){
        String str = "";
        for (Subject subject: subjectlist){
            str += (subject.getTitlecode() + ";" + subject.getDescription() + ";" + subject.getSchedule() + ";" + subject.getUnit() + "\n");
        }
        return str;
    }
}
