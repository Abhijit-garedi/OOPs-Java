package Constructor;

public class cons {
    String name;
    int age;

    // Constructor
    cons() {
        name = "hari"; 
        age = 20;
    }
}

class Constr { 
    public static void main(String args[]) {
        cons s = new cons(); 
        System.out.println(s.name);
        System.out.println(s.age);
    }
}

/* output 
hari
20
 */
