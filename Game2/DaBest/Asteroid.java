import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;
import java.applet.*; 
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class Asteroid
{
    private int Ax=0;
    private int Ay=0;
    private int Xinc=1;
    private int Yinc=1;

    public Asteroid(int x, int y,int locx,int locy){
        Xinc=x;
        Yinc=y;
        Ax=locx;
        Ay=locy;
    }
    
    public void move()
    {
        if(collidesX() || collidesY()){
            Xinc=0-Xinc;
        }
        Ax+=Xinc;
        Ay+=Yinc;
    }

    public void setX(int x){
        Xinc=x;
    }

    public void setY(int y){
        Yinc=y;
    }
    
    public int getX(){
        return Ax;
    }
    
    public int getY(){
        return Ay ;
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
}