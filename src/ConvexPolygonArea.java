import java.util.Scanner;

public class ConvexPolygonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of points in the convex polygon: ");
        int numPoints = input.nextInt();

        if (numPoints < 3) {
            System.out.println("A convex polygon must have at least 3 points.");
            return;
        }

        double[] xCoordinates = new double[numPoints];
        double[] yCoordinates = new double[numPoints];

        System.out.println("Enter the points clockwise:");
        for (int i = 0; i < numPoints; i++) {
            System.out.print("Enter x-coordinate for point " + (i + 1) + ": ");
            xCoordinates[i] = input.nextDouble();

            System.out.print("Enter y-coordinate for point " + (i + 1) + ": ");
            yCoordinates[i] = input.nextDouble();
        }

        double area = calculatePolygonArea(xCoordinates, yCoordinates);

        System.out.println("The area of the convex polygon is: " + area);
    }

    public static double calculatePolygonArea(double[] x, double[] y) {
        int numPoints = x.length;
        double area = 0;

        for (int i = 0; i < numPoints; i++) {
            int next = (i + 1) % numPoints;
            area += (x[i] * y[next]) - (x[next] * y[i]);
        }

        return Math.abs(area / 2);
    }
}
