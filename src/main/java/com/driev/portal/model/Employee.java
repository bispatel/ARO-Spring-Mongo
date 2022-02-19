package com.driev.portal.model;
 
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
@Document (collection = "Employee")
@CompoundIndexes({
    @CompoundIndex(name = "employee_group", def = "{'firstName' : 1, 'lastName': 1}",unique=true)
})
public class Employee {

	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";
	
	 
	 
    //@Indexed(unique=true)
	private String firstName;
	private String lastName;
	
 
    //@Indexed(unique=true)
	private String emailId;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
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
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ "]";
	}	
}
