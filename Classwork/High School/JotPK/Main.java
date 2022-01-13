/**
 * 
 * SP Pro: Computer Programming 1
 * 
 * Anthony Narlock
 * 
 * Journey of the Prairie King
 * (Based off of the hit 'Stardew Valley')
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main implements ActionListener, KeyListener
{
    JFrame f;
    JPanel p,sub;
    GraphicsPanel g;
    Container c; 
    JButton start_button,end_button;
    King hero;
    
    int xdir,ydir,face;
    boolean DEV_MODE,startgame,endgame,transition;
    
    public Main()
        {
            /** Setting Operation */
            
            setInitialValues();
            
            hero = new King(530,320);
         
            setUpFrame();
            
            runGame();
            
        }
        
    public void setInitialValues()
        {
            DEV_MODE = false;
            endgame = false;
            transition = false;
            face = 2;
            xdir = 0;
            ydir = 0;
        }
        
    public void setUpFrame()
        {
            f = new JFrame("Journey of the Prairie King");
                f.setBounds(350,200,1080,720); // Bounds set for 1920 x 1080 resolution //
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setResizable(false);
                
            c = f.getContentPane();
            
            g = new GraphicsPanel(hero,endgame);
                g.addKeyListener(this);
                
            start_button = new JButton("Play");
                start_button.addActionListener(this);
            end_button = new JButton("Quit");
                end_button.addActionListener(this);
            
            sub = new JPanel();
                sub.add(start_button);
                sub.add(end_button);
                
            p = new JPanel();
                p.setLayout(new BorderLayout());
                p.setSize(1080,720);
                p.add(g,BorderLayout.CENTER);
                p.add(sub,BorderLayout.SOUTH);
                
            c.add(p);
            f.show();
            
        }
        
    public void runGame()
        {
            Thread runner = new Thread();
            
            while(endgame == false)
                {
                    try
                        {
                            runner.sleep(5);
                        }
                            catch(InterruptedException e) {}
                    
                    if(startgame = true)
                        {
                            hero.moveKing(xdir,ydir);
                            g.updateLocation(hero);
                            
                            g.updateFace(face);
                            g.repaint();
                        }
                          
                }
            
        }
        
    public void actionPerformed (ActionEvent event)
        {
            if(event.getSource() == start_button)
                {
                    startgame = true;
                    transition = true;
                    g.updateTransition(DEV_MODE,transition,endgame);
                    g.requestFocus();
                    g.repaint();
                }
            if(event.getSource() == end_button)
                {
                    endgame = true;
                    g.updateTransition(DEV_MODE,transition,endgame);
                    if(DEV_MODE == false) {System.exit(0);}
                }
        }
        
    public void keyPressed(KeyEvent evt)
        {
           if(evt.getKeyCode() == 81) /** "q" ENTER DEVELOPER MODE */
               {
                   DEV_MODE = true;
                   g.updateTransition(DEV_MODE, transition, endgame);
                   g.repaint();
               }
           if(evt.getKeyCode() == 69) /** "e" EXIT DEVELOPER MODE */
               {
                   DEV_MODE = false;
                   g.updateTransition(DEV_MODE, transition, endgame);
                   g.repaint();
               }    
           
               /** MOVEMENT KEYS */
               
           if(evt.getKeyCode() == 87) /** W */ {
                  xdir = 0; ydir = -1; face = 1; } 
           if(evt.getKeyCode() == 83) /** D */ {
                  xdir = 0; ydir = 1; face = 2; }
           if(evt.getKeyCode() == 65) /** A */ {
                  xdir = -1; ydir = 0; face = 3; }
           if(evt.getKeyCode() == 68) /** S */ {
                  xdir = 1; ydir = 0; face = 4; } 
           if(evt.getKeyCode() == 70) /** F */ {
                  xdir = 0; ydir = 0; }        
                  
               /** COMBAT KEYS */   
             
            
        }
    public void keyReleased(KeyEvent evt)
        {
           /**if(evt.getKeyCode() == 87) 
               {
                  xdir = 0;
                  ydir = 0;
               }
           if(evt.getKeyCode() == 83)
               {
                  xdir = 0;
                  ydir = 0;
                }
           if(evt.getKeyCode() == 65) 
               {
                  xdir = 0;
                  ydir = 0;
                }
           if(evt.getKeyCode() == 68) 
               {
                  xdir = 0;
                  ydir = 0;
                } */
                
        }
    public void keyTyped(KeyEvent evt) {}    
    
}