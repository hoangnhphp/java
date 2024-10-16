package com.codegym;

import Interface.Resizeable;

public class Square extends Shape implements Resizeable {
    private double width = 1.0;

    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }

    public Square(double width, String color, boolean filled) {
        super(color, filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return Math.round(width * width);
    }

    public double getPerimeter() {
        return Math.round(width * 4);
    }

    @Override
    public String toString() {
        return "A Square with width="
                + getWidth()
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
    }
}