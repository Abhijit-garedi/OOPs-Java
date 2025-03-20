package General;
public class Bitwise_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;

        // Bitwise 
        
        //AND
        c = a & b;
        System.out.println("a & b = " +c);
         
        //OR
        c = a | b;
        System.out.println("a | b = " +c);

        //XOR
        c = a ^ b;
        System.out.println(" a ^ b " +c);

        //NOT or Complement
        c = ~a;
        System.out.println("~a = " + c);

        //Left Shift
        c = a << 2;
        System.out.println("a << 2 = " + c);

        //Signed Right Shift
        c = a >> 2;
        System.out.println("a >> 2 = " + c);

        //Unsigned Right Shift
        c = a >>> 2;
        System.out.println("a >>> 2 = " + c);

        
    }
}/* OUTPUT

a & b = 0
a | b = 30
 a ^ b 30
~a = -11
a << 2 = 40
a >> 2 = 2
a >>> 2 = 2 */


