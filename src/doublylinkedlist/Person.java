/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author 
 */
public class Person {
    private String firstname;
	private String lastname;
	private String address;
        private String FullName;
	
	
public Person(String firstname, String lastname, String Address) {   
    this.firstname = firstname;
    this.lastname = lastname;
    this.address = address;
}  

    public String getFirstname() {
        return firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

  
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullName() {
        return FullName = this.firstname + ", " + this.lastname + ", " + this.address;
    }

 

}
