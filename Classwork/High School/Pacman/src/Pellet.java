

public class Pellet extends GameObject
{
    /** Create values */
    
    int x, y;
    boolean eat;
     
    /** Methods */
    public Pellet(int xx, int yy)
    {
       super(xx,yy);
       eat = false;
    }
    
    public boolean getEat()
    {
       return eat;
    }

    public void eatPellet()
    {
       eat = true;
    }
    
}
