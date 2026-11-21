public class abstraction{
    public static void main(String[]args){
        //birds b = new sparrow();
        dothing(new sparrow());

        //b = new crow();
       dothing(new crow());

       
        
    }

    public static void dothing(birds b){
        b.fly();
        b.eat();
    }
}

abstract class birds{
    abstract void fly();
    abstract void eat();
}

class sparrow extends birds{
    void fly(){
          System.out.println("sparrow Is Flying");
    }

    void eat(){
        System.out.println("sparrow are eating");
    }
}

class crow extends birds{
    void fly(){
          System.out.println("crow Is Flying");
    }

    void eat(){
        System.out.println("crow are eating");
    }
}