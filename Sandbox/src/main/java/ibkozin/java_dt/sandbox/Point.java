package ibkozin.java_dt.sandbox;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Point {
    double p1;
    double p2;

    public Point(double p1, double p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x1=Double.parseDouble(reader.readLine());
        double y1=Double.parseDouble(reader.readLine());
        Point point=new Point(x1,y1);

    }

}


