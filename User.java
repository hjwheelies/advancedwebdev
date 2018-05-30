package edu.edgewood.RCS417Project.model;

public class User {
	private String id;
	private String pwd;
	private String firstName;
	private String lastName;
	
	public User(String id, String pwd, String fname, String lname){
		this.id = id;
		this.pwd = pwd;
		firstName = fname;
		lastName = lname;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
