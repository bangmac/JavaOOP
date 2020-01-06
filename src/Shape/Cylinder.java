package Shape;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height = 1;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, boolean filled, double radius, double height) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * getHeight();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
