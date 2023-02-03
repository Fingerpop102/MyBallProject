import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class BallPanel extends JPanel
{
    int x = 80;
    int y = 20;
    int xspeed = 3;
    int yspeed = 3;
    ArrayList<Ball> balls = new ArrayList<Ball>();
    Ball userBall = new Ball();
    public BallPanel()
    {
        setBackground(new Color(210,120,10));
        setFocusable(true);
        for(int i = 0; i < 20; i++)
        {
            balls.add(new Ball());
        }
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();

                if (key == KeyEvent.VK_LEFT) {
                    userBall.moveLeft();
                }

                if (key == KeyEvent.VK_RIGHT) {
                    userBall.moveRight();

                }

                if (key == KeyEvent.VK_UP) {
                    userBall.moveUp();
                }

                if (key == KeyEvent.VK_DOWN) {
                    userBall.moveDown();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }





    @Override
    protected void paintComponent(Graphics g)
    {

        super.paintComponent(g);

        for(Ball b : balls)
        {
            b.moveBall(this);
            b.drawBall(g);
        }

        userBall.drawBall(g);


        try
        {
            Thread.sleep(10);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        repaint();
    }
}