// file name is cons.java in folder Constructor
 class Student {
    int rollNo;
    String name;

    // Parameterized Constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Copy Constructor
    Student(Student s) {
        rollNo = s.rollNo;
        name = s.name;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}

public class Student {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Abhijit"); // Original Object
        Student s2 = new Student(s1); // Copy Object

        s1.display();
        s2.display();
    }
}


/* output 
hari
20
 */
