
public class Collisions
{
    int shipX, shipY, astX, astY;
    public Collisions(){

    }
    //Takes is variables to check for game end
    public void set(int sx,int sy, int ax, int ay)
    {
        shipX = sx;
        shipY = sy;
        astX = ax;
        astY = ay;
    }
    //Checks for a Game end the checks are a little more leinetn because we are not ncrementing by 1
    public boolean collides (){
        if(shipX<=astX && shipY>=astY){
            if(Math.abs(shipX-astX)<=40 && Math.abs(shipY-astY)<=65){
                return true;
            }
        }
        else if(shipX>=astX && shipY>=astY){
            if(Math.abs(shipX-astX)<=75 && Math.abs(shipY-astY)<=65){
                return true;
            }
        }
        else if(shipX>=astX && shipY<=astY){
            if(Math.abs(shipX-astX)<=75 && Math.abs(shipY-astY)<=55){
                return true;
            }
        }
        else if(shipX<=astX && shipY<=astY){
            if(Math.abs(shipX-astX)<=60 && Math.abs(shipY-astY)<=55){
                return true;
            }
        }
        return false;
    }
}
