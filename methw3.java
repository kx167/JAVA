class methw3{
    static void iseven(int a){
        if(a%2 == 0){
            System.out.println("even number");
        }
        else{
            System.out.println("not even number");
        }
    }
    public static void main(String args[]){
        iseven(10);
        iseven(15);
    }
}