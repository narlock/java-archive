/**
 * Program Description: Stores the reservation details
 * Author: Anthony Narlock
 * Assignment: PA4
 * Date: April 11th, 2020
 * Class: CSCI 1082
 */

package edu.century.pa4;

import java.util.Date;

public class Reservation {

	//reservation class will have instance variables to store the reservation's
	//details: seat, from, to, departure date, return date
	private String seat;
	private String from;
	private String to;
	private Date departureDate;
	private Date returnDate;
	
	public Reservation(String seat, String from, String to, Date departureDate, Date returnDate) {
		this.seat = seat;
		this.from = from;
		this.to = to;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
	}
	
	//Getters and Setters
	
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	
}
