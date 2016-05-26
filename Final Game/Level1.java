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
    Timer timer;
    int Ax1,Ay1,Ax2,Ay2,Ax3,Ay3,Ax4,Ay4;
    int x1inc,x2inc,x3ing,x4inc,y1inc,y2inc,y3inc,y4inc;
    int ctr=0;
    public void initiate()
    {
        //Starts the Timer
        timer = new Timer(5,this);
        timer.start();
        //Maks Asteroids
        Asteroid A1 = new Asteroid(0,0);
        Asteroid A2 = new Asteroid(0,0);
        Asteroid A3 = new Asteroid(0,0);
        Asteroid A4 = new Asteroid(0,0);
        
        //Makes Spaceship
        
        
        
        
        
        //Setting Asteroids Variables
        Ax1=A1.getX();
        Ay1=A1.getY();
        Ax2=A2.getX();
        Ay2=A2.getY();
        Ax3=A3.getX();
        Ay3=A3.getY();
        Ax4=A4.getX();
        Ay4=A4.getY();
        
        
        
    }
    public void paintComponent(Graphics g)
    {
        

        Image img = Toolkit.getDefaultToolkit().getImage("back.jpg");
        Image bg=img.getScaledInstance(800,800, Image.SCALE_SMOOTH);
        g.drawImage(bg,0,0,null);
        
        
        g.fillOval(100,100,100,100);
        
        

    
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        repaint();
        
    }
}