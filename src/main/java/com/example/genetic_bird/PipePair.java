package com.example.genetic_bird;

/** This file describes a pair of pipes that act as an obstacle for the bird.
 * Each pair of pipes is made of two pipes, one upper one lower.
 *
 */

public class PipePair
{
    private Pipe upperPipe;
    private Pipe lowerPipe;

    private double x;


    public PipePair(double x, double gapY, double gapHeight, double width, double topY, double bottomY)
    {
        this.x = x;
        upperPipe = new Pipe(gapY-topY, width, x, topY);
        lowerPipe = new Pipe(bottomY - (gapY + gapHeight), width, x, gapY + gapHeight);
    }

    public double getX() {
        return x;
    }

    public double getHeight() {
        return lowerPipe.getBottomY() - upperPipe.getY();
    }

    public double getWidth() {
        return upperPipe.getWidth();
    }

    public Pipe getLowerPipe() {
        return new Pipe(lowerPipe);
    }

    public Pipe getUpperPipe() {
        return new Pipe(upperPipe);
    }

    public void setX(double _x) {
        this.x = _x;
        upperPipe.setX(_x);
        lowerPipe.setX(_x);
    }
}
