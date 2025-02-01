// program to find the factorial of enter value 
import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the new value:");
        int n = s.nextInt();
        System.out.println("Recursive Call");

        int f = rfact(n);
        System.out.println("Factorial given no is : " + f);
        System.out.println("Non - Recursive");

        f = ifact(n);
        System.out.println(" " + f);

    }

    static int rfact(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*rfact(n-1);
        }
    }
    static int ifact(int n){
        int i, f=1;
        for(i=1; i<=n; i++){
            f = f*i;
        }
            return f;

        }
    }

