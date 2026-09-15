import java.util.Scanner;

public class Task3_ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your College Name: ");
        String collegeName = scanner.nextLine();

        System.out.print("Enter your Branch: ");
        String branch = scanner.nextLine();

        System.out.print("Enter your City: ");
        String city = scanner.nextLine();

        System.out.printf("Your name is %s%n", fullName);
        System.out.printf("You are %d years old%n", age);
        System.out.printf("You are from %s%n", city);
        System.out.printf("Your college name is %s%n", collegeName);
        System.out.printf("Your branch is %s%n", branch);
    }
}
