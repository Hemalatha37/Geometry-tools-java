import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal, rate, time, interest;

        System.out.print("Enter principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        rate = scanner.nextDouble();

        System.out.print("Enter time in years: ");
        time = scanner.nextDouble();

        // Simple Interest formula
        interest = (principal * rate * time) / 100;

        System.out.printf("Simple Interest is: %.2f\n", interest);

        scanner.close();
    }
}
