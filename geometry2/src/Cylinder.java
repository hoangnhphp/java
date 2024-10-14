public class Cylinder extends Circle {
    private float height;

    public Cylinder() {}

    public Cylinder(float radius, String color, float height) {
        super(radius, color);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Cylinder[radius=" + getRadius() + ", color=" + getColor() +
                ", height=" + height + ", volume=" + getVolume() + "]";
    }
}
