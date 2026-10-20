class methw4{
    static void max(double a, double b){
        if(a>b){
            System.out.println(a+"is larger");
        }
        else if(b>a){
            System.out.println(b+"is larger");
        }
        else{
            System.out.println("both are equal");
        }
    }
    public static void main(String args[]){
        max(30,90);
        max(16,7);
        max(30,2006);
        max(29,16);
        max(7,7);
        max(-100,0);
        max(-100,-100.5);
    }
}