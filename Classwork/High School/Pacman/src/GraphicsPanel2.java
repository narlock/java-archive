import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsPanel2  extends JPanel
{   
     int  index,windex, mxx, myy,ttotalshots, ttotalshots2;   //xx, yy, sscore
     boolean shottakenn,shottakenn2; 
     Alien1[] aaliens;
     SpaceShip ssp;
     Missile[] mmi,lmmi;
     
    public GraphicsPanel2(SpaceShip sp, boolean shottaken, Alien1[] aliens, Missile[] mi, Missile[] lmi) 
     //public GraphicsPanel2(int x, int y, boolean shottaken, int score, Alien1 a1, Alien1 a2) 
    {
      setBackground(Color.red);
      
      mmi = mi;
      lmmi = lmi;
      ssp = sp;
      //xx = x;
      ///yy = y;
      //sscore = score;
      
      shottakenn = shottaken;
      aaliens = aliens;
    }
   
    public void updatePlayerLocation(SpaceShip sp)
    //public void updatePlayerLocation(int x, int y, int score)
    {
      ssp = sp;
      //xx = x;
      //yy = y;
      //sscore = score;
   
    }
    
    public void updateMissileLocation(Missile[] mi, Missile[] lmi, boolean shottaken, int totalshots,int totalshots2)
    {
        mmi = mi;
        shottakenn = shottaken; 
        ttotalshots = totalshots;
        ttotalshots2 = totalshots2;
    }
    
    
    public void updateAlien(Alien1[] aliens)
    {
         aaliens = aliens;
    }
       
    public void paint (Graphics g)         
    {
        super.paint(g);                     
        
       g.setColor(Color.black);
       
       g.fillRect(ssp.getX(), ssp.getY(), 20,20);
       //g.fillRect(xx,yy,20,20);       //player
       
       
       g.setFont(new Font("Arial", Font.BOLD, 20));
       
        g.drawString("Score:" + ssp.getScore(), 10,500); 
       //g.drawString("Score:" + sscore, 10,500); 
       
       g.setColor(Color.blue);
      
       /**
      if(aa1.getDestroyed() == false) 
           g.fillRect(aa1.getX(),aa1.getY(),20,20);
         
        else
         {
           g.setColor(Color.orange);
           g.fillOval(aa1.getX(),aa1.getY(),40,40);
         
         }
          
       g.setColor(Color.blue);
         
      if(aa2.getDestroyed() == false) 
           g.fillRect(aa2.getX(),aa2.getY(),20,20);
        else
         {
           g.setColor(Color.orange);
           
           g.fillOval(aa2.getX(),aa1.getY(),40,40);
         }*/
       
       for (index = 0; index < aaliens.length; index++)
       {
           g.setColor(Color.blue);
        if(aaliens[index].getDestroyed() == false)
        {
           g.fillRect(aaliens[index].getX(),aaliens[index].getY(),20,20);
        }
           
           else
        {
            g.setColor(Color.orange);
            g.fillOval(aaliens[index].getX(),aaliens[index].getY(),20,20);
            }
        }
         
         
       if(shottakenn == true)
       {
          g.setColor(Color.yellow);
          for(index = 0; index < ttotalshots; index++)
          g.fillRect(mmi[index].getX(),mmi[index].getY(),10,10);
        }
        
       if(shottakenn2 = true)
       {
          g.setColor(Color.yellow);
          for(windex = 0; windex < ttotalshots2; windex++)
          g.fillRect(lmmi[windex].getX(),lmmi[windex].getY(),5,5);
        }
         
       
        
     }           
}
