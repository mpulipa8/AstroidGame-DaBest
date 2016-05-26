import java.awt.*; 
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import java.io.*;
import javax.swing.*; 
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.image.*;
public class Level1 extends JPanel implements ActionListener
{
    int Ax1,Ax2,Ax3,Ax4,Ay1,Ay2,Ay3,Ay4;
    int ctr;
    int level;

    public void paintComponent(Graphics g)//background
    {
        super.paintComponent(g);
        //Starts Timer
        Timer t = new Timer(5,this);
        
        //Makes Asteroids
        Asteroid A1 = new Asteroid(3,3);
        Asteroid A2 = new Asteroid(3,3);
        Asteroid A3 = new Asteroid(3,3);
        Asteroid A4 = new Asteroid(3,3);

        //Making the Asteroids x,y
        //         Ax1=A1.getX();
        //         Ax2=A2.getX();
        //         Ax3=A3.getX();
        //         Ax4=A4.getX();
        //         Ay1=A1.getY();
        //         Ay2=A2.getY();
        //         Ay3=A3.getY();
        //         Ay4=A4.getY();

        Ax1=0;
        Ax2=0;
        Ax3=0;
        Ax4=0;
        Ay1=0;
        Ay2=0;
        Ay3=0;
        Ay4=0;

        //Making a level counter
        level=1;
        ctr=0;

        //Making the Background
        BufferedImage background=null;
        try{
            background=ImageIO.read(new File("starfield.gif"));
        }catch(IOException e){
        }
        g.drawImage(background,0,0,this);
        g.setColor(Color.pink);
        g.fillRect(0,0,300,300);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
        g.setColor(Color.white);
        g.drawString("Warning: Astoid Spawning", 20, 150);
        g.drawString("ctr="+ctr,40,300);

        //Drawing Asteroids
        if(ctr>=0)
        {
            g.fillOval(Ax1,Ay1,100,100);            
        }   
        //             if(ctr==500)
        //             {
        //                 g.fillOval(Ax2,Ay2,100,100);            
        //             }
        //             if(ctr==1000)
        //             {
        //                 g.fillOval(Ax3,Ay3,100,100);            
        //             }
        //             if(ctr==1500)
        //             {
        //                 g.fillOval(Ax4,Ay4,100,100);            
        //             } 

        //Moving the Asteroids

        Ax1+=2;
        Ay1+=2;

        //             if(ctr>=500)
        //             {
        //                 A2.move();       
        //             }
        //             if(ctr>=1000)
        //             {
        //                 A3.move(); 
        //             }
        //             if(ctr==1500)
        //             {
        //                 A4.move();        
        //             }
        ctr+=0;
        t.start();
    }


public void actionPerformed(ActionEvent e)
{
repaint();
}
}
