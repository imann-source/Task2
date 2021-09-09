package task2;

public class Point {
    double x, y;

    Point(double px, double py) {
        this.x = px;
        this.y = py;
    }

    @Override public String toString() {
        return this.x + " " + this.y;
    }
}
