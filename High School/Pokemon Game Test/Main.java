/**
 * 
 * Special Projects: Computer Programming 1 Hybrid
 * 
 * Anthony Narlock
 * Spencer Ekstrom
 * 
 * Java Pokemon Game
 * 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.io.File;
import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Main implements KeyListener
    {
        JFrame f;
        JPanel main;
        String[] blurbline1, blurbline2;
        GraphicsPanel g;
        Container c;
        Player hero;
        
        int blurbnum, option, a;
        boolean DEVMODE, proceed, showblurb, startgame, endgame;
    
        public Main()
            {
                /** Beginning Operation */
                
                setInitialValues();
                
                setUpFrame();
                
                makeBeginningLabel();
                
            }
            
        private void setInitialValues()
            {
                DEVMODE = true;
                option = 0;
                blurbnum = 1;
                startgame = false;
                endgame = false;
                showblurb = true; 
                proceed = true;
            }
            
        private void setUpFrame()
            {
                f = new JFrame("Pokémon Java Version - INDEV 0.1");
                    f.setBounds(550,200,720,720);
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    f.setResizable(false);
                
                c = f.getContentPane();
                
                main = new JPanel();
                    main.setLayout(new BorderLayout());
                    main.setSize(720,720);
                                    
                g = new GraphicsPanel(showblurb,option);
                g.addKeyListener(this);
                main.add(g,BorderLayout.CENTER);
                    
                c.add(main);
                f.show();
            }
            
        private void makeBeginningLabel()
            {
                while(endgame == false)
                {
                    
                        if(startgame == false)
                        {
                        
                            g.updateBlurbMessage(blurbnum);
                            g.updateStartValues(showblurb,option,proceed);   
                        }
                    
                        if(option == 1)
                        {
                            startGame();
                        }
                }
            }
            
        private void startGame()
            {
                Thread runner = new Thread();
                
                while(startgame == true)
                    {
                        try
                            {
                                runner.sleep(5);
                            }
                                catch(InterruptedException e) {}
                    }
                
            }
        
        public void keyPressed(KeyEvent evt)
            {
                /** Action Keys */
                if(proceed == true)
                {
                    if(evt.getKeyCode() == 10) /** Enter/Return Key */
                        {
                            blurbnum++;
                            g.updateBlurbMessage(blurbnum);
                        }
                }
                
                /** Player Movement Keys */
                if(evt.getKeyCode() == 87) /** 'W' Key */
                    {
                        
                    }
                if(evt.getKeyCode() == 65) /** 'A' Key */
                    {
                        
                    }
                if(evt.getKeyCode() == 83) /** 'S' Key */
                    {
                        
                    }
                if(evt.getKeyCode() == 68) /** 'D' Key */
                    {
                        
                    }
                    
                if(DEVMODE == true)
                {
                    if(evt.getKeyCode() == 35) /** 'END' Key */
                        {
                         endgame = true;
                        }
                }
                    
            }
        public void keyReleased(KeyEvent evt) {}
        public void keyTyped(KeyEvent evt) {}

}