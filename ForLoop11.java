
import java.util.Scanner;
public class ForLoop11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number to print multiplication");
        int number = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x" +i + " = " + (number * i));

        }

        scanner.close();
    }
}

/* Output
 * Enter a number to print multiplication
2
2 x1 = 2
2 x2 = 4
2 x3 = 6
2 x4 = 8
2 x5 = 10
2 x6 = 12
2 x7 = 14
2 x8 = 16
2 x9 = 18
2 x10 = 20
 */