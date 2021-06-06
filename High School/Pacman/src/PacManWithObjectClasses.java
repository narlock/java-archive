/**
 *  Computer Programming 2 - Pacman
 * 
 *  Anthony Narlock
 *  PAC-MAN Game
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.io.File;
import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.print.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class PacManWithObjectClasses  implements ActionListener, KeyListener, Printable, MouseListener
{
        
        JFrame f1;
        JPanel main, sub;
        GraphicsPanel3 g1;
        JButton b1,b2;
        int eatenghostsnumber, eatghostcounter,ghoststeps,totalGhosts,windex,index, x,y, xdir, ydir, score, px, py,choice;
        int levelpausecounter, level, fruittimer,npe, highscore, newscore, newhighscore, printchoice;
        int mousestartx, mousestarty, mouseendx, mouseendy;
        boolean startgame, endgame, eat, caneatghosts, oktoprint;
        ArrayList<Pellet> pellet, powerpellet;
        ArrayList<Fruit> fruit;
        Pacman pac;
        Ghost[] ghost;
        String desireddirection, name, filename, highscoreS,prinths;
        GameBorder gb;
        Clip audio1, audio2, audio3, audio4, audio5;
        JLabel lab1, pressp;
        ImageIcon pacman;
        File hsfile;
        FileReader freader;
        BufferedReader breader;
        FileWriter fwriter; 
        BufferedWriter bwriter;
        HighScore hs;
        PrinterJob job;
        PageFormat pf;
        Image printfin, ahsimage, adateimage, asealimage, acertimage, acertbordimage,pacimage,eghimage;
        Date todaysdate;
        SimpleDateFormat monthnumber, monthfull, monthshort, daynumber, dayofweekshort, dayofweekfull, yearshort, yearfull;
        
    public PacManWithObjectClasses() 
    { 
        /** Division of Methods */
        setInitialValues();
        
        makeArrays();
        
        makePellets();
        
        makePowerPellets();
        
        makeGhosts();
        
        pac = new Pacman(425,425); 
        
        gb = new GameBorder(8,8,649,649);
        
        setUpFrame();
        
        runGame();
    }
    
    private void setInitialValues()
    {
        /** Set Initial Values */
        score = 0;
        ghoststeps = 100;
        choice = 100;
        printchoice = 100;
        startgame = false;
        endgame = false;
        xdir = 0;
        ydir = 0;
        desireddirection = "";
        level = 1;
        levelpausecounter = 700;
        pacman = new ImageIcon("pacman.gif");
        lab1 = new JLabel("");
        pressp = new JLabel("Press P To Pause");
        
        try {
                AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("pacman_beginning.wav"));
                audio1 = AudioSystem.getClip();
                audio1.open(audioIn);
                
                AudioInputStream audioIn2 = AudioSystem.getAudioInputStream(new File("pacman_chomp.wav"));
                audio2 = AudioSystem.getClip();
                audio2.open(audioIn2);
                
                AudioInputStream audioIn3 = AudioSystem.getAudioInputStream(new File("pacman_death.wav"));
                audio3 = AudioSystem.getClip();
                audio3.open(audioIn3);
                
                AudioInputStream audioIn4 = AudioSystem.getAudioInputStream(new File("pacman_eatghost.wav"));
                audio4 = AudioSystem.getClip();
                audio4.open(audioIn4);
                
                AudioInputStream audioIn5 = AudioSystem.getAudioInputStream(new File("pacman_intermission.wav"));
                audio5 = AudioSystem.getClip();
                audio5.open(audioIn5);
             } catch(Exception ex) 
                   {
                       System.out.println("Error with playing sound.");
                       ex.printStackTrace();
                    }
    }
    
    private void setUpFrame()
    {
        /** Set up JFrame */ 
        f1 = new JFrame("Pacman");
          f1.setSize(675,790);
          f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
          f1.setResizable(false);
         
        Container c1 = f1.getContentPane();
        filename = "Highscore.txt";
        getCurrentHighScoreFromFile();
        
        //Image ahsimage, adateimage, asealimage, acertimage, acertbordimage;
        ahsimage = Toolkit.getDefaultToolkit().getImage("achievehighscore.png");
        adateimage = Toolkit.getDefaultToolkit().getImage("awarddate.png");
        asealimage = Toolkit.getDefaultToolkit().getImage("awardseal.png");
        acertimage = Toolkit.getDefaultToolkit().getImage("certificateachievement.png");
        acertbordimage = Toolkit.getDefaultToolkit().getImage("certificateborder.png");
        printfin = Toolkit.getDefaultToolkit().getImage("printfin.png");
        pacimage = Toolkit.getDefaultToolkit().getImage("pacman.png");
        eghimage = Toolkit.getDefaultToolkit().getImage("eatghost.png");
        
        todaysdate = Calendar.getInstance().getTime();
        dayofweekshort = new SimpleDateFormat("dd");
        monthfull = new SimpleDateFormat("MMMM");
        yearfull = new SimpleDateFormat("YYYY");
        
        job = PrinterJob.getPrinterJob();
          pf = job.defaultPage();
          pf.setOrientation(PageFormat.LANDSCAPE);
          job.setPrintable(this,pf);
         
        g1 = new GraphicsPanel3(pac,score,pellet,powerpellet,ghost,endgame,gb,fruit,npe,hs);
          g1.addKeyListener(this);    
          g1.addMouseListener(this);
          
        b1 =  new JButton("Start");
          b1.addActionListener(this);
        
        b2 =  new JButton("End");
          b2.addActionListener(this);
         
        sub = new JPanel(); 
          sub.add(b1);
          sub.add(b2);
          sub.add(pressp);
                     
        main = new JPanel();
          main.setLayout(new BorderLayout());          
          main.setSize(600,600);
          main.add(g1,BorderLayout.CENTER);
          main.add(sub,BorderLayout.SOUTH);
        
        c1.add(main);
        f1.show(); 
    }
    
    private void makeArrays()
    {
        pellet = new ArrayList<Pellet>();
        powerpellet = new ArrayList<Pellet>();
        totalGhosts = 4;
        ghost = new Ghost[totalGhosts];
        fruit = new ArrayList<Fruit>();
    }
        
    private void makePellets()    
        {
        /** Make Regular Pellets*/

        px = 43;
        py = 15;
        for(index = 0; index < 20; index++){ 
            pellet.add(new Pellet (px,py));
            px = px + 30;
            /** Top Line */
        }
        px = 15;
        py = 43;
        for(index = 20; index < 40; index++){
            pellet.add (new Pellet (px,py));
            py = py + 30;
        }
        px = 43;
        py = 223;
        for(index = 40; index < 61; index++){
            pellet.add (new Pellet (px,py));
            px = px + 30;
        }
        px = 43;
        py = 433;
        for(index = 61; index < 82; index++){
            pellet.add (new Pellet (px,py));
            px = px +30;
        }
        px = 43;
        py = 643;
        for(index = 82; index < 102; index++){
            pellet.add (new Pellet (px,py));
            px = px + 30;
        }
        px = 223;
        py = 43;
        for(index = 102; index < 108; index++){
            pellet.add (new Pellet (px,py));
            py = py + 30;
        }
        px = 223;
        py = 253;
        for(index = 108; index < 114; index++){
            pellet.add (new Pellet (px,py));
            py = py + 30;
        }
        px = 223;
        py = 463;
        for(index = 114; index < 120; index++){
            pellet.add (new Pellet (px,py));
            py = py + 30;
        }
        px = 433;
        py = 43;
        for(index = 120; index < 126; index++){
            pellet.add (new Pellet (px,py));
            py = py + 30;
        }
        px = 433;
        py = 253;
        for(index = 126; index < 132; index++){
            pellet.add (new Pellet (px,py));
            py = py + 30;
        }
        px = 433;
        py = 463;
        for(index = 132; index < 138; index++){
            pellet.add (new Pellet (px,py));
            py = py + 30;
        }
        px = 643;
        py = 43;
        for(index = 138; index < 144; index++){
            pellet.add (new Pellet (px,py));
            py = py + 30;
        }
        px = 643;
        py = 253;
        for(index = 144; index < 150; index++){
            pellet.add (new Pellet (px,py));
            py = py + 30;
        }
        px = 643;
        py = 463;
        for(index = 150; index < 156; index++){
            pellet.add (new Pellet (px,py));
            py = py + 30;
        }
    }
       
    private void makePowerPellets()
    {
        /** Make Powerpellets */
        powerpellet.add  (new Pellet(10,10));
        powerpellet.add  (new Pellet(637,10));
        powerpellet.add  (new Pellet(10,635));
        powerpellet.add  (new Pellet(637,637)); 
    }
    
    private void makeGhosts()
    {
        /** Make Ghosts */
        ghost[0] = new Ghost(8,8);
        ghost[1] = new Ghost(8,8);
        ghost[2] = new Ghost(8,8);
        ghost[3] = new Ghost(8,8);
    }  
    
    private void resetGhostsOnLevel()
    {
        /** Reset Ghosts */
        ghost[0] = new Ghost(8,8);
        ghost[1] = new Ghost(8,8);
        ghost[2] = new Ghost(8,8);
        ghost[3] = new Ghost(8,8);
        
        for(int index = 0; index < ghost.length; index++)
        {
          ghost[index].increaseSpeed();   
        }
    }
    
    private void resetGhosts()
    {
        /** Reset Ghosts */
        ghost[0] = new Ghost(8,8);
        ghost[1] = new Ghost(8,8);
        ghost[2] = new Ghost(8,8);
        ghost[3] = new Ghost(8,8);
    }
    
    public void runGame()
    {
        Thread runner = new Thread();
         
        while(endgame == false)
         {   
           /** Sleep to slow down computer*/   
           try 
              { 
                runner.sleep(5); 
               }
           catch(InterruptedException e) {}    
             
            if(startgame == true && levelpausecounter <= 0){  
             /** Begin Methods */
             setGhostMovement();  
               
             checkPowerPelletIntersection();
             
             checkGhostIntersectionWhenCanEat();
             
             checkGhostIntersectionWhenCantEat();
             
             checkPelletIntersection();
             
             if(audio2.getMicrosecondPosition() >= audio2.getMicrosecondLength())
               {
                   audio2.setMicrosecondPosition(0);
                }
             if(audio3.getMicrosecondPosition() >= audio3.getMicrosecondLength())
               {
                   audio3.setMicrosecondPosition(0);
                }
             if(audio4.getMicrosecondPosition() >= audio4.getMicrosecondLength())
               {
                   audio4.setMicrosecondPosition(0);
                }
             if(audio5.getMicrosecondPosition() >= audio5.getMicrosecondLength())
               {
                   audio5.setMicrosecondPosition(0);
                }   
             
             /** Next Level transfer */
             if(pellet.size() == 0 && powerpellet.size() == 0)
             {
                 nextLevel();
                }
             /** Gameover transfer */   
             if(pac.getLives() == 0)
             {
                 endgame = true;
                 g1.setGameOver(endgame);
                }
          
             pac.checkNewDirection(desireddirection);
             pac.moveIt(gb);
             
           
             
             makeCherry();
             //if( == true)
             checkCherryIntersection();
             
             g1.updateLocation(pac,score,endgame,level,desireddirection);
             g1.updatePellets(pellet);
             g1.updateObjects(powerpellet,eatghostcounter,fruit,fruittimer,npe,name,lab1);
             g1.repaint();
           }
           else
             {
               levelpausecounter--;
                 }
         }
        }
    
    private void checkPelletIntersection()
    {
         /** Pellet Detection*/  
         for(index = 0; index < pellet.size(); index++)
         {
            if(pac.getX() >= pellet.get(index).getX() - 10 && pac.getX() <= pellet.get(index).getX() + 10 && pac.getY() >= pellet.get(index).getY()-10 && pac.getY() <= pellet.get(index).getY()+10 && pellet.get(index).getEat() == false)
            {
              //pellet.get(index).eatPellet(); 
              audio2.start();
              npe++;
              pellet.remove(index);
              pac.addScore(10);
             }
         }
        }
    
    private void checkPowerPelletIntersection()
    {
         /** Powerpellet Detection*/
         for(index = 0; index < powerpellet.size(); index++)
             {
                 if(pac.getX() > powerpellet.get(index).getX() - 20 && pac.getX() < powerpellet.get(index).getX() + 20 && pac.getY() > powerpellet.get(index).getY() - 20 && pac.getY() < powerpellet.get(index).getY() + 20 && powerpellet.get(index).getEat() == false)
               {
                   //powerpellet.get(index).eatPellet();
                   npe++;
                   powerpellet.remove(index);
                   audio4.start();
                   eatghostcounter = 0;
                   caneatghosts = true;
                   pac.addScore(50);
                  
                   for(windex = 0; windex < ghost.length; windex++)
                     {
                        ghost[windex].setCanEat(true);
                     }
               }
          }
        }
        
    private void checkGhostIntersectionWhenCanEat()
    {
         /** Ghost Detection and can/cannotEat stages*/ 
             if(caneatghosts == true) 
         {    
             eatghostcounter++;
           for(index = 0; index < ghost.length; index++)
             {
               /** Ghost can be eaten */
                if(pac.getX() > ghost[index].getX() - 20 && pac.getX() < ghost[index].getX() + 20 && pac.getY() > ghost[index].getY() - 20 && pac.getY() < ghost[index].getY() + 20 && ghost[index].getCanEat() == true && ghost[index].getDidEat() == false)
              {
                  eatenghostsnumber++;
                  audio4.start();
                  ghost[index].setDidEat();
                  if(eatenghostsnumber == 1) pac.addScore(200);
                  if(eatenghostsnumber == 2) pac.addScore(400);
                  if(eatenghostsnumber == 3) pac.addScore(800);
                  if(eatenghostsnumber == 4) pac.addScore(1600);
              }
              
              /** Sets ability to not eat ghost */
              if(eatghostcounter >= 800)
              {
                  eatghostcounter = 0;    
                  caneatghosts = false;
                  changeGhostsToCantEat();
                }
            }
          }
         }
    
    private void changeGhostsToCantEat()
    {
         for(index = 0; index < ghost.length; index++)
           {
              ghost[index].setCanEat(false);
             }   
         }
         
    private void checkGhostIntersectionWhenCantEat()
    {
        
         /** Ghost detection when they can't be eaten*/ 
         if(caneatghosts == false)
           {
             for(index = 0; index < ghost.length; index++)
            {
               if(pac.getX() >= ghost[index].getX() -10 && pac.getX() <= ghost[index].getX() + 20 && pac.getY() >= ghost[index].getY() - 10 && pac.getY() <= ghost[index].getY() + 20 && ghost[index].getHit() == false && ghost[index].getDidEat() == false)
               {
                  ghost[index].hitGhost();
                  pac.pacDied();
                  desireddirection = "";
                  audio3.start();
                  resetGhosts();
                  fruittimer = 0;
                  levelpausecounter = 500;
                  pac.setLocation(425,425);
                  if(pac.getLives() == 0)
                  {
                    if(hs.getHighScore() < pac.getScore())
                    {
                        name = (String)JOptionPane.showInputDialog(f1,"You have achieved the new high score of: "+pac.getScore()+ "\n Enter Your Initials","Enter New High Score",JOptionPane.INFORMATION_MESSAGE,pacman,null,"");
                        lab1.setText("The new high score is "+ name + " " + pac.getLives());
                        newscore = pac.getScore();
                        updateHighScoreToFile();
                        choice = JOptionPane.showConfirmDialog(f1,"Would you like to print your high score?","High Score Achievement ", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        checkPrintPause();
                    }
                   }
                }
            }
          } 
        }
         
    private void setGhostMovement()
    {
         /** Ghost Movement */
        
         for(index = 0; index < ghost.length; index++)
           {
                 ghost[index].moveIt(gb);
             }
            
         ghoststeps = ghoststeps + 1;
         
         for(index = 0; index < ghost.length; index++)
           {
                 if(caneatghosts == true)
                 {ghost[index].changeDirectionRun(pac);}
                 else ghost[index].checkChangeDirection(pac);
             }
         
        }
        
    private void nextLevel()
    {
         resetGhostsOnLevel();
         level++;
         makePellets();
         makePowerPellets();
         pac.setLocation(425,425);
         audio5.start();
         npe = 0;
         fruittimer = 0;
         levelpausecounter = 500;
         desireddirection = "";
        }
        
    private void makeCherry()
    {
         if(npe == 117 || npe == 60)
         {
             fruit.add(new Fruit(320,425));
            }
    }
    
    private void checkCherryIntersection()
    {
        if(fruit.size()>0)
        fruittimer++;
        for(index=0;index<fruit.size();index++)
         if(pac.getX() >= fruit.get(index).getX() - 30 && pac.getX() <= fruit.get(index).getX() + 30 && pac.getY() >= fruit.get(index).getY() - 30 && pac.getY() <= fruit.get(index).getY() + 30)
         {
             pac.addScore(100 * level);
             fruit.clear(); 
             fruittimer = 0;
            }
        
        if(fruittimer >= 1500)
        {
           fruit.clear(); 
           fruittimer = 0;
        }
            
        }
        
    private void checkPause()    
    {
        if(choice == 0)
        {
          levelpausecounter = 0;
        }
        if(choice == 1)
        {
          levelpausecounter = 1000000000;
        }
    }   
    
    private void checkPrintPause()
    {
        if(choice == 0)
        {
          updatePrint();
        }
        if(choice == 1)
        {
          endgame = true;
        }
    }
    
    private void getCurrentHighScoreFromFile()
    {
      hsfile = new File(filename);                                                                       
      try
        {
             freader = new FileReader(hsfile);
             breader = new BufferedReader(freader);
             
             name = breader.readLine();                  
             highscoreS = breader.readLine();
             highscore = Integer.parseInt(highscoreS);
                 
             breader.close(); 
             name.substring(0,3);
             
             hs = new HighScore(name, highscore);
                               
             }
             catch(IOException ex) 
               {
                  hs = new HighScore("", 0);
                }      
    }
    
    public void updateHighScoreToFile()
   {
       hsfile = new File(filename);                          
       try
        {
            fwriter = new FileWriter(hsfile);
            bwriter = new BufferedWriter(fwriter); 
            name.substring(0,3);
            bwriter.write(name);             
            bwriter.newLine();
            bwriter.write(""+newscore);   
            bwriter.close();
             }
             catch(IOException ex) {}
         
       hs = new HighScore(name,newscore); 
       g1.updateHighScore(hs);
       g1.repaint();
     }
    
    public void actionPerformed (ActionEvent event)
    {
        if (event.getSource() == b1)
        {
           g1.requestFocus();
           startgame = true;
           audio1.start();
         } 
        if (event.getSource() == b2)
        {
           endgame = true;
        }
    }
    
    public void keyPressed(KeyEvent evt)
    {
        if(evt.getKeyCode() == 38) /** Move UP */
           {
              /**xdir = 0;
              ydir = -1;*/
              
              desireddirection = "up";
              
            }
        if(evt.getKeyCode() == 40) /** Move DOWN */
           {
              /**xdir = 0;
              ydir = 1;*/
              
              desireddirection = "down";
            }
        if(evt.getKeyCode() == 37) /** Move LEFT */
           {
              /**xdir = -1;
              ydir = 0;*/
              
              desireddirection = "left";
            }
        if(evt.getKeyCode() == 39) /** Move RIGHT */
           {
              /**xdir = 1;
              ydir = 0;*/
              
              desireddirection = "right";
            }
        if(evt.getKeyCode() == 80)
        {
           levelpausecounter = 1000000000; 
           choice = JOptionPane.showConfirmDialog(f1,"Would you like to resume the game?","PAC-MAN is currently paused", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
           checkPause();
        }      
        }
    public void keyReleased(KeyEvent evt)
    {}
    public void keyTyped(KeyEvent evt)
    {}
    
    private void updatePrint()
      {
        oktoprint = job.printDialog();
        
        if(oktoprint == true)
        {
            try
            {
                job.print();
            }catch (PrinterException ex) {}
       }
     }
    public int print(Graphics g1, PageFormat pf, int page) throws PrinterException
    {
     if(page>0) {
         return NO_SUCH_PAGE;
        }
     
        //Image ahsimage, adateimage, asealimage, acertimage, acertbordimage, pacimage, eghimage;
        g1.drawImage(acertbordimage, 90,90,550,400,null);
        g1.drawImage(acertimage, 200,150,350,100,null);
        g1.drawImage(ahsimage, 200,350,350,50,null);
        g1.drawImage(adateimage, 150,300,350,50,null);
        g1.drawImage(asealimage, 320,400,50,50,null);
        g1.drawImage(pacimage,150,250,50,50,null);
        g1.drawImage(eghimage,540,250,50,50,null);
        
        g1.setFont(new Font("Ariel", Font.BOLD, 24));
        g1.drawString(name,300,275);
        g1.drawLine(275,275,500,275);
        
        g1.drawString(dayofweekshort.format(todaysdate),275,330);
        g1.drawString(monthfull.format(todaysdate),355,330);
        g1.drawString(yearfull.format(todaysdate),420,330);
        
        g1.drawString("" + pac.getScore(),380,385);
        
        return PAGE_EXISTS;
    }
    public void mousePressed(MouseEvent evt)
    {
         mousestartx = evt.getX();
         mousestarty = evt.getY();
    }
    public void mouseReleased(MouseEvent evt)
    {
        mouseendx = evt.getX();
        mouseendy = evt.getY();
        
        if(Math.abs(mouseendx - mousestartx) > Math.abs(mouseendy - mousestarty))
        {
            if(mouseendx > mousestartx)
            {
                desireddirection = "right";
            }
            if(mouseendx < mousestartx)
            {
                desireddirection = "left";   
            }
        }
        else
        {
            if(mouseendy > mousestarty)
            {
                desireddirection = "down";
            }
            if(mouseendy < mousestarty)
            {
                desireddirection = "up";   
            }
    }
}
    public void mouseExited(MouseEvent evt) {}
    public void mouseClicked(MouseEvent evt) {}
    public void mouseEntered(MouseEvent evt) {}
       
} 