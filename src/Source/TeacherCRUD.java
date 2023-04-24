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
public class TeacherCRUD {
    public ArrayList<Teacher> teacherlist;
    
    public TeacherCRUD(){
        teacherlist = new ArrayList<Teacher>();
    }
    
    public void createTeacher(Teacher teacher){
        teacherlist.add(teacher);
    }
    
    public Teacher retrieveTeacher(Teacher teacher){
        for(Teacher t: teacherlist){
            if(t.equals(teacher)) return t;
        }
        return null;
    }
    
    public void updateTeacher(Teacher teacher, Teacher newteacher){
        Teacher tempteacher = retrieveTeacher(teacher);
        if(tempteacher != null){
            tempteacher.setFname(newteacher.getFname());
            tempteacher.setLname(newteacher.getLname());
            tempteacher.setAddress(newteacher.getAddress());
            tempteacher.setId(newteacher.getId());
            tempteacher.setRank(newteacher.getRank());
            tempteacher.setDesignation(newteacher.getDesignation());
        }
    }
    
    public void deleteTeacher(Teacher teacher){
        boolean found = false;
        for(int i = 0; i < teacherlist.size(); i++){
            found = teacherlist.get(i).equals(teacher);
            if (found){
                teacherlist.remove(i);
                return;
            }
        }
    }
    
    @Override
    public String toString(){
        String str = "";
        for (Teacher teacher: teacherlist){
            str += (teacher.getFname() + ";" + teacher.getLname() + ";" + teacher.getAddress() + ";" + teacher.getId() + ";" + teacher.getRank() + ";" + teacher.getDesignation() + "\n");
        }
        return str;
    }
}

