public class Fan {
    private int speed = this.SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    final int SLOW = 1;
    final int NORMAL = 2;
    final int FAST = 3;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", " + (isOn()?"fan is on":"fan is off") +
                '}';
    }
}
