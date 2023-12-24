package models;

public class Point {
    private final double x;
    private final double y;

    // Constructor with both parameters
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to calculate distance from current point to the destination point
    public double distance(Point dest) {
        double dx = this.x - dest.x;
        double dy = this.y - dest.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // toString method to represent the Point object as a String
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
