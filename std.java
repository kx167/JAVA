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

/* Parameterize constructor */    
    public std(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
/* Method to display the student's information */
    public void info(){
        System.out.println("Student id: " + id);
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
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