package Constructor;

public class Para {
    String name;
    int age;

    // Parameterized Constructor
    Para(String abc, int a) {
        name = abc;
        age = a;
    }
}

class Parameter {
    public static void main(String args[]) {
        Para s = new Para("prakash", 20); // Corrected object instantiation
        System.out.println(s.name);
        System.out.println(s.age);
    }
}

/*output
 prakash
20
 */