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
public class Level1 extends JPanel
{
    public void paintComponent(Graphics g)//background
    {
        BufferedImage background=null;
        try{
           background=ImageIO.read(new File("stars_texture2959.jpg"));
        }catch(IOException e){
        }
       g.drawImage(background,0,0,this);
       g.setColor(Color.pink);
       g.fillRect(0,0,300,300);
       g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
       g.setColor(Color.white);
       g.drawString("Warning: Astoid Spawning", 20, 150);
    }
}