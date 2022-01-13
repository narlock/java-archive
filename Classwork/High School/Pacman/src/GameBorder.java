public class GameBorder
{
    int xstart, ystart, xdim, ydim;
   
    /** Declare GameBorder class and set initial values*/
    public GameBorder(int xs, int ys,  int xd, int yd)
    {
       xstart = xs;
       ystart = ys;
       xdim = xd;
       ydim = yd; 
    }

    /** Methods */
    public int getXStart()
    {
        return xstart;
    }
    
    public int getYStart()
    {
        return ystart;
    }
    
     public int getXDim()
    {
        return xdim;
    }
    
    public int getYDim()
    {
        return ydim;
    }
    
}
