// Define a class
class Cal {
    // Data members (variables)
    int num1;
    int num2;

    // Method to add two numbers
    int add() {
        return num1 + num2;
    }
}

// Main class
public class AdditionDemo {
    public static void main(String[] args) {
        // Creating an object of the Addition class
        Cal obj = new Cal();

        // Assigning values
        obj.num1 = 10;
        obj.num2 = 20;

        // Calling method and displaying the result
        System.out.println("Sum: " + obj.add());
    }
}
