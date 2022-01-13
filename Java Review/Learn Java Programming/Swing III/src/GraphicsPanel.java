import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * While there are multiple ways to implement graphics
 * inside of a Java project, I will do this
 * by creating a new class, GraphicsPanel.
 * This one Object will handle all of our graphics needs.
 * 
 * It is a Panel, so we will extend the JPanel object.
 */

@SuppressWarnings("serial")
public class GraphicsPanel extends JPanel {
	private ImageIcon imageIcon;
	
	public GraphicsPanel() {
		setBackground(Color.YELLOW); //Coloring this graphics panel red
		this.imageIcon = new ImageIcon(getClass().getClassLoader().getResource("pika.png")); //Import image
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		/*
		 * Multiple Different kinds of things you can draw
		 */
		g.drawRect(0,10, 20, 30);
		g.fillRect(30, 10, 20, 30);
		g.drawOval(60, 10, 20, 30);
		
		imageIcon.paintIcon(this, g, 100, 100); //Paint image
	}
}
