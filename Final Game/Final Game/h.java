
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*; 



/**
 * Class h - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class h extends Applet implements ActionListener
{
    
    
    int x=0;
    int y=0;
    Timer timer;

  

  
    public void paint(Graphics g)
    {
        
        timer=new Timer(10,this);
        
        g.fillRect(x,y,100,100);
        x+=5;
        x+=5;
       timer.start();
    }
    public void actionPerformed (ActionEvent ae){
        repaint();

    }

   



}
