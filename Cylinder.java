import java.util.Scanner;
public class Cylinder {
    public static void calculateCylinder(double radius, double height) {

        double volume = Math.PI * Math.pow(radius, 2) * height;
        double surfaceArea = 2 * Math.PI * radius * (height + radius);

        System.out.printf("Volume of Cylinder is %.2f\n", volume);
        System.out.printf("Surface area of Cylinder is %.2f", surfaceArea);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of radius: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter value of height: ");
        double height = scanner.nextDouble();

        calculateCylinder(radius,height);

        scanner.close();
    }
}
