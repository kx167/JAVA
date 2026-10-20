import java.util.Scanner;

class Student {

    // Private variables
    private String name;
    private int age;
    private int percentage;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Getter and Setter for percentage
    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        if (percentage >= 0 && percentage <= 100) {
            this.percentage = percentage;
        } else {
            System.out.println("Percentage must be between 0 and 100.");
        }
    }

    // Add percentage
    public void addPercentage(int marks) {
        if (marks >= 0 && marks <= 100) {

            if (percentage + marks <= 100) {
                percentage = percentage + marks;
            } else {
                System.out.println("Percentage cannot be greater than 100.");
            }

        } else {
            System.out.println("Marks must be between 0 and 100.");
        }
    }

    // Remove percentage
    public void removePercentage(int marks) {
        if (marks >= 0 && marks <= 100) {

            if (percentage - marks >= 0) {
                percentage = percentage - marks;
            } else {
                System.out.println("Percentage cannot be less than 0.");
            }

        } else {
            System.out.println("Marks must be between 0 and 100.");
        }
    }

    // Display student details
    public void display() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Percentage : " + percentage + "%");
    }
}

public class basic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        // Student details
        System.out.print("Enter name: ");
        student.setName(sc.nextLine());

        System.out.print("Enter age: ");
        student.setAge(sc.nextInt());

        // Starting percentage
        System.out.print("Enter starting percentage: ");
        student.setPercentage(sc.nextInt());

        // Add percentage
        System.out.print("Enter percentage to add: ");
        student.addPercentage(sc.nextInt());

        // Remove percentage
        System.out.print("Enter percentage to remove: ");
        student.removePercentage(sc.nextInt());

        // Display result
        student.display();

        sc.close();
    }
}