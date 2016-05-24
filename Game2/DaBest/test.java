import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    BufferedImage ss=null;
    try{
        ss=ImageIO.read(new File("asteroid-icon.png"));
    }catch(IOException e){
    }
    g.drawImage(ss,Ax,Ay,this);
}
