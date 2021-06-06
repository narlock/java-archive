import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class GraphicsPanel3  extends JPanel
{   
     int pacside,eeatghostcounter,ffruittimer, index, xx, yy, sscore, ppx1, ppy1, ppx2, ppy2, gghx1, gghy1, gghx2, gghy2,llevel,npee;
     boolean eatt1, eatt2, eendgame;
     ArrayList<Pellet> ppellet,ppowerpellet;
     ArrayList<Fruit> ffruit;
     Pacman ppac;
     Ghost[] gghost;
     Image[] ghostimage;
     GameBorder gbb;
     Image logo, pacmanright,pacmanleft,pacmanup,pacmandown, eatghost, flashghost, cherry;
     String nname;
     JLabel llab1;
     HighScore hhs;
   
    public GraphicsPanel3(Pacman pac, int score, ArrayList<Pellet> pellet, ArrayList<Pellet> powerpellet, Ghost[] ghost, boolean endgame, GameBorder gb, ArrayList<Fruit> fruit,int npe, HighScore hs)               
    {
      /** Declare variables */
      setBackground(Color.black);
      logo = Toolkit.getDefaultToolkit().getImage("logo.png");
      pacmanright = Toolkit.getDefaultToolkit().getImage("pacman.png");
      pacmanleft = Toolkit.getDefaultToolkit().getImage("pacmanleft.png");
      pacmanup = Toolkit.getDefaultToolkit().getImage("pacmanup.png");
      pacmandown = Toolkit.getDefaultToolkit().getImage("pacmandown.png");
      
      ghostimage = new Image[4];
      ghostimage[0] = Toolkit.getDefaultToolkit().getImage("ghost1.png");
      ghostimage[1] = Toolkit.getDefaultToolkit().getImage("ghost2.png");
      ghostimage[2] = Toolkit.getDefaultToolkit().getImage("ghost3.png");
      ghostimage[3] = Toolkit.getDefaultToolkit().getImage("ghost4.png");
      
      eatghost = Toolkit.getDefaultToolkit().getImage("eatghost.png");
      flashghost = Toolkit.getDefaultToolkit().getImage("whiteeatghost.png");
      cherry = Toolkit.getDefaultToolkit().getImage("cherry.png");
      
      ppac = pac;
      sscore = score;
      gbb = gb;
      ppellet = pellet;
      ppowerpellet = powerpellet;
      gghost = ghost;
      ffruit = fruit;
      npee = npe;
      hhs = hs;
      eendgame = endgame;
      pacside = 0;
      
    }
   
    /** Method locations */
    public void updateLocation(Pacman pac, int score, boolean endgame, int level, String dd)
    {
      ppac = pac;
      sscore = score;
      eendgame = endgame;
      llevel = level;
      /**if(dd.equals("right")){
          pacside = 0;
        }
      if(dd.equals("left")){
          pacside = 1;
        }
      if(dd.equals("up")){
          pacside = 2;
        }
      if(dd.equals("down")){
          pacside = 3;
        }  */
    }
    
    public void updatePellets(ArrayList<Pellet> pellet)
    {
       ppellet = pellet;
    }
    
    public void updatePacLocation(int ppacside)
    {
        pacside = ppacside;
    }
    
    public void updateObjects(ArrayList<Pellet> powerpellets, int eatghostcounter, ArrayList<Fruit> fruit, int fruittimer, int npe, String name, JLabel lab1)
    {
      ppowerpellet = powerpellets;
      eeatghostcounter = eatghostcounter;
      ffruittimer = fruittimer;
      npee = npe;
      ffruit = fruit;
      nname = name;
      llab1 = lab1;
    }
    
    public void setGameOver(boolean endgame)
    {
      eendgame = endgame;   
    }
    
    public void updateHighScore(HighScore hs)
    {
     hhs = hs;   
    }
    
    public void paint (Graphics g)         
    {
        super.paint(g);       
       
       /** Draw Game Border */
       g.setColor(Color.black);
       g.drawRect(gbb.getXStart(),gbb.getYStart(),gbb.getXDim(),gbb.getYDim());
       g.setColor(Color.blue);
       g.drawRect(5,5,655,655);
       g.setColor(Color.blue);
       g.drawRect(30,30,180,180);
       g.drawRect(240,30,180,180);
       g.drawRect(450,30,180,180);
       g.drawRect(30,240,180,180);
       g.drawRect(30,450,180,180);
       g.drawRect(240,240,180,180);
       g.drawRect(240,450,180,180);
       g.drawRect(450,240,180,180);
       g.drawRect(450,450,180,180);
       
       /** Black Lines */
       g.setColor(Color.black);
       g.drawRect(5,212,5,27);
       g.drawRect(5,422,5,27);
       g.drawRect(655,212,5,27);
       g.drawRect(655,422,5,27);
       
       /** White lines */
       g.setColor(Color.white);
       g.drawRect(0,210,5,0);
       g.drawRect(0,241,5,0);
       g.drawRect(0,420,5,0);
       g.drawRect(0,451,5,0);
       g.drawRect(660,210,5,0);
       g.drawRect(660,241,5,0);
       g.drawRect(660,420,5,0);
       g.drawRect(660,451,5,0);
       

       
         /** Draw Cherry */ 
       if(ffruit.size()>0)
       for(int i=0;i<ffruit.size();i++)
       g.drawImage(cherry,ffruit.get(i).getX(),ffruit.get(i).getY(),20,20,null);
       
       /** Draw Pellets */
       g.setColor(Color.white);
       for(index = 0; index < ppellet.size(); index++)
       {
           if(ppellet.get(index).getEat() == false)
           g.fillOval(ppellet.get(index).getX(),ppellet.get(index).getY(),5,5); 
        }
       
       /** Draw powerpellets */ 
       for(index = 0; index < ppowerpellet.size(); index++)
       {
         if(ppowerpellet.get(index).getEat() == false)
        {
          g.setColor(Color.white);
          g.fillOval(ppowerpellet.get(index).getX(),ppowerpellet.get(index).getY(),15,15);
        }    
       }
       
       /** Draw Ghosts */
        for(index = 0; index < gghost.length; index++)
        {
          if(gghost[index].getDidEat() == false)
          {
            if(gghost[index].getCanEat() == false)
              {
               g.drawImage(ghostimage[index],gghost[index].getX(), gghost[index].getY(),20,20,null);
              }
            if(gghost[index].getCanEat() == true)
             {
                 if(eeatghostcounter > 500 && eeatghostcounter % 50 > 25)
                 g.drawImage(flashghost,gghost[index].getX(), gghost[index].getY(),20,20,null);
                 else g.drawImage(eatghost,gghost[index].getX(), gghost[index].getY(),20,20,null); 
             }               
          }
        }
        
       /** Draw Pacman */
       if(pacside == 0)
       g.drawImage(pacmanright,ppac.getX(),ppac.getY(),20,20,null);
       /**else{
       g.setColor(Color.black);
       g.fillOval(ppac.getX(),ppac.getY(),20,20);}*/
       if(pacside == 1)
       g.drawImage(pacmanleft,ppac.getX(),ppac.getY(),20,20,null);
       /**else{
       g.setColor(Color.black);
       g.fillOval(ppac.getX(),ppac.getY(),20,20);}*/
       if(pacside == 2)
       g.drawImage(pacmanup,ppac.getX(),ppac.getY(),20,20,null);
       /**else{
       g.setColor(Color.black);
       g.fillOval(ppac.getX(),ppac.getY(),20,20);}*/
       if(pacside == 3)
       g.drawImage(pacmandown,ppac.getX(),ppac.getY(),20,20,null);
       /**else{
       g.setColor(Color.black);
       g.fillOval(ppac.getX(),ppac.getY(),20,20);}*/
       
       
       /** Draw Score and Game over stage */ 
       g.setColor(Color.yellow);
       g.setFont(new Font("Lucida Console", Font.BOLD, 15));
       g.drawString("SCORE : " + ppac.getScore(), 8,680);
       g.setColor(Color.red);
       
       g.drawString("HIGHSCORE OF " + hhs.getDisplayInfo(),8,698);
       g.setColor(Color.yellow);
       g.drawString("LEVEL : " + llevel,8,716);
       g.setColor(Color.red);
       //g.drawString("LIVES : ",510,688);
       g.setColor(Color.yellow);
       g.drawString("PELLETS EATEN : " + npee + "/163",435,715);
       
       for(int index = 0; index < ppac.getLives(); index++)
       {
         g.drawImage(pacmanright, 635 - index * 32, 668,25,25,null);  
        }
       

        
       g.setColor(Color.red);
       if(eendgame == true)
       {
          g.setFont(new Font("Lucida Console", Font.BOLD, 30));
          g.drawString("GAME OVER",240,340);
        }
       
     }           
}
 