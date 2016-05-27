
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*; 

public class Game  extends Applet implements ActionListener,KeyListener,MouseListener,MouseMotionListener
{
    //variable for the ball/(Rocket)
    private int x,y,xinc,yin1;
    private Timer timer;
    private int w,a,s,d,key;
    //Asteriods
    private int A1x,A1y,A1xinc,yinc,A1w;
    private int A2x,A2y,A2w;
    private int A3x,A3y,A3w;
    private int A4x,A4y,A4w;
    private int A5x,A5y,A5w;
    private int A6x,A6y,A6w;
    private int A7x,A7y,A7w;
    private int A8x,A8y,A8w;
    private int A9x,A9y,A9w;
    private int x2inc,y2inc,x3inc,y3inc,x4inc,y4inc,x5inc,y5inc,x6inc,y6inc,x7inc,y7inc,x8inc,y8inc;
    private int ctr,ctr2;
    private int screenw,screenh;
    private int score;
    private int level,Mouse1,Mouse2;

    public void init()
    {
        x=40;
        y=800;
        w=0;
        a=0;
        s=0;
        d=0;
        A1x=(int)(Math.random()*100+50);
        A1y=(int)(Math.random()*100+50);
        A1w=50;

        ctr=0;
        ctr2=0;
        xinc=2;
        yinc=3;
        x2inc=2;
        y2inc=3;
        x3inc=2;
        y3inc=3;
        x4inc=2;
        y4inc=3;
        x5inc=2;
        y5inc=3;
        x6inc=2;
        y6inc=3;
        x7inc=2;
        y7inc=3;
        x8inc=2;
        y8inc=3;
        score=0;
        level=1;
        key=1;

        timer = new Timer(10,this); // 10 milliseconds
        timer.start();
        setBackground(Color.YELLOW);addKeyListener(this);
        requestFocus();

        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public void mouseExited(MouseEvent me)
    {

    }

    public void mouseEntered(MouseEvent me)
    {

    }

    public void mouseReleased(MouseEvent me)
    {

    }

    public void mousePressed(MouseEvent me)
    {

    }

    public void mouseClicked(MouseEvent me)
    {

    }

    public void mouseMoved(MouseEvent me)
    {

    }

    public void mouseDragged(MouseEvent me)
    {

    }

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

    public void actionPerformed (ActionEvent ae){
        repaint();

    }

    public void paint(Graphics g)
    {
        if(level==1){

            score+=1;
            ctr+=10;
            g.setColor(Color.BLACK);
            g.drawString("Score="+score,700,100);
            g.drawString("ctr="+ctr,700,400);

            g.setColor(Color.RED);
            g.fillOval(x,y,90,90);

            //Asteriods 
            g.setColor(Color.GREEN);

            if(ctr>=1000){
                g.fillOval(A1x,A1y,A1w,A1w);
            }
            if(ctr==4000){
                A2x=(int)(Math.random()*100+50);
                A2y=(int)(Math.random()*100+50);
            }
            if(ctr>=4000){
                g.fillOval(A2x,A2y,A1w,A1w);

            }
            if(ctr==7000){
                A3x=(int)(Math.random()*100+50);
                A3y=(int)(Math.random()*100+50);
            }

            if(ctr>=7000){
                g.fillOval(A3x,A3y,A1w,A1w);
            }
            if(ctr==11000){
                A4x=(int)(Math.random()*100+50);
                A4y=(int)(Math.random()*100+50);
            }

            if(ctr>=11000){
                g.fillOval(A4x,A4y,A1w,A1w);
            }
            if(ctr==15000){
                A5x=(int)(Math.random()*100+50);
                A5y=(int)(Math.random()*100+50);
            }
            if(ctr>=15000){
                g.fillOval(A5x,A5y,A1w,A1w);
            }
            if(ctr==19000){
                A6x=(int)(Math.random()*100+50);
                A6y=(int)(Math.random()*100+50);
            }
            if(ctr>=19000){
                g.fillOval(A6x,A6y,A1w,A1w);
            }
            if(ctr==21000){
                A7x=(int)(Math.random()*100+50);
                A7y=(int)(Math.random()*100+50);
            }
            if(ctr>=21000){
                g.fillOval(A7x,A7y,A1w,A1w);
            }
            if(ctr==25000){
                A8x=(int)(Math.random()*100+50);
                A8y=(int)(Math.random()*100+50);
            }
            if(ctr>=25000){
                g.fillOval(A8x,A8y,A1w,A1w);
            }

            if(ctr==30000){

                xinc=(int)(Math.random()*5+1);
                yinc=(int)(Math.random()*5+1);
                x2inc=(int)(Math.random()*5+1);
                y2inc=(int)(Math.random()*5+1);
                x3inc=(int)(Math.random()*5+1);
                y3inc=(int)(Math.random()*5+1);
                x4inc=(int)(Math.random()*5+1);
                y4inc=(int)(Math.random()*5+1);
                x5inc=(int)(Math.random()*5+1);
                y5inc=(int)(Math.random()*5+1);
                x6inc=(int)(Math.random()*5+1);
                y6inc=(int)(Math.random()*5+1);
                x7inc=(int)(Math.random()*5+1);
                y7inc=(int)(Math.random()*5+1);
                x8inc=(int)(Math.random()*5+1);
                y8inc=(int)(Math.random()*5+1);
            }

            A1x+=xinc;
            A1y+=yinc;
            A2x+=x2inc;
            A2y+=y2inc;
            A3x+=x3inc;
            A3y+=y3inc;
            A4x+=x4inc;
            A4y+=y4inc;
            A5x+=x5inc;
            A5y+=y5inc;
            A6x+=x6inc;
            A6y+=y6inc;
            A7x+=x7inc;
            A7y+=y7inc;
            A8x+=x8inc;
            A8y+=y8inc;

            //Boucne off the walls
            if(A1x+A1w>=getWidth() || A1x<=0){
                xinc*=-1;
            }
            if(A1y+A1w>=getHeight() || A1y<=0  ){
                yinc*=-1;
            }
            if(A2x+A1w>=getWidth() || A2x<=0){
                x2inc*=-1;
            }
            if(A2y+A1w>=getHeight() || A2y<=0){
                y2inc*=-1;
            }
            if(A3x+A1w>=getWidth() || A3x<=0){
                x3inc*=-1;
            }
            if(A3y+A1w>=getHeight() || A3y<=0){
                y3inc*=-1;
            }
            if(A4x+A1w>=getWidth() || A4x<=0){
                x4inc*=-1;
            }
            if(A4y+A1w>=getHeight() || A4y<=0){
                y4inc*=-1;
            }
            if(A5x+A1w>=getWidth() || A5x<=0){
                x5inc*=-1;
            }
            if(A5y+A1w>=getHeight() || A5y<=0){
                y5inc*=-1;
            }
            if(A6x+A1w>=getWidth() || A6x<=0){
                x6inc*=-1;
            }
            if(A6y+A1w>=getHeight() || A6y<=0){
                y6inc*=-1;
            }
            if(A7x+A1w>=getWidth() || A7x<=0){
                x7inc*=-1;
            }
            if(A7y+A1w>=getHeight() || A7y<=0){
                y7inc*=-1;
            }
            if(A8x+A1w>=getWidth() || A8x<=0){
                x8inc*=-1;
            }
            if(A8y+A1w>=getHeight() || A8y<=0){
                y8inc*=-1;
            }

            //game ending
            if(Math.abs(x-A1x)<=40 && Math.abs(y-A1y)<=40){
                level=0;
            }
            if(Math.abs(x-A2x)<=40 && Math.abs(y-A2y)<=40){
                level=0;
            }
            if(Math.abs(x-A3x)<=40 && Math.abs(y-A3y)<=40){
                level=0;
            }
            if(Math.abs(x-A4x)<=40 && Math.abs(y-A4y)<=40){
                level=0;
            }
            if(Math.abs(x-A5x)<=40 && Math.abs(y-A5y)<=40){
                level=0;
            }
            if(Math.abs(x-A6x)<=40 && Math.abs(y-A6y)<=40){
                level=0;
            }
            if(Math.abs(x-A7x)<=40 && Math.abs(y-A7y)<=40){
                level=0;
            }
            if(Math.abs(x-A8x)<=40 && Math.abs(y-A8y)<=40){
                level=0;
            }

            if(key==1){
                if(w==0){
                    y+=10;
                }
                if(a==0){
                    x+=10;
                }
                if(s==0){
                    y-=10;
                }
                if(d==0){
                    x-=10;
                }
            }
        }

        else{
            g.setColor(Color.BLACK);
            g.fillRect(0,0,getWidth(),getHeight());

        }
    }
}