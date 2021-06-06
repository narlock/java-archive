

public class Pacman extends Moveable
{
     double speed;
     int score, lives,ppacside;
     GraphicsPanel3 g1;
     
     /** Pacman methods */
     
    public Pacman(int xx, int yy)
    {
        super(xx,yy); 
        score = 0;
        speed = 1.2;
        lives = 3;
    }
    
    public void setLocation(int xx, int yy)
    {
     x = xx;
     y = yy;
    }
    
    public void setX(int nx)
    {
        x = nx;
    }
    
    public void setY(int ny)
    {
        y = ny; 
    }
    
    public int getScore()
    {
      return score;    
    }
    
    public void addScore(int points)
    {
      score = score + points;   
    } 
    
    public int getLives()
    {
      return lives;   
    }
    
    public void pacDied()
    {
      lives--;   
    }
    
    /** Pacman movement methods */

    public void checkNewDirection(String dd)
    {
       /** Intersection Fixes 
        215, 8 and 425, 8  */
       if((getX() == 214 || getX() == 215) && (getY() == 8) && dd.equals("left")){
         x = 215;  
        }
       if((getX() == 424 || getX() == 425) && (getY() == 8) && dd.equals("left")){
         x = 425;
        }
       if((getX() == 214 || getX() == 215) && (getY() == 8) && dd.equals("down")){
         x = 215;  
        }
       if((getX() == 424 || getX() == 425) && (getY() == 8) && dd.equals("down")){
         x = 425;
        } 
       
       /** 8, 215 and 8, 425 */
       if((getY() == 214 || getY() == 215) && (getX() == 8) && dd.equals("right")){
         y = 215;  
        }
       if((getY() == 424 || getY() == 425) && (getX() == 8) && dd.equals("right")){
         y = 425;  
        }
       if((getY() == 214 || getY() == 215) && (getX() == 8) && dd.equals("up")){
         y = 215;  
        }
       if((getY() == 424 || getY() == 425) && (getX() == 8) && dd.equals("up")){
         y = 425;  
        } 
       
       /** 215, 637 and 425, 637 */
       if((getX() == 214 || getX() == 215) && (getY() == 637) && dd.equals("left")){
         x = 215;  
        }
       if((getX() == 424 || getX() == 425) && (getY() == 637) && dd.equals("left")){
         x = 425;  
        }
       if((getX() == 214 || getX() == 215) && (getY() == 637) && dd.equals("up")){
         x = 215;  
        }
       if((getX() == 424 || getX() == 425) && (getY() == 637) && dd.equals("up")){
         x = 425;  
        } 
        
       /** 637, 215 and 637, 425 */
       if((getY() == 214 || getY() == 215) && (getX() == 637) && dd.equals("up")){
         y = 215;  
        }
       if((getY() == 424 || getY() == 425) && (getX() == 637) && dd.equals("up")){
         y = 425;  
        }
       if((getY() == 214 || getY() == 215) && (getX() == 637) && dd.equals("left")){
         y = 215;  
        }
       if((getY() == 424 || getY() == 425) && (getX() == 637) && dd.equals("left")){
         y = 425;  
        } 
        
       /** 215, 215 */ 
       if((getY() == 214 || getY() == 215) && (getX() == 215) && dd.equals("left")){
         y = 215;  
        }
       if((getX() == 214 || getX() == 215) && (getY() == 215) && dd.equals("down")){
         x = 215;  
        }
       if((getY() == 214 || getY() == 215) && (getX() == 215) && dd.equals("right")){
         y = 215;  
        }
       if((getX() == 214 || getX() == 215) && (getY() == 215) && dd.equals("up")){
         x = 215;  
        } 
       
       /** 425, 215 */ 
       if((getY() == 214 || getY() == 215) && (getX() == 425) && dd.equals("left")){
         y = 215;  
        }
       if((getX() == 424 || getX() == 425) && (getY() == 215) && dd.equals("down")){
         x = 425;  
        }
       if((getY() == 214 || getY() == 215) && (getX() == 425) && dd.equals("right")){ /**switched */
         y = 215;  
        }
       if((getX() == 424 || getX() == 425) && (getY() == 215) && dd.equals("up")){
         x = 425;  
        } 
        
       /** 215, 425 */ 
       if((getY() == 424 || getY() == 425) && (getX() == 215) && dd.equals("right")){
         y = 425;  
        }
       if((getX() == 214 || getX() == 215) && (getY() == 425) && dd.equals("down")){
         x = 215;  
        }
       if((getY() == 424 || getY() == 425) && (getX() == 215) && dd.equals("left")){
         y = 425;  
        } 
       if((getX() == 214 || getX() == 215) && (getY() == 425) && dd.equals("up")){
         x = 215;  
        } 
        
       /** 425, 425 */ 
       if((getY() == 424 || getY() == 425) && (getX() == 425) && dd.equals("right")){
         y = 425;  
        }
       if((getX() == 424 || getX() == 425) && (getY() == 425) && dd.equals("down")){
         x = 425;  
        }
       if((getY() == 424 || getY() == 425) && (getX() == 425) && dd.equals("left")){
         y = 425;  
        }
       if((getX() == 424 || getX() == 425) && (getY() == 425) && dd.equals("up")){
         x = 425;  
        }
       
       /** Pacman can change directions without being at an intersection 
       if((getX() == 8) && (getY() >= 8) && (getY() <= 637))
       {    
         if(dd.equals("down"))
           {
               xdir = 0;
               ydir = speed;
            }
         if(dd.equals("up"))
           {
               xdir = 0;
               ydir = -1 * speed;
            }
        }
       if((getX() == 215) && (getY() >= 8) && (getY() <= 637))
       {    
         if(dd.equals("down"))
           {
               xdir = 0;
               ydir = speed;
            }
         if(dd.equals("up"))
           {
               xdir = 0;
               ydir = -1 * speed;
            }
        }
       if((getX() == 425) && (getY() >= 8) && (getY() <= 637))
       {    
         if(dd.equals("down"))
           {
               xdir = 0;
               ydir = speed;
            }
         if(dd.equals("up"))
           {
               xdir = 0;
               ydir = -1 * speed;
            }
        } 
       if((getX() == 637) && (getY() >= 8) && (getY() <= 637))
       {    
         if(dd.equals("down"))
           {
               xdir = 0;
               ydir = speed;
            }
         if(dd.equals("up"))
           {
               xdir = 0;
               ydir = -1 * speed;
            }
        }  
       */ 
        
       /** Pacman's initial boundaries */
        if((getX() == 8) && (getY() == 8)) /** only avaliable desired directions: down, right*/
       {
           if(dd.equals("down"))
           {
               xdir = 0;
               ydir = speed;
               ppacside = 3;
            }     
           if(dd.equals("right"))
           {
               xdir = speed;
               ydir = 0;
               ppacside = 0;
            }
        }
       if((getX() == 637) && (getY() == 8)) /** down, left */
       {
         if(dd.equals("down"))
         {
             xdir = 0;
             ydir = speed;
             ppacside = 3;
            }
         if(dd.equals("left"))
         {
             xdir = -1 * speed;
             ydir = 0;
             ppacside = 1;
             }
        }   
       if((getX() == 8) && (getY() == 637)) /** up, right */
       {
          if(dd.equals("up"))
           {
               xdir = 0;
               ydir = -1 * speed;
               ppacside = 2;
            }
          if(dd.equals("right"))
           {
               xdir = speed;
               ydir = 0;
               ppacside = 0;
            }   
        }
       if((getX() == 637) && (getY() == 637)) /** up, left */
       {
           if(dd.equals("up"))
           {
               xdir = 0;
               ydir = -1 * speed;
               ppacside = 2;
            }
           if(dd.equals("left"))
           {
               xdir = -1 * speed;
               ydir = 0;
               ppacside = 1;
            } 
        }
        
       if((getX() == 215 || getX() == 425) && (getY() == 8)) /** only down,left,right*/
       {
           if(dd.equals("down"))
           {
               xdir = 0;
               ydir = speed;
               ppacside = 3;
            }
           if(dd.equals("left"))
           {
               xdir = -1 * speed;
               ydir = 0;
               ppacside = 1;
            }
           if(dd.equals("right"))
           {
               xdir = speed;
               ydir = 0;
               ppacside = 0;
            } 
        }
       if((getX() == 8) && (getY() == 215 || getY() ==  425)) /** only up,down,right, TELEPORT left */
       {
           if(dd.equals("down"))
           {
               xdir = 0;
               ydir = speed;
               ppacside = 3;
            }
           if(dd.equals("up"))
           {
               xdir = 0;
               ydir = -1 * speed;
               ppacside = 2;
            }
           if(dd.equals("right"))
           {
               xdir = speed;
               ydir = 0;
               ppacside = 0;
            }
           if(dd.equals("left"))
           {
               xdir = -1 * speed;
               ydir = 0;
               ppacside = 1;
            }
        }
       if((getX() == 215 || getX() == 425) && (getY() == 637))
       {
           if(dd.equals("up"))
           {
               xdir = 0;
               ydir = -1 * speed;
               ppacside = 2;
            }
           if(dd.equals("left"))
           {
               xdir = -1 * speed;
               ydir = 0;
               ppacside = 1;
            }
           if(dd.equals("right"))
           {
               xdir = speed;
               ydir = 0;
               ppacside = 0;
            } 
        }
       if((getX() == 637) && (getY() == 215 || getY() == 425)) /**teleport right*/
       {
           if(dd.equals("left"))
           {
               xdir = -1 * speed;
               ydir = 0;
               ppacside = 1;
            } 
           if(dd.equals("up"))
           {
               xdir = 0;
               ydir = -1 * speed;
               ppacside = 2;
            }
           if(dd.equals("down"))
           {
               xdir = 0;
               ydir = speed;
               ppacside = 3;
            } 
           if(dd.equals("right"))
           {
               xdir = speed;
               ydir = 0;
               ppacside = 0;
            }
           }
       if((getX() == 215 || getX() == 425) && (getY() == 215 || getY() == 425))
       {
           if(dd.equals("right"))
           {
               xdir = speed;
               ydir = 0;
               ppacside = 0;
            } 
           if(dd.equals("up"))
           {
               xdir = 0;
               ydir = -1 * speed;
               ppacside = 2;
            }
           if(dd.equals("down"))
           {
               xdir = 0;
               ydir = speed;
               ppacside = 3;
            }  
           if(dd.equals("left"))
           {
               xdir = -1 * speed;
               ydir = 0;
               ppacside = 1;
            }
        }
       //g1.updatePacLocation(ppacside); 
    }
    
    
    
    public void movePacMan(GameBorder gb)
     {
         /**x = x + xdir;
         y = y + ydir;
         
         /** Teleporting & other gameborder barrier 
         if(x < gb.getXStart() && !(getY() == 215 || getY() == 425))
         {
             x = gb.getXStart();
            }
         
         if(x <  gb.getXStart() - 30 && (getY() == 215 || getY() == 425))
         {
             x = gb.getXStart() + gb.getXDim();
            }
         
         if(x > gb.getXStart() + gb.getXDim() - 20 && !(getY() == 215 || getY() == 425))
            x = gb.getXStart() + gb.getXDim() - 20;
               
         if(x > gb.getXStart() + gb.getXDim() && (getY() == 215 || getY() == 425))
            x = gb.getXStart();
              
         if(y < gb.getYStart())
           y = gb.getYStart();
           
         if(y > gb.getYStart() + gb.getYDim() - 20)
            y = gb.getYStart() + gb.getYDim() - 20;   */ 
     }
}
