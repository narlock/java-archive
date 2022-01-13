/**
 * Program Description: Creates Shopping Cart GUI in which allows user to select an excel file with proper arguments and sorts it based off of chosen algorithm
 * Author: Anthony Narlock
 * Assignment: PA5
 * Date: May 4, 2020
 * Class: CSCI 1082
 */
package edu.century.pa5;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class ShoppingCartGUI extends JFrame {

	//Component declaration
	private JPanel topPanel, centerPanel;
	private JTextField selectedFileTextField;
	private JButton browseButton, sortButton;
	private JComboBox sortByComboBox;
	private JTextArea originalTextArea, sortedTextArea;
	
	//File information declaration
	private String filePath, fileInfo;
	private File file, sortedFile;
	private ArrayList<Product> productsList;
	
	public ShoppingCartGUI() {
		//Calling methods on startup
		
		setUpFrame();
		
		initVariables();
		
		initFrameComponents();

		setUpGUI();
		
		//This line is simply so that the program will show
		this.setSize(850,601);
	}
	
	public void setUpFrame() {
		//Sets up frame
		this.setTitle("Shopping Cart");
		this.setSize(850,600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void initVariables() {
		//Initializes variables
		
		fileInfo = "";
		productsList = new ArrayList<Product>();
	}
	
	public void initFrameComponents() {
		//Initialize Panels
		topPanel = new JPanel();
		centerPanel = new JPanel();
		
		//Initialize other Components
		selectedFileTextField = new JTextField(10);
		sortByComboBox = new JComboBox();
		originalTextArea = new JTextArea();
		sortedTextArea = new JTextArea();
		
		//Initialize combo box
		sortByComboBox.setModel(new DefaultComboBoxModel
				(new String[] {"ID", "NAME", "DESCRIPTION","PRICE"}));
		
		//Initialize browse button and show function
		browseButton = new JButton("Browse");
		
		browseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createJFileChooser();
			}
		});
		
		//Initialize sort and show button function
		sortButton = new JButton("Sort");
		
		sortButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				readFromFile();
				originalTextArea.setText(fileInfo);
				
				updateProductList();
				
				String sortedFileInfo = "";
				if(sortByComboBox.getSelectedItem().equals("ID")) {
					Collections.sort(productsList, Product.CompareById);
				}
				if(sortByComboBox.getSelectedItem().equals("DESCRIPTION")) {
					Collections.sort(productsList, Product.CompareByDescription);
				}
				if(sortByComboBox.getSelectedItem().equals("PRICE")) {
					Collections.sort(productsList, Product.CompareByPrice);
				}
				if(sortByComboBox.getSelectedItem().equals("NAME")) {
					Collections.sort(productsList, Product.CompareByName);
				}
				
				for(int i = 0; i < productsList.size(); i++) {
					sortedFileInfo += productsList.get(i).toString();
				}
				
				
				writeToFile(sortedFileInfo);
				sortedTextArea.setText(sortedFileInfo);
			}
		});
	}
	
	public void setUpGUI() {
		//Sets Main Pane information
		this.getContentPane().setLayout(new BorderLayout());
		
		//Adds sub-panes with information
		topPanel.setLayout(new FlowLayout());
		centerPanel.setLayout(new GridLayout(1,2,0,0));
		
		//Adds primary sub-panes
		this.getContentPane().add(topPanel, BorderLayout.NORTH);
		this.getContentPane().add(centerPanel, BorderLayout.CENTER);
		
		//calls methods to add components to panels
		addComponentsToTopPanel();
		addComponentsToCenterPanel();
	}
	
	public void addComponentsToTopPanel() {
		//Adds correct components to top JPanel
		topPanel.add(selectedFileTextField);
		topPanel.add(browseButton);
		topPanel.add(sortByComboBox);
		topPanel.add(sortButton);
	}
	
	public void addComponentsToCenterPanel() {
		//Adds correct components to bottom JPanels
		centerPanel.add(originalTextArea);
		originalTextArea.setBorder(new TitledBorder(null, "Original File", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		centerPanel.add(sortedTextArea);
		sortedTextArea.setBorder(new TitledBorder(null, "Sorted File", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
	}
	
	public void createJFileChooser() {
		//Sets up the JFileChooser 
		JFileChooser fileChooser = new JFileChooser();
		int r = fileChooser.showOpenDialog(null);
		
		//Ensures proper file is selected
		if(r == JFileChooser.APPROVE_OPTION) {
			filePath = fileChooser.getSelectedFile().getAbsolutePath();
			selectedFileTextField.setText(filePath);
			file = fileChooser.getSelectedFile();
		}
	}
	
	public void writeToFile(String sortedFileInfo) {
		//The write to file method
		String newFilePath = filePath.substring(0,filePath.lastIndexOf('\\')) + "\\sortedProducts.csv";
		
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(newFilePath, true));
			pw.print(sortedFileInfo);
			pw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void readFromFile() {
		//Method that reads the selected file
		try {
			Scanner file = new Scanner(new FileInputStream(filePath));
			while (file.hasNextLine()) {
				String line = file.nextLine(); //read the line
				fileInfo += line + "\n";
			}
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	public void updateProductList() {
		//Temp values for storing information
		int tempIndex = -1;
		String tempString = "";
		
		while(fileInfo.indexOf("\n", tempIndex + 1) != -1) {
			//Catch information: substring is based off of beginning of line to the \n (indicated end of line)
			tempString = fileInfo.substring(tempIndex + 1, fileInfo.indexOf("\n", tempIndex + 1));

			//Split the tempString, creating a string array depending on the values separated by commas.
			String[] tempValues = tempString.split(",");
			int tempID = Integer.parseInt(tempValues[0]);
			double tempPrice = Double.parseDouble(tempValues[1]);
			String tempName = tempValues[2];
			String tempDesc = tempValues[3];
			
			//Add new product to the ArrayList
			productsList.add(new Product(
					tempName,
					tempID, 
					tempDesc, 
					tempPrice));
			tempIndex = fileInfo.indexOf("\n", tempIndex + 1);
		}
		
	}
	
	public static void main(String[] args) {
		ShoppingCartGUI test = new ShoppingCartGUI();
	}
	
}