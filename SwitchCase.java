import java.util.Scanner;


public class SwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a button number");
        int button = sc.nextInt();

        switch ( button ){
            case 1:
                System.out.println("Namaste");
                break;

                case 2:
                System.out.println("Hellow");
                break;

                case 3:
                System.out.println("Hola");
                break;

                default:System.out.println("Ram Ram");
        }
    }
    
}

/* enter a button number
1
Namaste */

