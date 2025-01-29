package Constructor;

public class cons {
    String name;
    int age;

    // Constructor
    cons() {
        name = "hari"; // String should be in double quotes
        age = 20;
    }
}

class Constr { // Corrected class declaration
    public static void main(String args[]) {
        cons s = new cons(); // Corrected object instantiation
        System.out.println(s.name);
        System.out.println(s.age);
    }
}

/* output 
hari
20
 */
