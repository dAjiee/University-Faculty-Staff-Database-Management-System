/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

/**
 *
 * @author Extension PC1
 */
public class Person {
    private String fname, lname, address;
    private int id;
    
    Person(){
        this.fname = "";
        this.fname = "";
        this.lname = "";
        this.address = "";
        this.id = 0;
    }
    
    Person(String fname, String lname, String address, int id){
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.id = id;
    }
    
    public void setFname(String fname){this.fname = fname;}
    public void setLname(String lname){this.lname = lname;}
    public void setAddress(String address){this.address = address;}
    public void setId(int id){this.id = id;}
    
    public String getFname(){return fname;}
    public String getLname(){return lname;}
    public String getCname(){return fname + " " + lname;}
    public String getAddress(){return address;}
    public int getId(){return id;}
    
    @Override
    public String toString(){
        return "First Name: " + fname + "\n" +
                "Last Name: " + lname + "\n" +
                "Address: " + address + "\n" +
                "ID: " + id + "\n";
    }
    
}

