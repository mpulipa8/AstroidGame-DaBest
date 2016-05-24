package DaBest;


import java.awt.*; 
import java.applet.*; 
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class Runner extends Applet implements ActionListener 
{
    int level=0;
    Button play; 
    
    public void init()  
    { 
        setLayout(new FlowLayout()); 
        play = new Button("Play!"); 
        add(play);   
        play.addActionListener(this); 
    }  
    public void paint(Graphics g) 
    { 
        if(level==0)
        {
       this.resize(650,450);
       BufferedImage ss=null;
       try{
           ss=ImageIO.read(new File("aster.jpg"));
        }catch(IOException e){
        }
       g.setColor(Color.black);
       g.fillRect(0, 0, 800,800);
       g.setFont(new Font("TimesRoman", Font.PLAIN, 90)); 
       g.setColor(Color.white);
       g.drawString("Asteroids", 200, 200);
       g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
       g.setColor(Color.white);
       g.drawString("Created by: Siddharth Nair, Ojas Rade, Mauryaaditya Puplipati, Adam Kastler", 70, 300);
       g.drawImage(ss,100,400,this);
       play.setBounds(400,600,100,100);
    }
    if(level==1)
    {
        
        
    }
    }
    public void actionPerformed(ActionEvent evt)  
    { 
        if (evt.getSource() == play) 
        {
                   repaint();
        }
    } 
}