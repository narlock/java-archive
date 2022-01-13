import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

/**
 * GUI - Graphical User Interface
 * @author antho
 * 
 * A GUI is a form of user interface that allows users
 * to interact with a computer program through
 * components on a window.
 * 
 * This is the alternative to purely text-based
 * software that runs in a command-line terminal.
 * 
 * GUI's can provide ease of usability for program users.
 * 
 * This GUI will be created with Java's Swing.
 * Swing is pretty outdated, but is easy to learn,
 * and still usable.
 * 
 * Swing works using a Frame, representing the main window,
 * and utilizes other components like Panels, Buttons, Labels, etc.
 * for functionality purposes.
 * 
 * The GUI in this example will just highlight the basics of
 * Swing user interface, but not actually provide 
 * functionality to the components we implement.
 * 
 * I will also be using my style of creating a GUI,
 * referring to how I implement the methods, etc.
 * 
 * For more components and visualizations, MIT made a good web site here
 * https://web.mit.edu/6.005/www/sp14/psets/ps4/java-6-tutorial/components.html
 *
 */

//I've made the class inherit the properties of the JFrame class - the main window that will appear
public class GUI extends JFrame {
	//Components of the GUI
	private JPanel northPanel, centerPanel, southPanel;
	private JButton button1, button2;
	private JLabel label1, label2, label3;
	private JTextField textField;
	private JComboBox comboBox;
	
	//Constructor
	public GUI() {
		
		//These methods are here to display the order in which events happen.
		setUpFrame();
		
		initializeFrameComponents();
		
		setUpGUI();
		
		this.setSize(500,200); //Changes the window size, so components reset and are visible
	}

	private void setUpFrame() {
		//Since this class is the JFrame, we can use this to represent the frame.
		this.setTitle("Example GUI"); //Set the title of the Window
		this.setSize(500,199); //Sets the size of the window, width, height (alternatives like setBounds exist as well)
		this.setLocationRelativeTo(null); //Sets the location of the window in the middle of the user's screen
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //When the 'X' is hit to close the window, the program will stop
		this.setVisible(true); //Enables the frame to be visible
	}
	
	private void initializeFrameComponents() {
		//North Panel initialization and components
		northPanel = new JPanel();
		northPanel.setBackground(Color.GREEN);
			label1 = new JLabel("Hello!");
				label1.setForeground(Color.RED);
			label2 = new JLabel("World!");
				label2.setForeground(Color.BLUE);
			
		northPanel.add(label1);
		northPanel.add(label2);
			
		//Center Panel initialization and components
		centerPanel = new JPanel();
			label3 = new JLabel("Java is the \n best programming language");
				label3.setFont((new Font("Times New Roman", Font.BOLD, 24)));
			textField = new JTextField(10);
				textField.setText("you can type here!");
		
		centerPanel.add(label3, BorderLayout.CENTER);
		centerPanel.add(textField, BorderLayout.SOUTH);
	
		//Bottom Panel initialization and components
		southPanel = new JPanel();
		southPanel.setBackground(Color.CYAN);
			button1 = new JButton("Press Me!");
			button2 = new JButton("I am another button!");
			comboBox = new JComboBox();
				comboBox.addItem("Option 1");
				comboBox.addItem("Cheeseburger");
		
		southPanel.add(button1);
		southPanel.add(button2);
		southPanel.add(comboBox);
				
	}
	
	private void setUpGUI() {
		//Put Panels on GUI
		
		//There are multiple types of Layouts, but
		//by default, Swing uses the BorderLayout
		this.add(northPanel, BorderLayout.NORTH);
		this.add(centerPanel, BorderLayout.CENTER);
		this.add(southPanel, BorderLayout.SOUTH);
		
	}
	
	
}
