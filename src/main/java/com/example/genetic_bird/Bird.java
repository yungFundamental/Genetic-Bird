package com.example.genetic_bird;
// this class is part of the MODEL
//import javafx.event.EventHandler;
import java.util.EventListener;


public class Bird
{
    private double y;           // current y
    private double velocity;    // current y axis velocity
    // the "hit box" of the bird is a rectangle:
    private double height;
    private double width;

    public Bird(double _y, double _height, double _width)
    {
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

    public void jump(double vel)
    {
        // aka set velocity
        velocity = vel;
    }


}
