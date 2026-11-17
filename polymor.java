public class polymor{
    public static void main(String [] args){
        calculator c = new calculator();
        System.out.println("Addition of 2 numbers: " + c.add(10,20));
        System.out.println("Addition of 3 numbers: " + c.add(10,20,30));
        System.out.println("Addition of 2 numbers(double): " + c.add(10,20.5));   
    }
}

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