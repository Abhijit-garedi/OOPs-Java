public class Increment {
    public static void main(String[] args) {
        //int a = 5;
        //int b = a++;
        //int c = ++a;
       
        // Post-increment
        int a = 5;
        System.out.println("Value of a after post-increment: " + a);

        // post-increment ( a++)
        int b = a++;
        System.out.println("Value of b (post-increment): " + b);

        //pre-increment (++a)
        int c = ++a;
        System.out.println("Value of c (pre-increment): " + c);
    }
    
}
