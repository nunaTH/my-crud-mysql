package de.lamp.crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

    protected User() {
    }

    public User( String fName, String lName, String email){
        this.firstName = fName;
        this.lastName = lName;
        this.email = email;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("User[ID=%d, First_Name='%s',Last_Name='%s' Email='%s']", id, firstName, lastName, email);
    }
}