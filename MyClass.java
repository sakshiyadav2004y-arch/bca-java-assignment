// Core Java Concepts Demonstration
class Student {
    String name;
    int rollNo;

    // Constructor for Student
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

// BCAStudent class inheriting from Student
class BCAStudent extends Student {
    int semester;

    // Constructor for BCAStudent
    BCAStudent(String name, int rollNo, int semester) {
        super(name, rollNo);
        this.semester = semester;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Semester: " + semester);
    }
}

public class MyClass { // <--- YEHI CHANGE ZAROORI THA
    public static void main(String[] args) {
        // Creating an array of 3 BCAStudent objects
        BCAStudent[] students = new BCAStudent[3];
        students[0] = new BCAStudent("Sakshi", 101, 5);
        students[1] = new BCAStudent("Riya", 102, 3);
        students[2] = new BCAStudent("Aman", 103, 1);

        // Using a for loop to print all student details
        System.out.println("Details of BCA Students:");
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }

        // Exception Handling Example
        try {
            System.out.println("\nTrying to access invalid index:");
            System.out.println(students[3].name); // This will throw an exception
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e);
        }
        finally {
            System.out.println("Program executed successfully!");
        }
    }
}