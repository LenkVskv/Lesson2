/**
 * Created by Greg on 31.01.2017.
 */
public final class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public  Point setX(double x){
        return new Point(x, this.y);
    }
    public Point setY(double y){
        return new Point(this.x,y);
    }
}
