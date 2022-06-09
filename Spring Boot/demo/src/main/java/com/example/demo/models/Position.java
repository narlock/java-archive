package com.example.demo.models;

public enum Position {
	FRONTEND_DEV, BACKEND_DEV, MANAGER, INTERN;
	
	public String toString() {
		switch (this) {
		case FRONTEND_DEV:
			return "Front-end Developer";
		case BACKEND_DEV:
			return "Back-end Developer";
		case MANAGER:
			return "Manager Developer";
		case INTERN:
			return "Intern Developer";
		}
		return "No Position";
	}
}
