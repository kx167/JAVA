public class app{
    public static void main(String [] args){
        System.out.println("This is constructor");
/* created object */
        std s1 = new std();
        /* set values to object */
        s1.name = "kishan";
        s1.id = 1;
        s1.age = 22;
        /* print values of object */
        System.out.println("Student id: " + s1.id);
        System.out.println("Student name: " + s1.name);
        System.out.println("Student age: " + s1.age);
/* call methods of object */
        s1.info();
        s1.bunk();
        s1.study();
        s1.sleep();

    }
}