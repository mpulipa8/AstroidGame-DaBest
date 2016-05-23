
import java.awt.*; 
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class menu extends JPanel 

{
BufferStrategy bs;


    public menu()
    {
        
        //         BufferedImage ss=null;
        //         BufferedImage sss=null;
        // 
        //         try{
        //             ss=ImageIO.read(new File("aster.jpg"));
        //         }catch(IOException e){
        //         }
        //         try{
        //             sss=ImageIO.read(new File("stars_texture2959.jpg"));
        //         }catch(IOException e){
        //         }
        // 
        // 
        //        
        // 
        //         setSize(800,800);
        //         setBackground(sss);
        //         setVisible(true);
        //         add(button);
        //         
        //         
        // //         button.setLocation(600,600);
        // //         button.addActionListener(this); 
        // //         
        // //         add(menu, BorderLayout.CENTER);

        Graphics2D g = (Graphics2D)bs.getDrawGraphics();
        BufferedImage ss=null;
        BufferedImage sss=null;
        try{
            ss=ImageIO.read(new File("aster.jpg"));
        }catch(IOException e){
        }
        try{
            sss=ImageIO.read(new File("stars_texture2959.jpg"));
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
        //play.setBounds(400,600,100,100);
    }

}

