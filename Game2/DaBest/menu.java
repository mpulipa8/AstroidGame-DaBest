
import java.awt.*; 
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class menu extends JFrame implements ActionListener

{
    JPanel menu;
    Button play; 

    public void init()  
    { 
        setLayout(new FlowLayout()); 
        play = new Button("Play!"); 
        add(play);   
        play.addActionListener(this); 
    } 

    public menu()
    {
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

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,800);
        setVisible(true);

        menu1 = new JPanel();
        button = new JButton("button");

        menu1.setSize(800,800);
        menu1.setBackground(sss);
        menu1.setVisiable(true);
        menu1.add(button);
        
        
        button.setLocation(600,600);
        button.addActionListener(this); 
        
        add(menu, BorderLayout.CENTER);

    }
    public void actionPerformed(ActionEvent a){
    JPanel panel = Game.Game();
    this.remove(menu);
    this.add(panel);   
}

}