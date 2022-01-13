
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SpaceInvadersWithObjectClass  implements ActionListener, KeyListener
{
        JFrame f1;
        JPanel main, sub;
        GraphicsPanel2 g1;
        JButton b1,b2;
        int mx,my, xdir, ydir, inde,index,windex,totalshots,totalshots2;     //x,y,score
        boolean endgame, shottaken, shottaken2; 
        Alien1[] aliens; 
        SpaceShip sp;
        Missile[] mi,lmi;
        
        public SpaceInvadersWithObjectClass() 
    { 
        
        endgame = false;
      
       sp = new SpaceShip(300,600);   
        //x = 300;
        //y = 600;
        //score = 0;
        
        aliens = new Alien1[20];
        
        mi = new Missile[50];
        lmi = new Missile[50];
                
        /**for(index = 0; index < 2; index++)
        {
           for(windex = 0; windex < 10; windex++)
           {
                aliens[index*10 +windex] = new Alien1(windex*25+75, index*25+75);
            }
         }*/
         
          aliens[index] = new Alien1(index * 40 + 50, 20); 
        for(index = 0; index < 10; index++){
           
          aliens[index] = new Alien1(index*50+10, 75);
            }
        for(index = 10; index < 20; index++){
           
          aliens[index] = new Alien1((index-10)*50+10, 125);
            }
        
        xdir = 0;
        ydir = 0;
        
        shottaken = false;
        
        
        f1 = new JFrame("Graphics Example");
          f1.setSize(700,700);
          f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
          
        Container c1 = f1.getContentPane();
          
          g1 = new GraphicsPanel2(sp,shottaken,aliens,mi,lmi);
        //g1 = new GraphicsPanel2(x,y,shottaken,score,a1,a2);

        
        g1.addKeyListener(this);
          
        b1 =  new JButton("Start");
           b1.addActionListener(this);
        
         b2 =  new JButton("End");
           b2.addActionListener(this);
         
        sub = new JPanel(); 
          sub.add(b1);
          sub.add(b2);
                     
       main = new JPanel();
          main.setLayout(new BorderLayout());          
          main.setSize(600,600);
          main.add(g1,BorderLayout.CENTER);
          main.add(sub,BorderLayout.SOUTH);
        
        c1.add(main);
        f1.show(); 
        runGame();
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
        
        sp.moveShip(xdir, ydir);
         //x = x + xdir;     //moves player
         //y = y + ydir;
        
        if(shottaken ==true)
        { 
            for(index = 0; index < aliens.length; index++)
          {
            for(inde = 0; inde < totalshots; inde++)
            {
              if(mi[inde].getX() >= aliens[index].getX() - 10 && mi[inde].getX() <= aliens[index].getX() + 20 && mi[inde].getY() >= aliens[index].getY() - 10 && mi[inde].getY() <= aliens[index].getY() + 10 && aliens[index].getDestroyed() == false)
              {
                 aliens[index].destroyAlien();
                 sp.addScore(10);
                }
            } 
          }
          for(index = 0; index < totalshots; index++)
          {
            mi[index].moveMissile(0,-1);  
            g1.updateMissileLocation(mi,lmi,shottaken,totalshots,totalshots2);
            }
        }
        
        if(shottaken2 == true)
       {
          for(index = 0; index < aliens.length; index++)
          {
            for(windex = 0; windex < totalshots2; windex++)
            {
              if(lmi[windex].getX() >= aliens[index].getX() - 10 && lmi[windex].getX() <= aliens[index].getX() + 20 && lmi[windex].getY() >= aliens[index].getY() - 10 && lmi[windex].getY() <= aliens[index].getY() + 10 && aliens[index].getDestroyed() == false)
              {
                aliens[index].destroyAlien();
                sp.addScore(10);
              }
            }
        }
        for(windex = 0; windex < totalshots2; windex++)
          {
            lmi[windex].moveMissile(0,-5);
            g1.updateMissileLocation(mi,lmi,shottaken,totalshots,totalshots2);
            }
        }
        
        g1.updateAlien(aliens);
      
        g1.updatePlayerLocation(sp);
        //g1.updatePlayerLocation(x,y,score);
        
        g1.repaint();
      
      }         
     }    
   
    
    public void actionPerformed (ActionEvent event)
    {
        if (event.getSource() == b1)
        {
           g1.requestFocus();
         }
         
        if (event.getSource() == b2)
        {
           endgame = true;
         }
         
         
    }
    
    public void keyPressed(KeyEvent evt)
    {
       
           if(evt.getKeyCode() == 37)       //left arrow
           {
              xdir = -1;
              ydir = 0;
           }
           if(evt.getKeyCode() == 39)      //right arrow
           {
              xdir = 1;
              ydir = 0;
           }
           if(evt.getKeyCode() == 32)      // spacebar
           {
               mi[totalshots] = new Missile(sp.getX() + 5, sp.getY() - 10);
               totalshots = totalshots + 1;
               shottaken = true;
            }
           if(evt.getKeyCode() == 90)
           {
               lmi[totalshots2] = new Missile(sp.getX() +5, sp.getY() -10);
               totalshots2 = totalshots2 + 1;
               shottaken2 = true;
            }
        }
    public void keyReleased(KeyEvent evt)
    {}
    public void keyTyped(KeyEvent evt)
    {}
}