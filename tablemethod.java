public class tablemethod {

    static void printtable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }   
    }
    static void sum(int a, int b){
        System.out.println(a+b);
    }
    static void compare(int x, int y){
        if(x>y){
            System.out.println(x + " is greater than " + y);
        }
        else if(x<y){
            System.out.println(x + " is less than " + y);
        }
        else{
            System.out.println(x + " is equal to " + y);
        }
    }

    public static void main(String[] args){
        System.out.println("2 Table");
        printtable(2);
        System.out.println("3 Table");
        printtable(3);

        sum(10, 20);
        compare(10, 20);
        

    }
}