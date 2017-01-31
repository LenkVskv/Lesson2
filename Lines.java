import java.util.ArrayList;

/**
 * Created by Greg on 31.01.2017.
 */
public  class Lines {
    private  ArrayList<Line> lines = new ArrayList<>();

    public Lines(){

    }
    public void add( Line line){
     lines.add(line);
    }

    public double sumLength(){
        double sum = 0;
        for (Line l:lines) {
            sum+= l.getLength();
        }
        return sum;
    }

    public Line longestLine(){
        Line longest = lines.get(0);
        for (Line l:lines) {
            if(longest.getLength()<l.getLength()){
                longest = l;
            }
        }
        return longest;
    }



}
