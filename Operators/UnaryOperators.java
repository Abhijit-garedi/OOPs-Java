import java.util.Scanner;

public class UnaryOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();

        System.out.println("Pre-Increment ++a: " + (++a)); // pre-increment
        System.out.println("Post-Increment a--: " + (a--)); // post-decrement
        System.out.println("a after a--: " + a);

        sc.close();
    }
}


/* Enter a number:
1
Pre-Increment ++a: 2
Post-Increment a--: 2
a after a--: 1 */
