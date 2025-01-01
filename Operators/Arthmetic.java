
import java.util.Scanner;

class Arthmetic
{
    public static void main(String args[])
    {
        int a,b;
        System.out.print("Enter two numbers...");
        Scanner obj=new Scanner(System.in);

        a= obj.nextInt();
        b= obj.nextInt();
        System.out.print("\nAddition"+(a+b));
        System.out.print("\nSubtraction"+(a-b));
        System.out.print("\nMultiplication"+(a*b));
        System.out.print("\nDivision"+(a/b));
        System.out.print("\nRemainder"+(a%b));
    }
}