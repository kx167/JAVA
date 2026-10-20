import java.util.Scanner;

class Human {
    private int age;
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class first {
    public static void main(String[] args) {

        Human h = new Human();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        //int Age = sc.nextInt();

        h.setAge(sc.nextInt());

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter name: ");
        h.setName(sc.nextLine());

        System.out.println("Name: " + h.getName() + ", Age: " + h.getAge());

        sc.close();
    }
}