
import java.util.Scanner;

public class compoundI{   

    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    double principal;
    double rate;
    int n;
    int time;

    System.out.print("Enter value of principal: ");
    principal = scanner.nextDouble();
    System.out.print("Enter value of rate: ");
    rate = scanner.nextDouble();
    System.out.print("Enter value of n: ");
    n = scanner.nextInt();
    System.out.print("Enter value of time: ");
    time = scanner.nextInt();

    double area = principal * Math.pow(1 + rate /n ,n * time ) ;    
    double intrest = area - principal;

    System.out.printf("the area is %.2f\n", area);
    System.out.printf("total intrest is %.2f\n ", intrest);
  
    scanner.close();
    
    }
}