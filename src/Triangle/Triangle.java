package Triangle;

public class Triangle {
    private double side1, side2, side3;

    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        if (this.isTriangle()) {
            double p = (getSide1() + getSide2() + getSide3()) / 2;
            return Math.sqrt(p * (p - getSide1()) * (p - getSide2()) * (p - getSide3()));
        }
        return -1;
    }

    public double getPerimeter() {
        if (this.isTriangle()) {
            return getSide1() + getSide2() + getSide3();
        }
        return -1;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        if (this.isTriangle())
            return "Triangle{" +
                    "side1 = " + side1 +
                    ", side2 = " + side2 +
                    ", side3 = " + side3 +
                    '}';
        return "not a triangle";
    }

    public boolean isTriangle() {
        if (getSide1() + getSide2() <= getSide3() || getSide2() + getSide3() <= getSide1() || getSide3() + getSide1() <= getSide2())
            return false;
        return true;
    }
}