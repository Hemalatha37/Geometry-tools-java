
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length;
        double width;
        double area;
        double perimeter;

        System.out.print("Enter value of length: ");
        length = scanner.nextDouble();
       
        System.out.print("Enter value of width: ");
        width = scanner.nextDouble();
       
        area = length * width;
        perimeter = 2 * (length + width);

        System.out.printf("Area of Rectangle is %.2f cm\u00B2\n", area);
        System.out.printf("Perimeter of Rectangle is %.2f cm\n", perimeter);

        scanner.close();
    }
}

