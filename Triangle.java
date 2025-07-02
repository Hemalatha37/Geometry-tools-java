import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double base;
        double height;
        
        

        System.out.print("Enter value of base: ");
        base = scanner.nextDouble();

        System.out.print("Enter value of b: ");
        height = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));

        double area = 0.5 * base * height;
        System.out.println("The hypotenuse is " + Math.ceil(hypotenuse) + " cm");
        System.out.println("The Area of triangle: " + area );

        scanner.close();
    }
}


