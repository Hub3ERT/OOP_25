public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 30.0;
        p1.y = 40.0;

        System.out.println(p1);
        System.out.println(p1.toSvg());

        p1.translate(-6, 5);
        System.out.println(p1);
        Point tr = p1.translated(6,-5);
        System.out.println(tr);
        System.out.println(p1.translated(6,-5));
    }
}
