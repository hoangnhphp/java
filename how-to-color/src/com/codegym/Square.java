package com.codegym;

import Interface.Colorable;

public class Square extends Shape implements Colorable {
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
        return width * width;
    }

    public double getPerimeter() {
        return 4 * width;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + ", area="
                + getArea()
                + " and perimeter="
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}