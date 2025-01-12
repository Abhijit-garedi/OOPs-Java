/* program to find sum of number */
import java.util.*;
public class ForWhile12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i=0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

/* output 5
 * 15
 */