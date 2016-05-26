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
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.image.*;
public class menu extends JPanel
{
    private BufferedImage ss=null;
    private BufferedImage sss=null;
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        try{
            ss=ImageIO.read(new File("aster.jpg"));
        }catch(IOException e){
        }
        try{
            sss=ImageIO.read(new File("starfield.gif"));
        }catch(IOException e){
        }   
        g.drawImage(sss,0,0,this);
       g.setFont(new Font("TimesRoman", Font.PLAIN, 90)); 
       g.setColor(Color.white);
       g.drawString("Asteroids", 200, 200);
       g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
       g.setColor(Color.white);
       g.drawString("Created by: Siddharth Nair, Ojas Rade, Mauryaaditya Puplipati, Adam Kastler", 70, 300);
       g.drawImage(ss,100,400,this);

    }

}