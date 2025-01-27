import java.awt.*;
import javax.swing.*;

public class Ball {

    private int x, y, xSpeed, ySpeed, size;
    private Color color;

    public Ball(int x, int y, int xSpeed, int ySpeed, int size, Color color) {
        this.x = x;
        this.y = y;
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
        this.size = size;
        this.color = color;
    }

    public Color getColor(){

        return color;

    }

    // command + n + getter + hold shift + choose
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public int getSize() {
        return size;
    }


    ///////////
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setxSpeed(int speed) {
        this.xSpeed = speed;
    }

    public void setySpeed(int speed) {
        this.ySpeed = speed;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw(Graphics g){

        g.setColor(color);
        g.fillOval(x, y, size, size);

    }

    public void move(){

        x += xSpeed;
        y += ySpeed;

    }

    public void bounce(Arena j){

        // right wall check
        if(x >= j.getSize().getHeight() - size){

            xSpeed *= -1;

        }

        if(x <= 0){

            xSpeed *= -1;

        }

        // left wall check
        if(y >= j.getSize().getHeight() - size){

            ySpeed *= -1;

        }

        if(y <= 0){

            ySpeed *= -1;

        }

    }

}
