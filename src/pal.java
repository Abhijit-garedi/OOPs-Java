// to find given string is palindrome or not
import java.util.*;
class pal{
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        System.out.println("write the string:");
        String t = s.nextLine();
        int i=0, j=t.length()-1;

        while(i<j){
            if(t.charAt(i) != t.charAt(j)){
            System.out.println("the string is not palindrome" + t);
            System.exit(0);
        }
        i++;
        j--;
    }
    System.out.println("the string is palindrome:" + t);
}
}

/*output 
write the string:
madam
the string is palindrome:madam*/

