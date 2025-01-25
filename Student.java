// A simple java program demonstrating the use of a constructor

public class Student {
    // instance variables (attributes of the Student class)
    String name;
    int age;

    // Constructor: A special method used to initialize the object
    // It has the same name as the class and does not have a return type
    public Student(String studentName, int studentAge) {
        name = studentName; // Assigning the parameter value to the instance variable
        age = studentAge;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Creating an object of the Student class using the constructor
        Student student1 = new Student("Abhijit", 21);

        // Calling the method to display the details of the student
        student1.displayDetails();
    }
}

/*OUTPUT
Student Name: Abhijit
Student Age: 21
 */