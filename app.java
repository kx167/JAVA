public class app{
    public static void main(String [] args){
        System.out.println("This is constructor");

        std s1 = new std();
        s1.name = "kishan";
        s1.id = 1;
        s1.age = 22;
        System.out.println("Student id: " + s1.id);
        System.out.println("Student name: " + s1.name);
        System.out.println("Student age: " + s1.age);
        
    }
}