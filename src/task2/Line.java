package task2;

public class Line {
    Point p1, p2;
    double A, B, C;

    Line(double x1, double y1, double x2, double y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);

        A = p1.y - p2.y;
        B = p2.x - p1.x;
        C = -A * p1.x - B * p1.y;
    }

    double pointPosition(Point m) {
        return A * m.x + B * m.y + C;
    }

    double findMinX() {
        return Math.min(p1.x, p2.x);
    }

    double findMaxX() {
        return Math.max(p1.x, p2.x);
    }

    double findMinY() {
        return Math.min(p1.y, p2.y);
    }

    double findMaxY() {
        return Math.max(p1.y, p2.y);
    }

    boolean onTheLine(Point m) {
        return ( pointPosition(m) == 0 &&
                (m.x >= this.findMinX() && m.x <= this.findMaxX()) &&
                (m.y >= this.findMinY() && m.y <= this.findMaxY()));
    }


    @Override public String toString() {
        return "[ " + this.p1 + "; " + this.p2 + " ]";
    }
    }

