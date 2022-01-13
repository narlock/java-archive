import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class Form extends JFrame{

	//JButton b1 = new JButton("OK");
	//Instead, we are in the constructor, therefore we want instance variables here
	private JButton okBtn;
	private JTextField okTxtField;
			
	public Form(String title) {
		//JFrame f = new JFrame(title);
		super(title);
		
		okBtn = new JButton("OK");
		okTxtField = new JTextField(10);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		add(okTxtField);
		add(okBtn);
		
		okBtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			getContentPane().setBackground(Color.blue);
		}
		});
			
			
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Form myForm = new Form("Form");
	}
}
