
import java.awt.*; 
import javax.swing.*; 
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class screen extends JApplet
{
    int w,h;
    boolean dead;
    int lives=0;
    public void init()
    {
        w=this.getWidth();
        h=this.getHeight();
        dead=false;
    }
    public void paint(Graphics g)
    {
      Graphics2D g2 = (Graphics2D) g;
      Image img = Toolkit.getDefaultToolkit().getImage("back.jpg");
      Image bg=img.getScaledInstance(w,h, Image.SCALE_SMOOTH);
      g2.drawImage(bg,0,0,this);
      g2.setColor(Color.white);
      g2.fillRect(20,0,10,h);
    }
    /*public void run()
    {
      while (!dead)
      {                         
        repaint();
        try
         {
          Thread.sleep(20);
        }
        catch (InterruptedException e) {;}
      }
    }
    */
}
