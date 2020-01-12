package ResizeableTask;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(6.0,"red",false);
        Rectangle r = new Rectangle(6,6,"blue",true);
        Square s = new Square(6,"yellow",true);
        System.out.println("Before: ");
        System.out.println(c);
        System.out.println(r);
        System.out.println(s);
        c.reScale(2);
        r.reScale(3);
        s.reScale(4);
        System.out.println("After Resize: ");
        System.out.println(c);
        System.out.println(r);
        System.out.println(s);
    }
}
