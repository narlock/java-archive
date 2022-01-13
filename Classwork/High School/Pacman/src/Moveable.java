

public class Moveable extends GameObject
{
    double xdir,ydir;
      
    public Moveable(int xx, int yy)
     {
      super(xx,yy);
     }

    public void moveIt(GameBorder gb)
    {
         x = x + xdir;
         y = y + ydir;
         
         /** Teleporting & other gameborder barrier */
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
            y = gb.getYStart() + gb.getYDim() - 20; 
     }   
    
}
