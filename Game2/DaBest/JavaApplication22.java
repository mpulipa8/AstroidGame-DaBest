/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import javax.swing.JFrame;
import javax.swing.JPanel;
//A new comment that I just changed
/**
 *
 * @author rgammelgaard
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        JFrame f = new JFrame("MyFrame");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new NewJPanel();
        f.getContentPane().add(p);
        
        f.pack();
        f.setLocationByPlatform(true);
        f.setVisible(true);
    }
    
}
