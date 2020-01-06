package Point2Dand3D;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0,0,2,2);
        point.move();
        System.out.println(point.toString());
    }
}
