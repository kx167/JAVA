public class stude{
    public static void main(String[] args){
        
        attende a1 = new attende("kishan");
        System.out.println("Attende name: " + a1.getname());
        attende a2 = new attende("amu");
        System.out.println("Attende name: "+ a2.getname());
        

        System.out.println(attende.count);


    }

}

class attende{
    private String name;
    static int count = 1;

    public attende(String name){
        this.name = name;
        count++;
    }

    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
}