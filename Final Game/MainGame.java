
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

public class MainGame extends Applet implements ActionListener,KeyListener
{
    Timer timer;
    long time = System.currentTimeMillis(); 
    int fps=1;
    private Image i;
    private Graphics gg;
    int x=500;
    int y=500;
    int level=1;
    int ctr=0;
    int xi = 10;
    int yi = 15;

    Asteroid A1 = new Asteroid(10,10);
    Asteroid A2 = new Asteroid(10,10);
    Asteroid A3 = new Asteroid(10,10);
    Asteroid A4 = new Asteroid(10,10);
    Asteroid A5 = new Asteroid(10,10);
    Asteroid A6 = new Asteroid(10,10);

    Spaceship space = new Spaceship(500,500);
    private int w,a,s,d,key;

    public void init()
    {
        timer = new Timer(10,this);
        timer.start();
        
        if(level==1)
        {
            A1.setinc(10,20);
            A2.setinc(((int)((Math.random())+1)*10),((int)((Math.random())+1)*20));
            A3.setinc(((int)((Math.random())+1)*10),((int)((Math.random())+1)*20));
            A4.setinc(((int)((Math.random())+1)*10),((int)((Math.random())+1)*20));

        }
        
        addKeyListener(this);
        requestFocus();

    }

    public void keyReleased(KeyEvent evt){
//         int yyy=evt.getKeyCode();
//         switch(yyy){
//             case(KeyEvent.VK_W):
//             w=0;
//             break;
//             case(KeyEvent.VK_A):            
//             a=0;
// 
//             break;
//             case(KeyEvent.VK_S):
//             s=0;
//             break;
//             case(KeyEvent.VK_D):
//             d=0;
//             break;
// 
//         }

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

    public void actionPerformed (ActionEvent ae){
        repaint();

    }

    public void paint(Graphics g)
    {
        time = (1000 / fps) - (System.currentTimeMillis() - time); 
        BufferedImage background=null;
        BufferedImage ship=null;
        try{
            background=ImageIO.read(new File("starfield.gif"));
        }catch(IOException e){
        }
        try{
            ship=ImageIO.read(new File("8TEjdMaGc.png"));
        }catch(IOException e){
        }
        Image ship1 = resize(ship,75,75);

        g.drawImage(background,0,0,this);
        g.setColor(Color.pink);
        g.fillRect(0,0,300,300);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
        g.setColor(Color.white);
        g.drawString("Warning: Astoid Spawning", 20, 150);
        g.drawString("ctr="+ctr,40,300);

        if(level==1)
        {
            key=1;

            //                 x=space.getX();
            //                 y=space.getY();
            //g.drawImage(ship1,x,y,this);
            
            g.fillOval(x,y,50,50);

            
            if(ctr>=0)
            {
                g.fillOval(A1.getX(),A1.getY(),100,100);
                A1.move();
                A1.Collide();
            }
            if(ctr>=100)
            {
                g.fillOval(A2.getX(),A2.getY(),100,100);
                A2.move();
                A2.Collide();
            }
            if(ctr>=300)
            {
                g.fillOval(A3.getX(),A3.getY(),100,100);
                A3.move();
                A3.Collide();
            }
            
            

            if(key==1){
                if(w==0){
                    y+=30;
                }
                if(a==0){
                    x+=30;
                }
                if(s==0){
                    y-=30;
                }
                if(d==0){
                    x-=30;
                }
                
            }

        }
        ctr+=1;

    }

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
