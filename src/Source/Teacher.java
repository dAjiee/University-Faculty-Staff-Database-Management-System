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
public class Teacher extends Person{
    
    private String rank, designation;
    
    public Teacher(String fname, String lname, String address, int id, String rank, String designation) {
        super(fname, lname, address, id);
        this.rank = rank;
        this.designation = designation;
    }

    public Teacher() {
        super();
        this.rank = "";
        this.designation = "";
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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Teacher teacher = (Teacher) obj;
        return Objects.equals(super.getFname(), teacher.getFname()) &&
               Objects.equals(super.getLname(), teacher.getLname()) &&
               Objects.equals(super.getAddress(), teacher.getAddress()) &&
               Objects.equals(super.getId(), teacher.getId()) &&
               Objects.equals(rank, teacher.rank) &&
               Objects.equals(designation, teacher.designation);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.getFname(), super.getLname(), super.getAddress(), super.getId(), rank, designation);
    }
    
}
