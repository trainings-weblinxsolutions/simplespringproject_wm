package com.saliljavatrainings;

public class Student {
private String firstName;
private String id;






public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public void displayInfo(){
	System.out.println("Hello: "+firstName + " your id is :"+id);
}
}
