import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class GraphicsPanel extends JPanel
    {
        Player hhero;
        Image blurbimage;
        String[] bblurbline1, bblurbline2;
        
        int bblurbnum,ooption,xx,yy;
        boolean sshowblurb,pproceed;
        
        public GraphicsPanel(boolean showblurb, int option)
            {
                setBackground(Color.gray);
                sshowblurb = true;
                
                blurbimage = Toolkit.getDefaultToolkit().getImage("blurb.png");
                
                sshowblurb = showblurb;
                ooption = option;
            }
            
        public void updateStartValues(boolean showblurb, int option, boolean proceed)
            {
                sshowblurb = showblurb;
                ooption = option;
                pproceed = proceed;
            }
            
        public void updateBlurbMessage(int blurbnum)
            {
                bblurbnum = blurbnum;
            }
            
        public void paint (Graphics g)
            {
                super.paint(g);
                
                g.setColor(Color.black);
                g.setFont(new Font("Tahoma",Font.BOLD, 25));
                if(sshowblurb == true)
                    {
                        g.drawImage(blurbimage,0,417,715,265,null);
                    }
                if(bblurbnum == 1){
                    g.drawString("Hello and welcome to the world of Pokémon!", 55,550); }
                if(bblurbnum == 2){
                    g.drawString("This is sample text",55,550); }

            }
            
    }