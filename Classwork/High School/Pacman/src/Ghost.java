

public class Ghost extends Moveable
{
     int randomdirection;
     boolean hit,caneat,dideat;
     double speed;
     
    /** Methods */   
    public Ghost(int xx, int yy)
    {
      super(xx,yy);
      speed = 1.2;
      hit = false;
      caneat=false;dideat=false;
    }
    
    public void hitGhost()
     {
         hit = true;
        }
        
    public boolean getHit()
     {
         return hit;
        }
        
        public boolean getCanEat()
    {
        return caneat;   
    }
    
    public void setCanEat(boolean ce)
    {
        caneat = ce;
    }
    
    public boolean getDidEat()
    {
        return dideat;   
    }
    
    public void setDidEat()
    {  
        dideat = true; 
    }
    
       /** Ghost movement patterns */
     
    public void checkChangeDirection(Pacman pac)
     {
       /** 
        * Intersection fixes:
        * 215,8 and 425,8 intersection*/
       if((getY() == 8) && (getX() == 215 || getX() == 214 || getX() == 424 || getX() == 425)){
         if(getX() == 215 || getX() == 214)
           x = 215;
         if(getX() == 424 || getX() == 425)
           x = 425;
         randomdirection = (int)(Math.random() *3+1);
         if(randomdirection == 1) //down
           {
               xdir = 0;
               ydir = speed;
            }     
         if(randomdirection == 2) //right
           {
               xdir = speed;
               ydir = 0;
            }
         if(randomdirection == 3) //left
           {
               xdir = -1 * speed;
               ydir = 0;
            } 
        }
       /** 8,215 and 8, 425 */ 
       if((getX() == 8) && (getY() == 215 || getY() == 214 || getY() == 424 || getY() == 425)){
         if(getY() == 215 || getY() == 214)
           y = 215;
         if(getY() == 424 || getY() == 425)
           y = 425;
         randomdirection = (int)(Math.random() *3+1);
         if(randomdirection == 1) //down
           {
               xdir = 0;
               ydir = speed;
            }     
         if(randomdirection == 2) //up
           {
               xdir = 0;
               ydir = -1 * speed;
            }
         if(randomdirection == 3) //right
           {
               xdir = speed;
               ydir = 0;
            } 
        }
       /** 637,215 and 637,425 */ 
       if((getX() == 637) && (getY() == 215 || getY() == 214 || getY() == 424 || getY() == 425)){
         if(getY() == 215 || getY() == 214)
           y = 215;
         if(getY() == 424 || getY() == 425)  
           y = 425;
         randomdirection = (int)(Math.random() *3+1);
         if(randomdirection == 1) //down
           {
               xdir = 0;
               ydir = speed;
            }     
         if(randomdirection == 2) //up
           {
               xdir = 0;
               ydir = -1 * speed;
            }
         if(randomdirection == 3) //right
           {
               xdir = -1 * speed;
               ydir = 0;
            }   
        }
       /** 215,637 and 425,637 */
       if((getY() == 637) && (getX() == 214 || getX() == 215 || getX() == 424 || getY() == 425)){
         if(getX() == 214 || getX() == 215)
           x = 215;
         if(getX() == 424 || getX() == 425)
           x = 425;
         randomdirection = (int)(Math.random() *3+1);
         if(randomdirection == 1) //up
           {
               xdir = 0;
               ydir = -1 * speed;
            }     
         if(randomdirection == 2) //right
           {
               xdir = speed;
               ydir = 0;
            }
         if(randomdirection == 3) //left
           {
               xdir = -1 * speed;
               ydir = 0;
            } 
        }
       /**
        * Intersections for 215,215 , 215,425 , 425 215 , 425 425
        * Code breaks when this runs, but seems to work fine without it.
        * 
        * if((getX() == 215 || getX() == 214 || getX() == 425 || getX() == 424) && (getY() == 215 || getY() == 214 || getY() == 425 || getY() == 424)){
         if(getX() == 214 || getX() == 215 && getY() == 214 || getY() == 215)
           x = 215; y = 215;
         if(getX() == 214 || getX() == 215 && getY() == 424 || getY() == 425)
           x = 215; y = 425;
         if(getX() == 424 || getX() == 425 && getY() == 214 || getY() == 215)
           x = 425; y = 215;
         if(getX() == 424 || getX() == 425 && getY() == 424 || getY() == 425)
           x = 425; y = 425;
         randomdirection = (int)(Math.random() *4 +1);
         if( randomdirection ==1) //down
           {
               xdir = speed;
               ydir = 0;
            } 
         if(randomdirection ==2) //left
           {
               xdir = 0;
               ydir = -1 * speed;;
            }
         if(randomdirection ==3) //right
           {
               xdir = 0;
               ydir = speed;
            }  
         if(randomdirection ==4) //up
           {
               xdir = -1 * speed;
               ydir = 0;
            }  
        }*/
       
       /**Original Fixes, includes RNG in movement directions at all intersections*/    
       if((x == 8) && (y == 8)) /** only avaliable desired directions: down, right*/
       {
           randomdirection = (int)(Math.random() *2+1);
           if(randomdirection == 1)
           {
               xdir = 0;
               ydir = speed;
            }     
           if(randomdirection == 2)
           {
               xdir = speed;
               ydir = 0;
            }
        }
        
       if((x == 637) && (y == 8)) /** down, left */
       {
          randomdirection = (int)(Math.random() *2 +1);
         if(randomdirection ==1)
         {
             xdir = 0;
             ydir = speed;
            }
         if(randomdirection == 2)
         {
             xdir = -1 * speed;
             ydir = 0;
             }
        }   
        
       if((x == 8) && (y == 637)) /** up, right */
       {
           randomdirection = (int)(Math.random() *2 +1);
          if(randomdirection ==1)
           {
               xdir = 0;
               ydir = -1 * speed;;
            }
          if(randomdirection ==2)
           {
               xdir = speed;
               ydir = 0;
            }   
        }
        
       if((x == 637) && (y == 637)) /** up, left */
       {
           randomdirection = (int)(Math.random() *2 +1);
           if(randomdirection ==1)
           {
               xdir = 0;
               ydir = -1 * speed;;
            }
           if(randomdirection ==2)
           {
               xdir = -1 * speed;
               ydir = 0;
            } 
        }
        
       if((x == 215 || x == 425) && (y == 8)) /** only down,left,right*/
       {
           randomdirection = (int)(Math.random() *3 +1);
           if(randomdirection == 1)
           {
               xdir = 0;
               ydir = speed;
            }
           if(randomdirection == 2)
           {
               xdir = -1 * speed;
               ydir = 0;
            }
           if(randomdirection == 3)
           {
               xdir = speed;
               ydir = 0;
            } 
        }
        
       if((x == 8) && (y == 215 || y ==  425)) /** only up,down,right */
       {
           randomdirection = (int)(Math.random() *3 +1);
           if(randomdirection == 1)
           {
               xdir = 0;
               ydir = speed;
            }
           if(randomdirection == 2)
           {
               xdir = 0;
               ydir = -1 * speed;;
            }
           if(randomdirection == 3)
           {
               xdir = speed;
               ydir = 0;
            }
        }
        
       if((x == 215 || x == 425) && (y == 637))
       {
           randomdirection = (int)(Math.random() *3 +1);
           if(randomdirection == 1)
           {
               xdir = 0;
               ydir = -1 * speed;;
            }
           if(randomdirection == 2)
           {
               xdir = -1 * speed;
               ydir = 0;
            }
           if(randomdirection == 3)
           {
               xdir = speed;
               ydir = 0;
            } 
        }
        
       if((x == 637) && (y == 215 || y == 425))
       {
           randomdirection = (int)(Math.random() *3 +1);
           if(randomdirection == 1)
           {
               xdir = -1 * speed;
               ydir = 0;
            } 
           if(randomdirection == 2)
           {
               xdir = 0;
               ydir = -1 * speed;;
            }
           if(randomdirection == 3)
           {
               xdir = 0;
               ydir = speed;
            } 
           }
           
       if((x == 215 || x == 425) && (y == 215 || y == 425))
       {
           randomdirection = (int)(Math.random() *4 +1);
           if(randomdirection ==1)
           {
               xdir = speed;
               ydir = 0;
            } 
           if(randomdirection ==2)
           {
               xdir = 0;
               ydir = -1 * speed;;
            }
           if(randomdirection ==3)
           {
               xdir = 0;
               ydir = speed;
            }  
           if(randomdirection ==4)
           {
               xdir = -1 * speed;
               ydir = 0;
            }
        } 
    }
     
