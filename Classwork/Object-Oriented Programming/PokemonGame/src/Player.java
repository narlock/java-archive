import java.awt.*;
import javax.swing.*;

public class Player extends Entity {
    int pposition = 0;
    ImageIcon[] playerimage;
    
    public Player(int x, int y, int XDim, int YDim) {
        super(x,y,XDim,YDim);
        

    
        
        playerimage = new ImageIcon[8];
        String[] filenames = {"male-facing-down.png", //0
                              "male-facing-up.png", //1
                              "male-facing-left.png", //2
                              "male-facing-right.png", //3
                              "male-down-walking.gif", //4
                              "male-left-walking.gif", //5
                              "male-right-walking.gif", //6
                              "male-up-walking.gif"}; //7
                              
          for(int index = 0; index < filenames.length; index++) {
              playerimage[index] = new ImageIcon(filenames[index]);
        }
    }
    
    public void drawPlayer(Graphics2D g2d) {
        g2d.drawImage(getPlayerImages(),x,y,XDim,YDim,null);
    }
    
    public Image getPlayerImages() {
        return playerimage[pposition].getImage();
    }
    
    public void checkPosition(int position) {
        pposition = position;
    }
    
}
