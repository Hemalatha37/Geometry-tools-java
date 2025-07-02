import java.util.Scanner;
public class Sphere {
    public static void calculateSphere(double radius) {

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        System.out.printf("Volume of Sphere is %.2f\n", volume);
        System.out.printf("Surface area of Sphere is %.2f", surfaceArea);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of radius: ");
        double radius = scanner.nextDouble();

        calculateSphere(radius);

        scanner.close();
    }
}