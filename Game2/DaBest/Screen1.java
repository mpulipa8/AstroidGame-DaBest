import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import javax.swing.JPanel;

import java.awt.*; 
import javax.swing.*; 
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class Screen1 extends JPanel
{
    BufferStrategy bs;
    int w,h;

    public Screen1()
    {
        Graphics2D g = (Graphics2D)bs.getDrawGraphics();
        w=this.getWidth();
        h=this.getHeight();
        Graphics2D g2 = (Graphics2D) g;
        Image img = Toolkit.getDefaultToolkit().getImage("back.jpg");
        Image bg=img.getScaledInstance(w,h, Image.SCALE_SMOOTH);
        g2.drawImage(bg,0,0,this);
        g2.setColor(Color.white);
        g2.fillRect(20,0,10,h);
        setSize(800,800);
        setVisible(true);
    }

}