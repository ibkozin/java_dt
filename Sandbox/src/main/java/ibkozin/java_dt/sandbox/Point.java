package ibkozin.java_dt.sandbox;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance (Point p){
        double distance = Math.sqrt((this.x-p.x) * (this.x-p.x) + (this.y-p.y)*(this.y-p.y));
        return distance;
    }
    public static void main(String[] args) throws Exception{
        /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x1=Double.parseDouble(reader.readLine());
        double y1=Double.parseDouble(reader.readLine());
        double x2=Double.parseDouble(reader.readLine());
        double y2=Double.parseDouble(reader.readLine());
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        System.out.println(p1.distance(p2)); */


    }

}


