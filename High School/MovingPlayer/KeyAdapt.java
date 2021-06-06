import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class KeyAdapt extends KeyAdapter
{
    World w;
    
    public KeyAdapt(World world) {
        w = world;
    }
    
    public void keyPressed(KeyEvent e) {
        w.keyPressed(e);
    }
    
    public void keyReleased(KeyEvent e) {
        w.keyReleased(e);
    }
}
