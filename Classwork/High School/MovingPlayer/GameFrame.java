import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JPanel implements ActionListener
{
    Image i;
    Timer mainTimer,blackoutTimer;
    World world;
    Player player;
    GameBorder gb;
    int mapnum,opacity,index;
    boolean blackout;
    Color mycolor;
    public GameFrame() {
        setFocusable(true);
        opacity = 100;
        blackout = false;
        player = new Player(330,340,48,63);
        world = new World(150,100,player);
        gb = new GameBorder(-145,-10,471,300);
        mapnum = 1;
        addKeyListener(new KeyAdapt(world));
        mainTimer = new Timer(10, this);
        mainTimer.start();
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        setBackground(Color.black);
        //mycolor = new Color (0,0,0,opacity);
        world.drawWorld(g2d);
        player.drawPlayer(g2d);
        
        /**Draws the Blackout Image*/ 
        
        //g.setColor(mycolor);
        //g.fillRect(0,0,720,720);
    }
    
    public void actionPerformed(ActionEvent event) {
        world.update(gb);
        //event.getSource()?
        if(opacity == 254)
        {
            blackout = false;
            world.blackoutFalse(blackout);
        }
        if(blackout == true && opacity <=  254)
        {
            opacity++;
        }
        if(blackout == false && opacity >= 0)
        {
            opacity--;
        }
        repaint();
    }
}