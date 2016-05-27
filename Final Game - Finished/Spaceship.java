

public class Spaceship
{
    int x,y;
    int xinc=10;
    int yinc=10;
    //Makes a Spacsship
    public Spaceship(int x,int y)
    {
        this.x=x;
        this.x=y;
    }
    
    public void setX(int x)
    {
        this.x=x;
    }
    
    public void setY(int Y)
    {
        this.y=y;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void setinc(int x,int y)
    {
        xinc = x;
        yinc = y;
    }
    
    public void movexl()
    {
        x+=xinc;
        
        
    }
    
    public void moveyu()
    {
        y+=yinc;
    }
    
    public void movexr()
    {
        x-=xinc;
        
        
    }
    
    public void moveyd()
    {
        y-=yinc;
    }
    
    
    
}
