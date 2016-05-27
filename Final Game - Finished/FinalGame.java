import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*; 
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent.*;

public class FinalGame extends Applet implements ActionListener, KeyListener
{
    //Crating a timer
    Timer timer;
    
    // Creating a Double Buffer Image
    private Image i;
    private Graphics gg;
    //Level and counter and score
    int level;
    int ctr;
    int score;

    // Making Asteroids
    Asteroid A1 = new Asteroid(10,10);
    Asteroid A2 = new Asteroid(10,10);
    Asteroid A3 = new Asteroid(10,10);
    private BufferedImage ast=null;// original
    Image ast1;// Resized Image
    
    //Making Spaceship
    Spaceship space = new Spaceship(500,500);
    BufferedImage ship=null; // Original Image
    Image ship1;// Rescaled Image
        
    //Movement
    private int w,a,s,d,key;
    
    //Background Images
    BufferedImage background=null;
    BufferedImage Warno=null; // Original
    Image Warn;// Resized
    private BufferedImage ss=null;
    private BufferedImage sss=null;
    
    
    //Used to Test Collision of Spaceship and Asteroid
    Collisions c1 = new Collisions();
    Collisions c2 = new Collisions();
    Collisions c3 = new Collisions();
    
    //Buttons
    Button Level1, Level2;

        



    public void init()
    {
        //Starts TImer
        timer = new Timer(1,this);
        timer.start();
        
        //Movement using Keyboard
        key=1;
        addKeyListener(this);
        requestFocus();
        
        // Setting Level, Counter and Score
        level=0;
        score=0;
        ctr=0;
        
        //Creates The Image Variables
        try{
                background=ImageIO.read(new File("starfield.gif"));
            }catch(IOException e){
            }
        try{
            ship=ImageIO.read(new File("8TEjdMaGc.png"));
        }catch(IOException e){
        }
        try{
            ast=ImageIO.read(new File("asteroid-clipart-PngMedium-moon-15892.png"));
        }catch(IOException e){
        }
        try{
            Warno=ImageIO.read(new File("warning-icon-hi.png"));
        }catch(IOException e){
        }
        // Resizing Images
        ship1 = resize(ship,75,75);
        ast1 = resize(ast,100,100);
        Warn = resize(Warno,150,150);

        //Making Buttons
        Level1 = new Button("Level 1");
        Level2 = new Button("Level 2");
        add(Level1);
        add(Level2);
        Level1.addActionListener(this);
        Level2.addActionListener(this);

    }

    //Movement Using W A S D
    public void keyReleased(KeyEvent evt){
        int yyy=evt.getKeyCode();
        switch(yyy){
            case(KeyEvent.VK_W):
            w=0;
            break;
            case(KeyEvent.VK_A):            
            a=0;

            break;
            case(KeyEvent.VK_S):
            s=0;
            break;
            case(KeyEvent.VK_D):
            d=0;
            break;

        }

    }

    public void keyPressed(KeyEvent evt){
        int zzz=evt.getKeyCode();
        switch(zzz){
            case(KeyEvent.VK_W):
            w=1;
            break;
            case(KeyEvent.VK_A):            
            a=1;

            break;
            case(KeyEvent.VK_S):
            s=1;
            break;
            case(KeyEvent.VK_D):
            d=1;
            break;
        }

    }

    public void keyTyped(KeyEvent evt){

    }

