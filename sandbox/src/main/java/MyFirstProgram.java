public class MyFirstProgram {

public static void main(String[] args) {

    System.out.println("Hello, world!");

    Point p1 = new Point(1, 1);
    Point p2 = new Point(3, 3);
    System.out.println(distance(p1, p2));
}
    public static double distance(Point p1, Point p2) {
        double xdif = p2.getX() - p1.getX();
        double ydif = p2.getY() - p1.getY();
        double sum = (xdif*xdif) + (ydif*ydif);

        return Math.sqrt(sum);
    }
}