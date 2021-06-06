
public class Border
{    int worldindex;
        int xstart, ystart, width, height;

    public Border(int wi, int xs, int ys, int w, int h)
    {
        worldindex = wi;
        xstart = xs;
        ystart = ys;
        width = w;
        height = h;
    }
    
    public int worldindex() {
        return worldindex;
    }
}
