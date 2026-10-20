class methw6{
    static int display(int a){
        return a;
    }
    static String display(String a){
       return a;
    }
    public static void main(String args[]){
        int x = display(10);
        String y = display("hello");
        System.out.println(x);
        System.out.println(y);
        
    }
}