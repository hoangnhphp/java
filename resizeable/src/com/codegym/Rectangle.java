package com.codegym;

import Interface.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return Math.round(width * this.length);
    }

    public double getPerimeter() {
        return Math.round(2 * (width + this.length));
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + ", length="
                + getLength()
                + ", area="
                + getArea()
                + ", perimeter="
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        Math.round(width *= (1 + percent / 100.0));
        Math.round(length *= (1 + percent / 100.0));
    }
}