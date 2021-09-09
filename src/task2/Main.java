package task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            File file1 = new File(args[0]);            //"src/task2/file1.txt"
            FileReader fr = new FileReader(file1);

            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            List<Point> points = new ArrayList<Point>();


            while (line != null) {
                String ptr1 = line.split(" ")[0];

                String ptr2 = line.split(" ")[1];
                ptr2 = ptr2.substring(0, ptr2.length() - 2);

                Point point = new Point(Double.parseDouble(ptr1), Double.parseDouble(ptr2));
                points.add(point);

                line = reader.readLine();
            }

            File file2 = new File(args[1]);         //"src/task2/file2.txt"
            FileReader fr2 = new FileReader(file2);

            BufferedReader reader2 = new BufferedReader(fr2);
            String line2 = reader2.readLine();

            List<Point> nodes = new ArrayList<Point>();

            while (line2 != null) {

                String ptr1 = line2.split(" ")[0];

                String ptr2 = line2.split(" ")[1];
                ptr2 = ptr2.substring(0, ptr2.length() - 2);

                Point node = new Point(Double.parseDouble(ptr1), Double.parseDouble(ptr2));
                nodes.add(node);

                line2 = reader2.readLine();
            }


            Fig fig = new Fig(points.get(0), points.get(1), points.get(2), points.get(3));
            for (int i = 0; i < nodes.size(); ++i) {
                System.out.println(fig.positionOfPoint(nodes.get(i)));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
