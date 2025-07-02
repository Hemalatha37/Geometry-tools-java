import java.util.Scanner;

public class Square {

    public static void calculateSquare(double side) {
        double area = side * side;
        double perimeter = 4 * side;

        System.out.printf("Area of Square is %.2f cm²\n", area);
        System.out.printf("Perimeter of Square is %.2f cm\n", perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side length of the square: ");
        double side = scanner.nextDouble();

        calculateSquare(side);

        scanner.close();
    }
}
