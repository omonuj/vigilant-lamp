package Practise;

public class Cylinder {
    private double radius;
    private double height;
    private static final double PI = 3.14;

    public Cylinder() {}

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius = Math.PI * radius * radius * height;
    }
    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
    }
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height must be greater than 0");
        }
    }

}
