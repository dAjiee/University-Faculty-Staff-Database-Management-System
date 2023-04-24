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
public class PersonCRUD{
    ArrayList<Person> personlist;
    
    public PersonCRUD(){
        personlist = new ArrayList<Person>();
    }
    
    public void createPerson(Person person){
        personlist.add(person);
    }
    
    public Person retrievePerson(Person person){
        for(Person p: personlist){
            if(p.equals(person)) return p;
        }
        return null;
    }
    
    public void updatePerson(Person person, Person newperson){
        Person tempperson = retrievePerson(person);
        if(tempperson != null){
            tempperson.setFname(newperson.getFname());
            tempperson.setLname(newperson.getLname());
            tempperson.setAddress(newperson.getAddress());
            tempperson.setId(newperson.getId());
        }
    }
    
    public void deletePerson(Person person){
        boolean found = false;
        for(int i = 0; i < personlist.size() && found != true; i++){
            found = personlist.get(i).equals(person);
            if (found){
                personlist.remove(i);
                return;
            }
        }
    }
    
    @Override
    public String toString(){
        String str = "";
        for (Person person: personlist){
            str += (person.getFname() + ";" + person.getLname() + ";" + person.getAddress() + ";" + person.getId() + "\n");
        }
        return str;
    }
    
}

