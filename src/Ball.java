import java.awt.*;
import javax.swing.*;

public class Ball extends JPanel
{
    private int x;
    private int y;
    private int size;
    private int xspeed;
    private int yspeed;
    private Color color;

    public Ball()
    {
        this.x = (int)(Math.random()*400)+1;
        this.y = (int)(Math.random()*400)+1;
        this.size = (int)(Math.random()*20)+1;
        this.color = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
        this.xspeed = (int)(Math.random()*5)+1;
        this.yspeed = (int)(Math.random()*5)+1;
    }

    public Ball(int x, int y, int size)
    {
        this.x = x;
        this.y = y;
        this.size = size;
    }
    public void drawBall(Graphics g)
    {
        g.fillOval(x,y,size,size);
        g.setColor(color);
    }
    public void moveBall(JPanel h)
    {
        x += xspeed;
        y += yspeed;
        if(x >= h.getWidth() - size || x <= 0)
        {
            xspeed *= -1;
        }

        if(y >= h.getHeight() - size || y <= 0)
        {
            yspeed *= -1;
        }
    }
    public int getx()
    {
        return x;
    }
    public int gety()
    {
        return y;
    }
    public int getsize()
    {
        return size;
    }
    public void moveRight()
    {
        x += 3;
    }
    public void moveLeft()
    {
        x -= 3;
    }
    public void moveUp()
    {
        y -= 3;
    }
    public void moveDown()
    {
        y += 3;
    }
}