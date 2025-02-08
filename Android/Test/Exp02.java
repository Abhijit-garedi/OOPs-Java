import java.util.Scanner;

class Exp02 {
    public static void main(String args[]){
        int first = 0, second=1;
        Scanner s = new Scanner(System.in);
        System.out.println("enter n value:");

        int n = s.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println("the fibonacci series is "+ first);
            int next = first + second;
            first = second;
            second = next; 

    }
    s.close();
}
}

