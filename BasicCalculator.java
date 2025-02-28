import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.printf("Addition: %.2f, Subtraction: %.2f, Multiplication: %.2f, Division: %.2f\n", num1 + num2, num1 - num2, num1 * num2, num1 / num2);
    }
}
