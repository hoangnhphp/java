package com.codegym;

import Interface.Resizeable;

public class Circle extends Shape implements Resizeable {

    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.round(radius * radius * Math.PI);
    }

    public double getPerimeter() {
        return Math.round(2 * radius * Math.PI);
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", area="
                + getArea()
                + ", perimeter="
                + getPerimeter()
                + " and which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        Math.round(radius *= (1 + percent / 100.0));
    }
}
