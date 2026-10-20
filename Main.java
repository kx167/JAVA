import java.util.Scanner;

class Student {

    // Private variables - cannot be accessed directly outside the class
    private String name;
    private int age;
    private double marks;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for marks with validation
    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Marks must be between 0 and 100!");
        }
    }

    // Getter for marks
    public double getMarks() {
        return marks;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object
        Student student = new Student();

        // Take input from user
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        System.out.print("Enter student marks: ");
        double marks = sc.nextDouble();

        // Set values using setters
        student.setName(name);
        student.setAge(age);
        student.setMarks(marks);

        // Get values using getters
        System.out.println("\n--- Student Details ---");
        System.out.println("Name  : " + student.getName());
        System.out.println("Age   : " + student.getAge());
        System.out.println("Marks : " + student.getMarks());

        sc.close();
    }
}