import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // user input
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
       
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

      
        scanner.close();
    }
}

/* output
Enter a number: 12
12 is even.
 */
