/**
 * Created by Greg on 31.01.2017.
 */
public final class Line {
    private  final Point start;
    private final Point end;


    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength(){
               return Math.sqrt((start.getX() - end.getX())*(start.getX() - end.getX())+(start.getY()- end.getY())*(start.getY()- end.getY()));
    }

}
