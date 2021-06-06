import java.awt.*;
import java.util.*;
import javax.swing.*;

public class GraphicsPanel extends JPanel
    {
        
        Image windowbg,logo,transparent,C2P,movecontrols,shootcontrols,powercontrols,powerupBorder,level1;
        Image kingFront,kingBack,kingLeft,kingRight;
        
        King hhero;
        
        int fface;
        boolean DEVMODE,sstartgame,ttransition,eendgame;
        
        public GraphicsPanel(King hero, boolean endgame)
            {
                windowbg = Toolkit.getDefaultToolkit().getImage("black.png");
                logo = Toolkit.getDefaultToolkit().getImage("JOPK_logo.png");
                C2P = Toolkit.getDefaultToolkit().getImage("clicktoplay.gif");
                transparent = Toolkit.getDefaultToolkit().getImage("");
                level1 = Toolkit.getDefaultToolkit().getImage("level1.png");
                powerupBorder = Toolkit.getDefaultToolkit().getImage("powerupBorder.png");
                movecontrols = Toolkit.getDefaultToolkit().getImage("movecontrols.png");
                shootcontrols = Toolkit.getDefaultToolkit().getImage("shootcontrols.png");
                powercontrols = Toolkit.getDefaultToolkit().getImage("powercontrols.png");
                
                kingFront = Toolkit.getDefaultToolkit().getImage("kingFront.png");
                kingBack = Toolkit.getDefaultToolkit().getImage("kingBack.png");
                kingLeft = Toolkit.getDefaultToolkit().getImage("kingLeft.png");
                kingRight = Toolkit.getDefaultToolkit().getImage("kingRight.png");
            }
        
        public void updateLocation(King hero)
            {
                hhero = hero;
            }
            
        public void updateTransition(boolean DEV_MODE, boolean transition, boolean endgame)
            {
                DEVMODE = DEV_MODE;
                ttransition = transition;
                eendgame = endgame;
            }
            
        public void updateFace(int face)
            {
                fface = face;
            }
            
        public void paint (Graphics g)
            {
                g.drawImage(windowbg,0,0,1080,720,null);
                g.setColor(Color.white);
                                g.setFont(new Font("Consolas",10,20));
                                
                if(ttransition == false) {g.drawImage(logo,390,175,288,288,null); g.drawString("PRESS SPACE",470,440);}
                    
                if(ttransition == true) 
                    {
                        g.drawImage(level1,280,64,512,512,null); 
                        
                        g.drawImage(powerupBorder,225,70,50,50,null);
                        g.drawImage(movecontrols,800,64,82,66,null);
                        g.drawImage(shootcontrols,800,130,82,66,null);
                        g.drawImage(powercontrols,800,197,102,29,null);
                        
                        if(fface == 2) { g.drawImage(kingFront,hhero.getX(),hhero.getY(),32,32,null); }
                        if(fface == 1) { g.drawImage(kingBack,hhero.getX(),hhero.getY(),32,32,null); }
                        if(fface == 3) { g.drawImage(kingLeft,hhero.getX(),hhero.getY(),32,32,null); }
                        if(fface == 4) { g.drawImage(kingRight,hhero.getX(),hhero.getY(),32,32,null); }
                        
                        if(DEVMODE == true) {
                            g.setColor(Color.green);
                                g.setFont(new Font("Consolas",Font.BOLD,25));
                                g.drawString("DEV_MODE ENABLED",8,30);
                                g.setFont(new Font("Consolas",10,20));
                                g.drawString("SCORE.......",8,60);
                            //g.setColor(Color.orange);    
                                g.drawString("HIGHSCORE...",8,85);
                            //g.setColor(Color.red);
                                g.drawString("LEVEL.......",8,110);
                                g.drawString("TIME LEFT...",8,135);
                                g.drawString("BADIES LEFT.",8,160);
                                g.drawString("LIVES.......",8,185);
                        }
                        
                    
                    }
                    
                if(eendgame == true) {
                        g.setColor(Color.red);
                        g.setFont(new Font("Lucida Console", Font.BOLD, 20));
                        g.drawString("GAME OVER",8,645);
                    }    

            }
    }