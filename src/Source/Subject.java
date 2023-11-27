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
public class Subject {
    private String titlecode, description, schedule;
    private int unit;
    
    public Subject(String titlecode, String description, String schedule, int unit){
        this.titlecode = titlecode;
        this.description = description;
        this.schedule = schedule;
        this.unit = unit;
    }

    public Subject() {
        this.titlecode = "";
        this.description = "";
        this.schedule = "";
        this.unit = 0;
    }
    
    public void setTitlecode (String titlecode){this.titlecode = titlecode;}
    public void setDescription (String description){this.description = description;}
    public void setSchedule (String schedule){this.schedule = schedule;}
    public void setUnit(int unit){this.unit = unit;}
    
    public String getTitlecode(){return titlecode;}
    public String getDescription(){return description;}
    public String getSchedule(){return schedule;}
    public int getUnit(){return unit;}
    
    @Override
    public String toString(){
        return "Title code: " + titlecode + "\n" +
                "Description: " + description + "\n" +
                "Schedule: " + schedule + "\n" +
                "Unit: " + unit + "\n";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Subject subject = (Subject) obj;
        return Objects.equals(getTitlecode(), subject.getTitlecode()) &&
               Objects.equals(getDescription(), subject.getDescription()) &&
               Objects.equals(getSchedule(), subject.getSchedule()) &&
               Objects.equals(getUnit(), subject.getUnit());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getTitlecode(), getDescription(), getSchedule(), getUnit());
    }
    
}