    public void changeDirectionChase(Pacman pac)
     {
        xdir = 0; 
        ydir = 0; 
        
        randomdirection = (int)(Math.random()  * 2 + 1);
        
        if(randomdirection == 1)
        {
            if(x < pac.getX())
                 xdir = speed;    
              else xdir = -1 * speed;     
        }
        
         if(randomdirection == 2)
        {
          if(y < pac.getY())
                 ydir = speed;    
              else ydir = -1 * speed;;     
        }
     }
     
    
    public void changeDirectionRun(Pacman pac)
     {
        if((x == 8) && (y == 8)) /** only avaliable desired directions: down, right*/
       {
           randomdirection = (int)(Math.random() *2+1);
           if(randomdirection == 1)
           {
               xdir = 0;
               ydir = speed;
            }     
           if(randomdirection == 2)
           {
               xdir = speed;
               ydir = 0;
            }
        }
       if((x == 637) && (y == 8)) /** down, left */
       {
          randomdirection = (int)(Math.random() *2 +1);
         if(randomdirection ==1)
         {
             xdir = 0;
             ydir = speed;
            }
         if(randomdirection == 2)
         {
             xdir = -1 * speed;
             ydir = 0;
             }
        }   
       if((x == 8) && (y == 637)) /** up, right */
       {
           randomdirection = (int)(Math.random() *2 +1);
          if(randomdirection ==1)
           {
               xdir = 0;
               ydir = -1 * speed;;
            }
          if(randomdirection ==2)
           {
               xdir = speed;
               ydir = 0;
            }   
        }
       if((x == 637) && (y == 637)) /** up, left */
       {
           randomdirection = (int)(Math.random() *2 +1);
           if(randomdirection ==1)
           {
               xdir = 0;
               ydir = -1 * speed;;
            }
           if(randomdirection ==2)
           {
               xdir = -1 * speed;
               ydir = 0;
            } 
        }
        
       if((x == 215 || x == 425) && (y == 8)) /** only down,left,right*/
       {
           randomdirection = (int)(Math.random() *3 +1);
           if(randomdirection == 1)
           {
               xdir = 0;
               ydir = speed;
            }
           if(randomdirection == 2)
           {
               xdir = -1 * speed;
               ydir = 0;
            }
           if(randomdirection == 3)
           {
               xdir = speed;
               ydir = 0;
            } 
        }
       if((x == 8) && (y == 215 || y ==  425)) /** only up,down,right */
       {
           randomdirection = (int)(Math.random() *3 +1);
           if(randomdirection == 1)
           {
               xdir = 0;
               ydir = speed;
            }
           if(randomdirection == 2)
           {
               xdir = 0;
               ydir = -1 * speed;;
            }
           if(randomdirection == 3)
           {
               xdir = speed;
               ydir = 0;
            }
        }
       if((x == 215 || x == 425) && (y == 637))
       {
           randomdirection = (int)(Math.random() *3 +1);
           if(randomdirection == 1)
           {
               xdir = 0;
               ydir = -1 * speed;;
            }
           if(randomdirection == 2)
           {
               xdir = -1 * speed;
               ydir = 0;
            }
           if(randomdirection == 3)
           {
               xdir = speed;
               ydir = 0;
            } 
        }
       if((x == 637) && (y == 215 || y == 425))
       {
           randomdirection = (int)(Math.random() *3 +1);
           if(randomdirection == 1)
           {
               xdir = -1 * speed;
               ydir = 0;
            } 
           if(randomdirection == 2)
           {
               xdir = 0;
               ydir = -1 * speed;;
            }
           if(randomdirection == 3)
           {
               xdir = 0;
               ydir = speed;
            } 
           }
       if((x == 215 || x == 425) && (y == 215 || y == 425))
       {
           randomdirection = (int)(Math.random() *4 +1);
           if(randomdirection ==1)
           {
               xdir = speed;
               ydir = 0;
            } 
           if(randomdirection ==2)
           {
               xdir = 0;
               ydir = -1 * speed;;
            }
           if(randomdirection ==3)
           {
               xdir = 0;
               ydir = speed;
            }  
           if(randomdirection ==4)
           {
               xdir = -1 * speed;
               ydir = 0;
            }
        }
        }
     
     public void setLocation(int xx, int yy)
     {
         x = xx;
         y = yy;
        }
        
     public void increaseSpeed()
     {
         speed = speed + 0.2;
        }
    
}
