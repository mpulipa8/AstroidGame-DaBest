//asteroid=100x100
//spaceship=75x75
/**
 * Write a description of class Collitions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Collisions
{
    int shipX, shipY, astX, astY;
    public Collisions(int xa, int ya, int xs, int ys){
        shipX=xs;
        shipY=ys;
        astX=xa;
        astY=ya;
    }

    public boolean collides (){
        if(shipX>=astX && shipY>=astY){
            if(shipX-astX<=100 && shipY-astY<=75){
                return true;
            }
        }
        else if(shipX>=astX && shipY<=astY){
            if(shipX-astX<=100 && astY-shipY<=100){
                return true;
            }
        }
        else if(shipX<=astX && shipY>=astY){
            if(astX-shipX<=75 && shipY-astY<=75){
                return true;
            }
        }
        else if(shipX<=astX && shipY<=astY){
            if(astX-shipX<=75 && astY-shipY<=100){
                return true;
            }
        }
        
        
        return false;
    
    }
}
