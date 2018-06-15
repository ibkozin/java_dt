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
    public static double distance (Point p1, Point p2){
        double distance = Math.sqrt((p1.x-p2.x) * (p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
        return distance;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x1=Double.parseDouble(reader.readLine());
        double y1=Double.parseDouble(reader.readLine());
        double x2=Double.parseDouble(reader.readLine());
        double y2=Double.parseDouble(reader.readLine());
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        System.out.println(distance(p1, p2));


    }

}


