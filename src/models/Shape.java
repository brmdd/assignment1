package models;

import java.util.ArrayList;

public class Shape {
    private final ArrayList<Point> points;

    // Constructor to initialize the ArrayList of points
    public Shape() {
        points = new ArrayList<>();
    }

    // Method to add a Point to the container
    public void addPoint(Point point) {
        points.add(point);
    }

    // Method to calculate the perimeter of the shape
    public double calculatePerimeter() {
        double perimeter = 0.0;
        int size = points.size();

        if (size < 2) {
            return perimeter; // Perimeter is zero if there are less than 2 points
        }

        for (int i = 0; i < size - 1; i++) {
            perimeter += points.get(i).distance(points.get(i + 1));
        }

        // Adding the distance between the last and first points to complete the shape
        perimeter += points.get(size - 1).distance(points.getFirst());

        return perimeter;
    }

    // Method to get the average length of the sides in the shape
    public double getAverageSide() {
        double perimeter = calculatePerimeter();
        int size = points.size();

        if (size < 2) {
            return 0.0; // Average side is zero if there are less than 2 points
        }

        return perimeter / size;
    }

    // Method to get the length of the longest side in the shape
    public double getLongestSide() {
        double longestSide = 0.0;
        int size = points.size();

        if (size < 2) {
            return longestSide; // Longest side is zero if there are less than 2 points
        }

        for (int i = 0; i < size - 1; i++) {
            double distance = points.get(i).distance(points.get(i + 1));
            if (distance > longestSide) {
                longestSide = distance;
            }
        }

        // Check distance between the last and first points to find the longest side
        double distance = points.get(size - 1).distance(points.getFirst());
        if (distance > longestSide) {
            longestSide = distance;
        }

        return longestSide;
    }
}
