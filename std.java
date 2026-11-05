/**
 * This is a class named std which represents a student.
 * It contains attributes for id, name, and age, and methods for studying, bunking, and sleeping.
 */
public class std{
    public int id;
    public String name;
    public int age;
/* Constructor for the std class */

    public std(){
        System.out.println("This is constructor");
    }

/* Method to simulate the student studying */
    public void study(){
        System.out.println(name + " is studying");
    }
/* Method to simulate the student bunking */
    public void bunk(){
        System.out.println(name + " is bunking");
    }
/* Method to simulate the student sleeping */
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}