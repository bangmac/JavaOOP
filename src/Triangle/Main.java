package Triangle;
// update
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 2, 3);
        System.out.println(triangle.toString());

        Triangle triangle1 = new Triangle(3, 4, 5);
        System.out.println(triangle1.toString());
        System.out.println("Area = " + triangle1.getArea());
        System.out.println("Perimeter = " + triangle1.getPerimeter());
    }
}