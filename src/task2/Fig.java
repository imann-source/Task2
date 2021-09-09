package task2;

import java.util.ArrayList;
import java.util.List;

public class Fig {
    Point p1, p2, p3, p4;

    Fig(Point pp1, Point pp2, Point pp3, Point pp4) {
        p1 = pp1;
        p2 = pp2;
        p3 = pp3;
        p4 = pp4;
    }

    int positionOfPoint(Point m) {
        List<Line> lines = new ArrayList<Line>();
        lines.add(new Line(p1.x, p1.y, p2.x, p2.y));
        lines.add(new Line(p2.x, p2.y, p3.x, p3.y));
        lines.add(new Line(p3.x, p3.y, p4.x, p4.y));
        lines.add(new Line(p4.x, p4.y, p1.x, p1.y));

        if (
                (p1.x == m.x && p1.y == m.y) ||
                        (p2.x == m.x && p2.y == m.y) ||
                        (p3.x == m.x && p3.y == m.y) ||
                        (p4.x == m.x && p4.y == m.y)
        ) {
            return 0;
        } else if (lines.get(0).onTheLine(m) ||
                lines.get(1).onTheLine(m) ||
                lines.get(2).onTheLine(m) ||
                lines.get(3).onTheLine(m)
        ) {
            return 1;
        } else if (lines.get(0).pointPosition(m) < 0 &&
                lines.get(1).pointPosition(m) < 0 &&
                lines.get(2).pointPosition(m) < 0 &&
                lines.get(3).pointPosition(m) < 0) {
            return 2;
        }

        return 3;
    }
}
