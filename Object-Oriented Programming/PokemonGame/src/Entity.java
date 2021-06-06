import java.awt.*;
public class Entity
{
    int x,y,XDim,YDim;
    public Entity(int x, int y, int XDim, int YDim)
    {
        this.x = x;
        this.y  = y;
        this.XDim = XDim;
        this.YDim = YDim;
    }
    
    public Entity(int x, int y) /**Overloading constructor*/
    {
        this.x = x;
        this.y  = y;
        this.XDim = 0;
        this.YDim = 0;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getXDim() {
        return XDim;
    }
    
    public int getYDim() {
        return YDim;
    }
    
    
    
}
