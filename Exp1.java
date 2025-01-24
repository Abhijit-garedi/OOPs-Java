import java.util.Scanner;

public class Exp1 {
    public static void main(String args[]){
        int first=0,second=1;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter n value:");

        int n=S.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("The fibonacci series is " +first);
            int next=first+second;
            first=second;
            second=next;
        }
    }
    
}
/* OUTPUT
Enter n value:
5
The fibonacci series is 0
The fibonacci series is 1
The fibonacci series is 1
The fibonacci series is 2
The fibonacci series is 3 */