public class polymor{
    public static void main(String [] args){
        // example of polymorphism in java(method overloading)
        calculator c = new calculator();
        System.out.println("Addition of 2 numbers: " + c.add(10,20));
        System.out.println("Addition of 3 numbers: " + c.add(10,20,30));
        System.out.println("Addition of 2 numbers(double): " + c.add(10,20.5));  

        // example of polymorphism in java(method overriding)
        
        rectangle c1 = new rectangle();
        DoDrawingStuff(c1);

        circle c2 = new circle();
        DoDrawingStuff(c2);
    }

    // method to demonstrate polymorphism in java(method overriding)
    public static void DoDrawingStuff(shape s){
        s.shape();
    }
}

// example of polymorphism in java(method overloading)
class calculator{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(int a, double b){
        return a+b;
    }
}
// example of polymorphism in java(method overriding)
class shape{
    public void shape(){
        System.out.println("This is shape");
    }
}

class rectangle extends shape{
    @Override 
    public void shape(){
        System.out.println("This is rectangle");
    }
}

class circle extends shape{
    @Override 
    public void shape(){
        System.out.println("This is circle");
    }
}