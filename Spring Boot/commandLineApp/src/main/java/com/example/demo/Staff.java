package com.example.demo;

public class Staff {
	@Override
	public String toString() {
		return "Staff [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", position="
				+ position + ", toString()=" + super.toString() + "]";
	}

	private String employeeId;
	private String firstName;
	private String lastName;
	private Position position;
	
	public Staff() {}
	
	public Staff(String employeeId, String firstName, String lastName, Position position) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	
	
	
}
