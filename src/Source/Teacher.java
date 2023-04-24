/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

/**
 *
 * @author Extension PC1
 */
public class Teacher extends Person{
    
    private String rank, designation;
    
    public Teacher(String fname, String lname, String address, int id, String rank, String designation) {
        super(fname, lname, address, id);
        this.rank = rank;
        this.designation = designation;
    }
    
    public void setRank(String rank){this.rank = rank;}
    public void setDesignation (String designation){this.designation = designation;}
    
    public String getRank(){return rank;}
    public String getDesignation(){return designation;}
    
    @Override
    public String toString(){
        String str;
        str = super.toString();
        return str +
                "Rank: " + rank + "\n" +
                "Designation: " + designation + "\n";
    }
    
}
