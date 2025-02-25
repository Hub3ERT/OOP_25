public class Point {
    public double x;
    public double y;

    @Override
    public String toString(){
        return "("+x+","+y+")";
    }

    public String toSvg(){
        return "<circle r=\""+x+"\" cx=\""+y+"\" cy=\"50\" fill=\"red\" />";
    }

    public void translate(double dx, double dy){
        x += dx;
        y += dy;
    }

    public Point translated(double dx, double dy){
        Point newPoint = new Point();
        newPoint.x = x+dx;
        newPoint.y = y+dy;
        return newPoint;
    }
}