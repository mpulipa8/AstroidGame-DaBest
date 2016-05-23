
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Game1 
{
    
    Button play; 
    public void init()  
    { 
        setLayout(new FlowLayout()); 
        play = new Button("Play!"); 
        add(play);   
        play.addActionListener(this); 
    }  
    public static void main(String[]args)
    {
        menu m1=new menu();
        Screen1 s1=new Screen1();
        
        JFrame f=new JFrame("Game");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(m1);
        
        f.pack();
        f.setLocationByPlatform(true);
        f.setVisible(true);
        
    }
    
    
}