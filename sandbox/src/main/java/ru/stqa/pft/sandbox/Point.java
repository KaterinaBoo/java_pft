package ru.stqa.pft.sandbox;

public class Point {
    private double x;
    private double y;

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
    public double distance(Point p) {
        double xdif = p.getX() - this.x;
        double ydif = p.getY() - this.y;
        double sum = (xdif*xdif) + (ydif*ydif);

        return Math.sqrt(sum);
    }
}
