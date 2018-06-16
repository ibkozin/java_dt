package ibkozin.java_dt.sandbox;

public class MyFirstProgram {

public static void main(String[] args) {
    hello("USA");
    hello("RUSSIA");
    hello("CANADA");
    double l = 5;
    System.out.println("площадь квадрата со стороной " + l + " = " +area(l));
    double a = 3;
    double b = 4;
    System.out.println("площадь прямоугольника со сторонами " + a + " и " + b + " = " +area(a, b));

}

    public static void hello (String somebody){
    System.out.println("Hello, " + somebody + "!");
}
    public static double area(double l){
    return l*l;
    }
    public static double area(double a, double b){
    return a*b;
    }
}