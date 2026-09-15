import java.util.Scanner;

public class Task6_FundamentalsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("        JAVA FUNDAMENTALS: CASTING PRACTICE       ");
        System.out.println("==================================================");

        System.out.print("Enter an integer value: ");
        int userInt = scanner.nextInt();

        System.out.print("Enter a float value: ");
        float userFloat = scanner.nextFloat();

        System.out.print("Enter a double value: ");
        double userDouble = scanner.nextDouble();

        System.out.println("\n--------------------------------------------------");
        System.out.println("            ENTERED VALUES & TYPES                ");
        System.out.println("--------------------------------------------------");
        System.out.println("userInt    = " + userInt + "  [Data Type: int]");
        System.out.println("userFloat  = " + userFloat + "  [Data Type: float]");
        System.out.println("userDouble = " + userDouble + "  [Data Type: double]");

        System.out.println("\n--------------------------------------------------");
        System.out.println("      1. IMPLICIT CASTING (int -> double)         ");
        System.out.println("--------------------------------------------------");
        System.out.println("Value BEFORE casting (int): " + userInt);
        double implicitDouble = userInt;
        System.out.println("Value AFTER casting (double): " + implicitDouble);

        System.out.println("\n--------------------------------------------------");
        System.out.println("      2. EXPLICIT CASTING (double -> int)         ");
        System.out.println("--------------------------------------------------");
        System.out.println("Value BEFORE casting (double): " + userDouble);
        int explicitIntFromDouble = (int) userDouble;
        System.out.println("Value AFTER casting (int): " + explicitIntFromDouble);

        System.out.println("\n--------------------------------------------------");
        System.out.println("      3. EXPLICIT CASTING (float -> int)          ");
        System.out.println("--------------------------------------------------");
        System.out.println("Value BEFORE casting (float): " + userFloat);
        int explicitIntFromFloat = (int) userFloat;
        System.out.println("Value AFTER casting (int): " + explicitIntFromFloat);

        System.out.println("==================================================");

        System.out.println("Type casting in Java is used when we need to convert one data type into another. It is commonly used while doing calculations with different types of values. We also use it when taking input or converting data from one form to another. Type casting is useful when we want to store a value of one type in a variable of another type. It helps us handle different data types properly in a Java program.");
    }
}
