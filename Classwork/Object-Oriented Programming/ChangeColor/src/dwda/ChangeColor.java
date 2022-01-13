package dwda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ChangeColor {
static int index = 0;
public static void main(String[] args)
{

JFrame frame = new JFrame("Color");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel label = new JLabel("Click the button to change the background color.");
JButton button = new JButton("Change Color");

Color[] colorArray = new Color[4];

colorArray[0] = Color.red;
colorArray[1] = Color.blue;
colorArray[2] = Color.yellow;
colorArray[3] = Color.green;

button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
int position= (index++) % 4;
frame.getContentPane().setBackground(colorArray[position]);
}
});

frame.getContentPane().setLayout(new FlowLayout());


frame.getContentPane().add(button);
frame.getContentPane().add(label);
frame.setSize(500, 500);
frame.setVisible(true);
}
}
