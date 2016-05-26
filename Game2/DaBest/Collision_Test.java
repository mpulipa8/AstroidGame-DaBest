
/**
 * Write a description of class Collision_Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Collision_Test implements ActionListener
{
    int x1,x2,y1,y2;
    public static void main(String[]args){
        Asteroid a1=new Asteroid(1,1);
        Asteroid a2=new Asteroid(1,1);
        Collision c=new Collision(a1.getX,a1.getY,a2.getX,a2.getY);
        a1.move();
        a2.move();
        Timer t1=new Timer(5,this);
    }

    public void actionPerformed(ActionEvent e){
        repaint();
    }
}
