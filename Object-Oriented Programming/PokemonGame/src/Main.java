import java.awt.*;
import javax.swing.*;
public class Main{
    
    public static void main(String[] args){
        JFrame frame = new JFrame("Pokemon Movement");
            frame.setBounds(100,100,720,720);
            frame.add(new GameFrame());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setVisible(true);
    }
    
}