    //Making Buttons Change Levels
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()==Level1)
        {
            level=1;
        }
        else if(ae.getSource()==Level2)
        {
            level=2;
        }

        repaint();

    }

    //Game Graphics
    public void paint(Graphics g)
    {

        if(level==0)
        {
            //Background Images
            try{
                ss=ImageIO.read(new File("8TEjdMaGc.png"));
            }catch(IOException e){
            }
            try{
                sss=ImageIO.read(new File("starfield.gif"));
            }catch(IOException e){
            }   

            //Drawing a Background
            g.drawImage(sss,0,0,this);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 90)); 
            g.setColor(Color.white);
            g.drawString("Asteroids", 300, 300);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
            g.setColor(Color.white);
            g.drawString("Created by: Siddharth Nair, Ojas Rade, Mauryaaditya Puplipati, Adam Kastler", 150, 400);
            g.drawImage(ss,100,401,this);
            Level1.setBounds(400,600,100,50);
            Level2.setBounds(600,600,100,50);




        }
        if(level==1){
            //Removiing Buttons to Avoid Conflict With KeyListener
            remove(Level1);
            remove(Level2);
            //Drawing Background
            g.drawImage(background,0,0,this);
            g.drawImage(Warn,10,10,this);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
            g.setColor(Color.WHITE);
            g.drawString("Score = "+score,40,300);

            //Tracking Score and Counter
            score+=1;
            ctr+=10;
            
            //making Spaceship
            g.setColor(Color.BLUE);
            g.drawImage(ship1,space.getX(),space.getY(),this);
            space.onscreen(space.getX(),space.getY());

            //Moving the SpaceShip
            if(key==1){
                if(w==0){
                    space.moveyu();
                }
                if(a==0){
                    space.movexl();
                }
                if(s==0){
                    space.moveyd();
                }
                if(d==0){
                    space.movexr();
                }
            }
            

            // Setting Asteroids Speed
            if(ctr==10)
            {
                A1.setinc(10,5);
                A2.setinc(15,8);
                A3.setinc(17,11);

            }

            //Making the Asteroids

            if(ctr>=0)
            {
                g.drawImage(ast1,A1.getX(),A1.getY(),this);
                A1.move();
                A1.Collide();
            }
            if(ctr>=1000)
            {
                g.drawImage(ast1,A2.getX(),A2.getY(),this);
                A2.move();
                A2.Collide();
            }
            if(ctr>=3000)
            {
                g.drawImage(ast1,A3.getX(),A3.getY(),this);
                A3.move();
                A3.Collide();
            }

            //Checlking for end game
            c1.set(space.getX(),space.getY(),A1.getX(),A1.getY());
            c2.set(space.getX(),space.getY(),A2.getX(),A2.getY());
            c3.set(space.getX(),space.getY(),A3.getX(),A3.getY());
            if(c1.collides())
            {
                ctr=0;
                level=3;
            }
            if(c2.collides())
            {
                ctr=0;
                level=3;
            }
            if(c3.collides())
            {
                ctr=0;
                level=3;
            }

        }
        if(level==2){
            //Removiing Buttons to Avoid Conflict With KeyListener
            remove(Level1);
            remove(Level2);
            
            //Creating Backgrounds
            g.drawImage(background,0,0,this);
            g.drawImage(Warn,10,10,this);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
            g.setColor(Color.WHITE);
            g.drawString("Score = "+score,40,300);
            
            //Tracking Score and Counter
            score+=1;
            ctr+=10;

            //making Spaceship
            g.drawImage(ship1,space.getX(),space.getY(),this);
            space.onscreen(space.getX(),space.getY());

            //Moving the SpaceShip
            if(key==1){
                if(w==0){
                    space.moveyu();
                }
                if(a==0){
                    space.movexl();
                }
                if(s==0){
                    space.moveyd();
                }
                if(d==0){
                    space.movexr();
                }
            }


            // Setting Asteroids Speed
            if(ctr==10)
            {
                A1.setinc(20,15);
                A2.setinc(13,27);
                A3.setinc(5,21);

            }

            //Making the Asteroids

            if(ctr>=0)
            {
                g.drawImage(ast1,A1.getX(),A1.getY(),this);
                A1.move();
                A1.Collide();
            }
            if(ctr>=1000)
            {
                g.drawImage(ast1,A2.getX(),A2.getY(),this);
                A2.move();
                A2.Collide();
            }
            if(ctr>=3000)
            {
                g.drawImage(ast,A3.getX(),A3.getY(),this);
                A3.move();
                A3.Collide();
            }

            //Checlking for end game
            c1.set(space.getX(),space.getY(),A1.getX(),A1.getY());
            c2.set(space.getX(),space.getY(),A2.getX(),A2.getY());
            c3.set(space.getX(),space.getY(),A3.getX(),A3.getY());
            if(c1.collides())
            {
                ctr=0;
                level=3;
            }
            if(c2.collides())
            {
                ctr=0;
                level=3;
            }
            if(c3.collides())
            {
                ctr=0;
                level=3;
            }

        }

        if(level==3)

        {
            //Making Background

            try{
                sss=ImageIO.read(new File("starfield.gif"));
            }catch(IOException e){
            }   

            g.drawImage(sss,0,0,this);

            g.setFont(new Font("TimesRoman", Font.PLAIN, 100)); 
            g.setColor(Color.white);
            g.drawString("Game Over!",300,300);
            g.drawString("score = "+score,300,500);


        }

    }
    
    //used to DoubleBuffer
    public void update(Graphics g)
    {
        if(i==null)
        {
            i = createImage(this.getSize().width,this.getSize().height);
            gg = i.getGraphics();
        }
        gg.setColor(getBackground());
        gg.fillRect(0,0,1000,1000);

        gg.setColor(getForeground());
        paint(gg);

        g.drawImage(i,0,0,this);
    }
    
    //Used to resize Image
    public BufferedImage resize(BufferedImage img, int nW, int nH)
    {
        Image temp = img.getScaledInstance(nW, nH, Image.SCALE_SMOOTH);
        BufferedImage temp2 = new BufferedImage(nW, nH, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = temp2.createGraphics();
        g2d.drawImage(temp, 0, 0, null);
        g2d.dispose();
        return temp2;

    }
}