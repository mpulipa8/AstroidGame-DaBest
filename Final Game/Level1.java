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

    public void paintComponent(Graphics g)
    {

        Image img = Toolkit.getDefaultToolkit().getImage("back.jpg");
        Image bg=img.getScaledInstance(800,800, Image.SCALE_SMOOTH);
        g.drawImage(bg,0,0,null);
        g.setColor(Color.white);
        g.fillRect(20,0,10,800);

    
        
    }
}