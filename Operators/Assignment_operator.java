public class Assignment_operator {
    public static void main(String[] args) {
        int a = 10; 
        System.out.println("Value of a: " + a);

        a += 5;
        System.out.println("After a += 5, a = " + a);

        a -= 2; 
        System.out.println("After a -= 2, a = " + a);
    }
}


/*OUTPUT:
 Value of a: 10
After a += 5, a = 15
After a -= 2, a = 13
 */