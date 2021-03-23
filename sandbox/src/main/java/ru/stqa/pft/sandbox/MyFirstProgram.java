package ru.stqa.pft.sandbox;

public class MyFirstProgram {

public static void main(String[] args) {

    System.out.println("Hello, world!");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));

    Point p1 = new Point(1, 1);
    Point p2 = new Point(3, 3);
    System.out.println(distance(p1, p2));

    System.out.println(p1.distance(p2));
}
    public static double area(Square s) {
        return s.l * s.l;
    }

    public static double area(Rectangle r) {
        return r.a * r.b;
    }

    public static double distance(Point p1, Point p2) {
        double xdif = p2.getX() - p1.getX();
        double ydif = p2.getY() - p1.getY();
        double sum = (xdif*xdif) + (ydif*ydif);

        return Math.sqrt(sum);
    }

}