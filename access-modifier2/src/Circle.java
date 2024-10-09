public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

//    public double getRadius() {
//        return radius;
//    }

    protected double getRadius() {
        return radius;
    }
//
//    private double getRadius() {
//        return radius;
//    }
//
//    double getRadius() {
//        return radius;
//    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

//    protected String getColor() {
//        return color;
//    }
//
//    private String getColor() {
//        return color;
//    }
//
//    String getColor() {
//        return color;
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
