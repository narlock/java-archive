/**
 * Program Description: Creates GUI for airplane booking.
 * Author: Anthony Narlock
 * Assignment: PA4
 * Date: April 15, 2020
 * Class: CSCI 1082
 */

package edu.century.pa4;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class BookingGUI extends JFrame {

	//Initialize variables, components, constants
	
	private JPanel bottomPanel, gridTop, gridBot;
	private JScrollPane bottomScrollPane;
	private JLabel firstNameLabel, lastNameLabel, toLabel, fromLabel, departDateLabel, returnDateLabel, seatLabel;
	private JTextField firstNameText, lastNameText, toText, fromText, departText, returnText;
	private JComboBox seatComboBox;
	private JButton bookReservation, listReservations, clearConsole;
	private JTextArea consoleTextArea;
	
	private Passenger[] passengers;
	public static final int MAX_PASSENGERS = 16;
	public static int current_passengers = 0;
	
	public BookingGUI() {
	
		//Methods that implement and run the Booking GUI
		
		setUpFrame();
		
		initVariables();
		
		initFrameComponents();
		
		initComponentAlignments();
		
		setUpGUI();
		
		//This line is simply in here so the frame will actually display.
		this.setSize(501,300);
	}
	
	public void setUpFrame() {
		//Sets up frame information
		this.setTitle("Flight Booker");
		this.setSize(500,300);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	public void initVariables() {
		//Initializes variables
		passengers = new Passenger[MAX_PASSENGERS];
	}
	
	public void initFrameComponents() {
		//Initialize Panels
	    bottomPanel = new JPanel();
	    gridTop = new JPanel();
	    gridBot = new JPanel();
	    bottomScrollPane = new JScrollPane();
	    
	    //Initialize Labels
	    firstNameLabel = new JLabel("First Name:  ");
	    lastNameLabel = new JLabel("Last Name:  ");
	    toLabel = new JLabel("To:  ");
	    fromLabel = new JLabel("From:  ");
	    departDateLabel = new JLabel("Departure Date:  ");
	    returnDateLabel = new JLabel("Return Date:  ");
	    seatLabel = new JLabel("Seat:  ");
	    
	    //Initialize Text Fields
	    firstNameText = new JTextField(10);
	    lastNameText = new JTextField(10);
	    toText = new JTextField(10);
	    fromText = new JTextField(10);
	    
	    //Defaulting the Date Arguments MM/DD/YYYY (to make it clear to user to enter a date)
	    departText = new JTextField(10);
	    departText.setText("MM/DD/YYYY");
	    returnText = new JTextField(10);
	    returnText.setText("MM/DD/YYYY");
	    
	    //Initialize Combo Box
	    seatComboBox = new JComboBox();
	    seatComboBox.setModel(new DefaultComboBoxModel 
	    		(new String[]  {"1A", "1B", "1C", "1D",
	    						"2A", "2B", "2C", "2D",
	    						"3A", "3B", "3C", "3D",
	    						"4A", "4B", "4C", "4D" }));
	    
	    //Initialize Console Text Area 
	    consoleTextArea = new JTextArea();
	    
	  //Initialize JButton, WITH ACTIONS
	    bookReservation = new JButton("Book");
	    
	    bookReservation.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String tempFirstName = firstNameText.getText();
	    		String tempLastName = lastNameText.getText();
	    		
	    		Reservation tempReservation = newReservation();
	    		if(tempReservation == null)
	    			return;
	    		
	    		Passenger p = new Passenger(tempFirstName, tempLastName, tempReservation);
	    		addPassenger(p);
	    	}
		});
	    
	    listReservations = new JButton("List Reservations");
	    
	    listReservations.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		for(int i = 0; i < passengers.length; i++) {
	    			if(passengers[i] == null)
	    				break;
	    			consoleTextArea.append("Passenger #" + (i+1) + passengers[i].toString());
	    		}
	    	}
	    });
	    
	    clearConsole = new JButton("Clear Console");
	    
	    clearConsole.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		consoleTextArea.setText("");
	    	}
	    });
	}
	
	public void initComponentAlignments() {
		//Sets the alignments of all the labels: Right oriented
		firstNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lastNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		toLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		fromLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		departDateLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		returnDateLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		seatLabel.setHorizontalAlignment(SwingConstants.RIGHT);
	}
	
	public void setUpGUI() {
		//Sets Main Pane information
		this.getContentPane().setLayout(new GridLayout(2, 1, 0, 0));
		
		//Adds sub-panes with information
		gridTop.setLayout(new GridLayout(4, 4, 0, 0));
		bottomPanel.setLayout(new BorderLayout());
		gridBot.setLayout(new FlowLayout());
		
		//Adds primary sub-panes
		this.getContentPane().add(gridTop);
		this.getContentPane().add(bottomPanel);
		bottomPanel.add(gridBot, BorderLayout.NORTH);
		bottomPanel.add(bottomScrollPane, BorderLayout.CENTER);
		
		//calls methods to add components to panels
		addComponentsToTopPanel();
		addComponentsToBottomPanel();
	}
	
	public void addComponentsToTopPanel() {
		//Adds correct components to top JPanel
		gridTop.add(firstNameLabel);
		gridTop.add(firstNameText);
		gridTop.add(lastNameLabel);
		gridTop.add(lastNameText);
		gridTop.add(toLabel);
		gridTop.add(toText);
		gridTop.add(fromLabel);
		gridTop.add(fromText);
		gridTop.add(departDateLabel);
		gridTop.add(departText);
		gridTop.add(returnDateLabel);
		gridTop.add(returnText);
		gridTop.add(seatLabel);
		gridTop.add(seatComboBox);
				
	}
	
	public void addComponentsToBottomPanel() {
		//Adds correct components to bottom JPanels
		gridBot.add(bookReservation);
		gridBot.add(listReservations);
		gridBot.add(clearConsole);
		
		bottomScrollPane.add(consoleTextArea);
		bottomScrollPane.setViewportView(consoleTextArea);
		bottomScrollPane.setViewportBorder(new TitledBorder(null, "Console: ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
	}
	
	public Reservation newReservation() {
		//Returns new reservation
		Reservation r = null;
		
		//Get information for seat, to, from, departDate, returnDate
		String tempSeat = (String) seatComboBox.getSelectedItem();
		String tempTo = toText.getText();
		String tempFrom = fromText.getText();
		
		//Using substrings to get actual date
		
		int departMonth = (Integer.parseInt(departText.getText().substring(0,2)) - 1);
		int departDay = Integer.parseInt(departText.getText().substring(3,5));
		int departYear = Integer.parseInt(departText.getText().substring(6));
		
		int returnMonth = (Integer.parseInt(returnText.getText().substring(0,2)) - 1);
		int returnDay = Integer.parseInt(returnText.getText().substring(3,5));
		int returnYear = Integer.parseInt(returnText.getText().substring(6));
		
		Date tempDepartDate = new Date(departYear,departMonth,departDay);
		Date tempReturnDate = new Date(returnYear, returnMonth, returnDay);
		
		//If the date is invalid, return null, this will prompt back and return out of actionListener
		if(tempDepartDate.after(tempReturnDate)) {
			consoleTextArea.append("Error: Dates are invalid.\n");
			return null;
		}
		
		//Creates new reservation and returns 
		r = new Reservation(tempSeat, tempTo, tempFrom, tempDepartDate, tempReturnDate);
		
		return r;
	}
	
	public void addPassenger(Passenger p) {
		//method to add a passenger
		
		//Checks if the passenger count has been exceeded
		if(current_passengers == MAX_PASSENGERS) {
			consoleTextArea.append("Error: Sorry, but no more passengers can board!\n");
			return;
		}
		
		//Checks if a specific seat has already been taken
		for(int i = 0; i < current_passengers; i++) {
			if(passengers[i].getReservation().getSeat().equals(p.getReservation().getSeat())) {
				consoleTextArea.append("Error: Seat is already taken by existing passenger.\n");
				return;
			}
		}
		
		//Adds passenger to array
		passengers[current_passengers++] = p;
		consoleTextArea.append(p.getFirstName() + " " + p.getLastName() + " successfully took reservation on plane at seat " + p.getReservation().getSeat() + "\n");
		
		
	}
	
	
	//Note: Assignment only asked for THREE classes. I decided to put the main method here.
	public static void main(String[] args) {
		BookingGUI test = new BookingGUI();
	}
	
}
