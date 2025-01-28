import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Arena extends JPanel{

    ArrayList<Ball> bals = new ArrayList<>();

    Ball pony = new Ball(0, 100, 5,5, 30, Color.RED);

    private int ballx = 0;
    private int bally = 100;

    public Arena(){

        for(int skib = 0; skib <= 20; skib++){

            int size = (int) (Math.random() * 21) + 10; // Ball size between 10 and 30
            int x = (int) (Math.random() * (400 - size)); // Random x position
            int y = (int) (Math.random() * (400 - size)); // Random y position
            int xSpeed = (int) (Math.random() * 5) + 1; // Speed between 1 and 5
            int ySpeed = (int) (Math.random() * 5) + 1;
            Color color = new Color((float) Math.random(), (float) Math.random(), (float) Math.random());

            bals.add(new Ball(x, y, xSpeed, ySpeed, size, color));

        }

        // In this class only
        setBackground(Color.BLUE);

    }

    public void paintComponent(Graphics g){

        for(Ball ball: bals){

            ball.draw(g);
            ball.move();
            ball.bounce(this);

        }


        //pausing the computer
        try{

            Thread.sleep(10);

        }

        catch (Exception a){

        }

        //loop paintComponent
        repaint();

    }
}
