class methw7{
    static void number(int a){
        int b = a*100;
        System.out.println("The number is: " + b);
    }
    public static void main(String args[]){
        int num = 50;
        System.out.println("Before value call the number is: " + num);
        number(num);
        System.out.println("After value call the number is: " + num);
    }
}