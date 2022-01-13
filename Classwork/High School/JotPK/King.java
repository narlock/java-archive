public class King
    {
        int x,y;
        
        public King(int xx, int yy)
            {
                x = xx;
                y = yy;
            }
            
        public int getX() {return x;}
        public int getY() {return y;}
        
        public void moveKing(int xdir, int ydir)
            {
                x = x + xdir;
                y = y + ydir;
            }
    }