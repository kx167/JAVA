public class abstraction{
    public static void main(String[]args){
        
    }
}

abstract class birds{
    abstract void fly();
    abstract void eat();
}

class sparrow extends birds{
    void fly(){
          System.out.println("Bird Is Flying");
    }

    void eat(){
        System.out.println("Birds are eating");
    }
}