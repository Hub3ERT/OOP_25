public class Point {
    public double x;
    public double y;
}

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 5.0;
        p1.y = 4.0;
        System.out.println("P1: ("+p1.x+","+p1.y+")");
    }
}