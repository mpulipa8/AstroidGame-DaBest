import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;
public class Asteroid extends Applet implements ActionListener

{
    private int Ax=0;
    private int Ay=0;
    private int Xinc=1;
    private int Yinc=1;

    public Asteroid(Graphics g, int x, int y){
        g.drawRect(Ax,Ay,20,20);
        Xinc=x;
        Yinc=y;
    }
    
    public void move()
    {
        if(collidesX() || collidesY()){
            Xinc*=-1;
        }
        Ax+=Xinc;
        Ay+=Yinc;
        repaint();
    }

    public void setX(int x){
        Xinc=x;
    }

    public void setY(int y){
        Yinc=y;
    }

    private boolean collidesX(){
        if(Ax==0|| Ax==1000){
            return true;
        }
        return false;
    }
    
    private boolean collidesY(){
        if(Ay==0 || Ay==1000){
            return true;
        }
        return false;
    }

    public void actionPerformed(ActionEvent e){
        repaint();
    }
}