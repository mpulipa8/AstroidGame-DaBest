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
    private int Xinc=0;
    private int Yinc=0;

    public Asteroid( int x, int y){

        Ax=x;
        Ay=y;

    }
    //moves the asteroid
    public void move()
    {
        Ax+=Xinc;
        Ay+=Yinc;
    }


    public void setinc(int x, int y){
        Xinc=x;
        Yinc=y;
    }
    //Checks if ball hits wall
    public void Collide()
    {
        if(collidesX()){
            Xinc*=-1;
        }
        else if(collidesY())
        {
            Yinc*=-1;
        }
        
    }


    public int getX(){
        return Ax;
    }

    public int getY(){
        return Ay;
    }

    //Checks for wall bounce
    private boolean collidesX(){
        if(Ax+100>=1000 || Ax<=0)
        {
            return true;
        }
        return false;
    }

    private boolean collidesY(){
        if(Ay+100>=1000 || Ay<=0  ){
                return true;
            }
        return false;
    }

}