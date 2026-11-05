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

/* created object with parameterized constructor */
 std s2 = new std(2, "vinzuda",23);
        s2.info();
        s2.bunk();
        s2.study();
        s2.sleep();     
        
 /* created object with copy constructor */
    std s3 = new std(s2);
        s3.info();
        s3.bunk();
        s3.study();
        s3.sleep();

    }
    
}