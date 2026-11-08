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
        
        
/*
    LIFE CYCLE OF AN OBJECT IN JAVA

    1. OBJECT CREATION:
       - An object is created using the 'new' keyword.
       - Memory is allocated in the Heap area.
       Example:
       std s1 = new std();

    2. OBJECT INITIALIZATION:
       - Instance variables get default values.
       - Constructor is called to initialize the object.
       Example:
       std s1 = new std(1, "Kishan", 22);

    3. OBJECT USAGE:
       - We access object variables and methods using
         the object reference.
       Example:
       s1.info();
       s1.study();

    4. OBJECT ELIGIBLE FOR GARBAGE COLLECTION:
       - When an object has no reachable references,
         it becomes eligible for Garbage Collection.
       Example:
       s1 = null;

    5. GARBAGE COLLECTION:
       - JVM's Garbage Collector identifies eligible
         objects and may reclaim their memory.
       - System.gc() requests garbage collection,
         but does not guarantee immediate execution.
       Example:
       System.gc();


    IMPORTANT POINTS:

    - Objects are generally allocated in Heap memory.
    - References are used to access objects.
    - Multiple references can point to the same object.
    - An object becomes eligible for GC when it is
      no longer reachable.
    - Eligible for GC does not mean immediately deleted.
*/
/*Encapsulation */

// Encapsulation is the process of wrapping data (variables)
// and methods into a single unit (class).
// It is achieved by declaring variables as private and
// providing public getter and setter methods to access and
// modify the data.
// It is also known as Data Hiding.

    }
    
}