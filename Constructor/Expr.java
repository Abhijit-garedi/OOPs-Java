/*package Constructor;



public class exp {
    String name;
    int age;
    void display() {
        System.out.println();
    }
    
}
class Expr {
    public static void main(String args[]){
        exp.name="hellow", static String name;
        exp.age=10;
    }
}*/
package Constructor;

class Exp {
    static String name;
    static int age;

    static void display() { // Static method
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Expr {
    public static void main(String args[]) {
        Exp.name = "Hello"; // Accessing static variable using class name
        Exp.age = 10;

        Exp.display(); // Calling static method using class name
    }
}

