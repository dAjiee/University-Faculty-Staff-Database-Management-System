/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

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
    
}
