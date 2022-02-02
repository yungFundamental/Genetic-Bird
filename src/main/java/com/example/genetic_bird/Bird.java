package com.example.genetic_bird;
// this class is part of the MODEL
//import javafx.event.EventHandler;
import java.util.EventListener;


public class Bird
{
    private double y;           // current y
    private final double x;     // x coordinate (doesnt change)
    private double velocity;    // current y axis velocity
    // the "hit box" of the bird is a rectangle:
    private final double height;
    private final double width;

    public Bird(double _x, double _y, double _height, double _width)
    {
        x = _x;
        y = _y;
        width = _width;
        height = _height;
        velocity = 0;
    }

    public double getY() {
        return y;
    }

    public double getVelocity() {
        return velocity;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void accelerate(double a)
    {
        // v(t) = a*t +v0
        // v(t) = v(t-1) + a
        velocity += a;
    }

    public void updateLocation()
    {
        //y = v*t +y0
        //y(t) = y(t-1) + v
        y += velocity;
    }

    public synchronized void jump(double vel)
    {
        // aka set velocity
        velocity = vel;
    }


    public boolean collisionCheck(PipePair p)
    {
        // X AXIS:
        // compare left side of pipes and right side of bird
        if (p.getX() > this.width + this.x)
            return false;

        // compare right side of pipes and left side of bird
        if (p.getX() + p.getWidth() > this.x)
            return false;

        // Y AXIS:
        // compare top of lower pipe and bottom of bird
        if (p.getLowerPipe().getY() < this.y + this.height)
            return true;

        // compare bottom of upper pipe and top of bird
        // (if  the following condition is met the objects collided, else they did not.)
        return p.getUpperPipe().getY() + p.getUpperPipe().getHeight() > this.y;
    }

}
