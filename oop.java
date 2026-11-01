class Student{
    String name;
    int age;
    String gender;

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
public class oop{
    
    public static void main(String[] args){
       System.out.println("oops basic");
       /* class & object */

       Student s1 = new Student();
         s1.name = "Kishan";
            s1.age = 23;
            s1.gender = "Male";
            s1.displayInfo();


    }
}