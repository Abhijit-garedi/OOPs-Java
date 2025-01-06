public class Ternary_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max;


        // Ternary Operator or Conditional Operator
        // to find the maximum
        max = (a > b) ? a : b;
        System.out.println("The maximum value is: " + max);

        // to check even or odd
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("a is: " + result);
    }
}
/* OUTPUT
The maximum value is: 20
a is: Even
*/
/*In the above code, we have used the ternary operator to find the 
maximum value between two numbers and to check whether the number is even or odd. */