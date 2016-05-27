

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
        this.y=Y;
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
    // Used to keep spaceship on screen
    public void onscreen(int x, int y)
    {
        int temp=0;
        
        
        if(x<=0)
        {
            setX(0);
        }
        else if(y>=925)
        {
            setY(925);
        }
        else if(y<=0)
        {
            setY(0);
        }
        else if(x>=925)
        {
            setX(925);
        }
        
    
    }
    
}
