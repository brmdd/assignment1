import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Adlet\\IdeaProjects\\assignment1\\src\\source"); // Replace "file_path_here" with your file path

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        sc.close(); // Close the scanner once done with reading

        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("Longest Side: " + shape.getLongestSide());
        System.out.printf("Average Side: " + shape.getAverageSide());
    }
}