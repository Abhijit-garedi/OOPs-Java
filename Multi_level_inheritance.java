
 class A{  // Parent class
    int a;
    
    A() {
        a = 10;
    }
}

// child class 
class B extends A {  
    int b;
    
    B() {
        b = 20;
    }
}

// grandchild class 
class C extends B {  
    int c;
    
    C() {
        c = 30;
    }

    // method to display sum
    void sum() {
        System.out.println("Sum is: " + (a + b + c));
    }
}

// Main Class
public class Multi_level_inheritance  {  
    public static void main(String args[]) {  
        C obj = new C();  // creating object of C class( grand child)
        obj.sum(); 
    }  
}


// Output
// sum is 60