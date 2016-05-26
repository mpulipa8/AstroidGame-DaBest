import javax.swing.JFrame;
import javax.swing.JPanel;
public class Level1Test
{
    
    
    
    public static void main (String[] args)
    {
        JFrame f=new JFrame("MenuTest");
        
        f.setSize(1000,1000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Level1 l1=new Level1();
        
        f.add(l1);
       f.setVisible(true);
     
        
    }
    
}
    