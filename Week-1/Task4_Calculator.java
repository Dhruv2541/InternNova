import java.util.Scanner;

public class Task4_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter 1st number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter 2nd number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double remainder = num1 % num2;

        System.out.printf("Addition (%.2f + %.2f) = %.2f%n", num1, num2, sum);
        System.out.printf("Subtraction (%.2f - %.2f) = %.2f%n", num1, num2, difference);
        System.out.printf("Multiplication (%.2f * %.2f) = %.2f%n", num1, num2, product);

        if (num2 == 0) {
            System.out.println("Division (num1 / num2) : Result is " + quotient);
            System.out.println("Modulus (num1 % num2) : Result is " + remainder);
        } else {
            System.out.printf("Division (%.2f / %.2f) = %.4f%n", num1, num2, quotient);
            System.out.printf("Modulus (%.2f %% %.2f) = %.4f%n", num1, num2, remainder);
        }
    }
}
