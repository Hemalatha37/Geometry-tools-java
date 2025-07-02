import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius;
        double circum;
        double area;
        double diameter;

        System.out.print("Enter value of Radius: ");
        radius = scanner.nextDouble();

        circum = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        diameter = 2 * radius;

        System.out.printf("Circumference of circle is %.2f cm\n", circum);
        System.out.printf("Area of circle is %.2f cm\u00B2\n", area);
        System.out.printf("Diameter of circle is %.2f cm\n", diameter);

        scanner.close();
    }
}

