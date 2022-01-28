package com.example.genetic_bird;

public class Pipe
{
    private double height;
    private double width;

    private double x;       // the x of the left side of the pipe
    private double y;       // the y of the top of the pipe

    /** Copy constructor.
     *
     * @param o Other pipe.
     */
    public Pipe(Pipe o)
    {
        this.height = o.getHeight();
        this.width = o.getWidth();
        this.x = o.getX();
        this.y = o.getY();
    }

    public Pipe(double height, double width, double x, double y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getBottomY(){
        return y+height;
    }

    public double getRightX() {
        return x + width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

}
