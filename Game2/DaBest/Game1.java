
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*; 
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class Game1 
{

    Button play; 

    public static void main(String[]args)
    {


        Screen1 s1=new Screen1();

        JFrame f=new JFrame("Game");
        f.add(s1);
        f.setSize(800,800);
        f.setVisible(true);
        

        
    }

    

}