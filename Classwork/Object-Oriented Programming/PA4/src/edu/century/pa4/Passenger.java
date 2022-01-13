/**
 * Program Description: Creates an instance of a person (passenger), that holds instance variables to store the passenger's name and reservation
 * Author: Anthony Narlock
 * Assignment: PA4
 * Date: April 11th, 2020
 * Class: CSCI 1082
 */

package edu.century.pa4;

public class Passenger {

	//Passenger class will have instance variables to store the passenger's
	//firstName, lastName, and reservation
	private String firstName;
	private String lastName;
	private Reservation reservation;
	
	//Default constructor: instance of null passenger
	public Passenger() {
		this.firstName = null;
		this.lastName = null;
		this.reservation = null;
	}
	
	//Appropriate constructor: initializes instance variables
	public Passenger(String firstName, String lastName, Reservation reservation) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.reservation = reservation;
	}
	
	//Getters / Setter methods for instance variables

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

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	@Override
	public String toString() {
		String passengerInfo = "\n[First Name: " + this.firstName + 
								"\nLast Name: " + this.lastName +
								"\nSeat Location: " + reservation.getSeat() +
								"\nDeparting From: " + reservation.getTo() +
								"\nDeparture Date: " + (reservation.getDepartureDate().getMonth()+1) + "/" + reservation.getDepartureDate().getDate() + "/" + reservation.getDepartureDate().getYear() +
								"\nDeparting To: " + reservation.getFrom() +
								"\nReturning Date: " + (reservation.getReturnDate().getMonth() + 1) + "/" + reservation.getReturnDate().getDate() + "/" + reservation.getReturnDate().getYear() +
								"]\n";
		
		return passengerInfo;
								
		}
	}
	
	

