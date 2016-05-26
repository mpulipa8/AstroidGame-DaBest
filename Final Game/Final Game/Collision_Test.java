import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;
import java.applet.*; 
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
/**
 * Write a description of class Collision_Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Collision_Test extends Applet implements ActionListener
{
    public int x1=0;
    public int x2=0;
    public int y1=500;
    public int y2=500;
    public void paint(Graphics g){
        Asteroid a1=new Asteroid(2,2);
        Asteroid a2=new Asteroid(5,5);
        g.fillOval(a1.getX(),a1.getY(),75,75);

        Collisions c=new Collisions(a1.getX(),a1.getY(),a2.getX(),a2.getY());
        if(c.collides()){
            g.drawRect(100,100,100,100);
        }
        a1.move();
        a2.move();
        Timer t1=new Timer(20000,this);
        t1.start();
        if(x=100){
            g.fillOval(a2.getX(),a2.getY(),75,75);
        }

    }

    public void actionPerformed(ActionEvent e){
        repaint();
    }
}
