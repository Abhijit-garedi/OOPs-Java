import java.util.Scanner;

public class SwitchCalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number:");
        int firstNumber = sc.nextInt();

        System.out.println("Enter Second number:");
        int secondNumber = sc.nextInt();

        System.out.println("Enter operation to preform:");
        int Button = sc.nextInt();

        switch (Button) {
            case 1:
                System.out.println("Addition is : " + (firstNumber + secondNumber));
                break;

            case 2:
               System.out.println("Subtraction is : " + ( firstNumber - secondNumber));
               break;

            case 3:
                System.out.println("Mulitiplication is :" + ( firstNumber * secondNumber));
                break;

            case 4:
                System.out.println("Division is : " + ( firstNumber / secondNumber));
                break;

            default:
                System.out.println("Invalid buttion:");
        }
        sc.close();


        
    }
    
}

/* output
 * Enter First number:
12
Enter Second number:
13
Enter operation to preform:
1
Addition is : 25
 */
