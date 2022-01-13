import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
public class World extends Entity
{
    int velx = 0,vely = 0,xx,yy;
    int position = 0;
    int mapnum = 0;
    Player player;
    worldImages[] mapimage;
    boolean blackout;
    Image theimage;
    Border[] worldborder;
    public World(int x, int y, Player pp) 
    {
        super(x,y);
        player = pp;
        blackout = false;
        
        worldborder = new Border[2];
        worldborder[0] = new Border(0,360,150,10,50);
        worldborder[0] = new Border(0,300,250,20,30);
        
        mapimage = new worldImages[2];
        String[] filenames = { 
                                    /** Pallet Town Images */
                               "PALLET_PLAYERHOUSE_ROOM.png",    //0
                               "PALLET_PLAYERHOUSE.png",         //1
                               "PALLET_TOWN.png"                 //2
            
                            };
            
        mapimage[0] = new worldImages(filenames[0], 100,100,480,360);                 
        mapimage[1] = new worldImages(filenames[1], 150,100,480,360);                     
        }
        
    public int getX()
    {
        return (int) xx;
    }
    
    public int getY()
    {
        return (int) yy;
    }
    
    public void update(GameBorder gb) {
        this.mapnum = mapnum;
        y = y + vely;
        x = x + velx;
        /**if(x < gb.getXStart())*/
        if(x < mapimage[mapnum].getXStart() - (mapimage[mapnum].getXStart() + mapimage[mapnum].getXDim() - (player.getX() + 48)))
        {
            x = mapimage[mapnum].getXStart() - (mapimage[mapnum].getXStart() + mapimage[mapnum].getXDim() - (player.getX() + 48));
        }
        /**if(x > gb.getXStart() + gb.getXDim())*/
        if(x > player.getX()) 
        {
            x = player.getX();
        }
        if(y < mapimage[mapnum].getYStart() - (mapimage[mapnum].getYStart() + mapimage[mapnum].getYDim() - (player.getY() + 63)))
        {
            y = mapimage[mapnum].getYStart() - (mapimage[mapnum].getYStart() + mapimage[mapnum].getYDim() - (player.getY() + 63));
        }
        if(y > player.getY())
        {
            y = player.getY();
        }
    }
    
    public void drawWorld(Graphics2D g2d) {
        g2d.drawImage(getWorldImage(mapnum),x,y,480,360,null);
        if(mapnum == 0 && x+280 >= 200 && x+370 <= 350 && y+40 >= 250 && y+40 <= 400) {
            System.out.println("Moved down the stairs"); mapnum = 1; blackout = true; callBlackout(blackout); }
        if(mapnum == 1 && x+400 >= 200 && x+450 <= 350 && y+40 >=250 && y+40 <=400) {
            System.out.println("Moved up the stairs"); mapnum = 0; blackout = true; callBlackout(blackout);}
   
        /**if(mapnum == 1) {
            System.out.println("Exited PLAYER house"); mapnum = 2; }*/
    }
    
    public boolean callBlackout(boolean blackout){
        return blackout;
    }
    
    public void blackoutFalse(boolean blackout){
        blackout = false;
    }
    
    public Image getWorldImage(int mn) {
        Image theimage = Toolkit.getDefaultToolkit().getImage(mapimage[mn].getFilename());
         
        return theimage;
        
    }
    
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        
        if(key == KeyEvent.VK_UP) {
            vely = 2;
            System.out.println("Up " + vely);
            position = 4;
        } else if (key == KeyEvent.VK_DOWN) {
            vely = -2;
            System.out.println("Down " + vely);
            position = 7;
        } else if (key == KeyEvent.VK_LEFT) {
            velx = 2;
            System.out.println("Left " + velx);
            position = 5;
        } else if (key == KeyEvent.VK_RIGHT) {
            velx = -2;
            System.out.println("Right " + velx);
            position = 6;
        }
        
        player.checkPosition(position);
    }
    
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        
        if(key == KeyEvent.VK_UP) {
            vely = 0;
            System.out.println("Up Released " + vely);
            position = 1;
        } else if (key == KeyEvent.VK_DOWN) {
            vely = 0;
            System.out.println("Down Released " + vely);
            position = 0;
        } else if (key == KeyEvent.VK_LEFT) {
            velx = 0;
            System.out.println("Left Released " + velx);
            position = 2;
        } else if (key == KeyEvent.VK_RIGHT) {
            velx = 0;
            System.out.println("Right Released " + velx);
            position = 3;
        }
        
        player.checkPosition(position);
    }
}
