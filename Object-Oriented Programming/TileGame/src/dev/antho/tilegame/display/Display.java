package dev.antho.tilegame.display;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {

	private JFrame frame; //The screen
	private Canvas canvas; //Allows us to draw graphics
	
	private String title;
	private int width, height; //width & height of frame in pixels
	
	public Display(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		
		createDisplay();
	}
	
	private void createDisplay() {
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		//To ensure that the canvas stays at the following set width and height
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		
		frame.add(canvas);
		frame.pack(); //Resize our window so we can see our canvas fully
		
	}
	
	public Canvas getCanvas() {
		return canvas;
	}
}
