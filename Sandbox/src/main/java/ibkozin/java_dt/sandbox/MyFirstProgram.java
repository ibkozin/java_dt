package ibkozin.java_dt.sandbox;

public class MyFirstProgram {

public static void main(String[] args) {
    hello("USA");
    hello("RUSSIA");
    hello("CANADA");
    Square s = new Square(5);
    System.out.println("площадь квадрата со стороной " + s.l + " = " +s.area());
    Rectangle r = new Rectangle(4, 7);
    System.out.println("площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

}

    public static void hello (String somebody){
    System.out.println("Hello, " + somebody + "!");
}
    /* public static double area(Square s){
    return s.l*s.l;
    }
    public static double area(Rectangle r){
    return r.a*r.b;
    }
    */
}