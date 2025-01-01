import java.util.Scanner;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Logical operator examples
        System.out.println("\nLogical AND : " + (a > 0 && b > 0));
        System.out.println("Logical OR : " + (a > 0 || b > 0));
        System.out.println("Logical NOT : " + !(a > b));

        scanner.close();
    }
}

/* OUTPUT
Enter first number: 2
Enter second number: 3

Logical AND : true
Logical OR : true
Logical NOT : true
 */