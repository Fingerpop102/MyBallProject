import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame1 = new JFrame();
        frame1.setSize(500,500);

        BallPanel bPanel = new BallPanel();


        frame1.add(bPanel);
        frame1.setVisible(true);
    }
}