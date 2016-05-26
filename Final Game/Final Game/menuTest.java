import javax.swing.JFrame;
import javax.swing.JPanel;
public class menuTest
{
    
    
    
    public static void main (String[] args)
    {
        JFrame f=new JFrame("MenuTest");
        f.setVisible(true);
        f.setSize(1000,1000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        menu m1=new menu();
        
        f.add(m1);
        
    }
    
}
    