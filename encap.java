public class encap{


    public static void main(String[] args){

        hero h1 = new hero(1, "kishan", 22);
        System.out.println("Hero name: " + h1.GetName());
        System.out.println("Hero age: " + h1.GetAge());
        System.out.println("Hero id: " + h1.getid());

        hero h2 = new hero(h1);
        System.out.println("Hero name: " + h2.GetName());
        System.out.println("Hero age: " + h2.GetAge());
        System.out.println("Hero id: " + h2.getid());

        hero h3 = new hero();
        h3.SetName("vinzuda");
        h3.SetAge(23);
        h3.Setid(2);

        System.out.println("Hero name: " + h3.GetName());
        System.out.println("Hero age: " + h3.GetAge());
        System.out.println("Hero id: " + h3.getid());

        h1.loops(2);





    }
}

class hero{
    private String name;
    private int age;
    private int id;

    public hero(){
        System.out.println("This is default constructor");
    }

    public void SetName(String name){
        this.name = name;
    
    }

    public String GetName(){
        return name;
    }

    public void SetAge(int age){
        if(age<0){
            System.out.println("Age cannot be nagative");
        }else{
            this.age = age;
        }
        
    }
    public int GetAge(){
        return age;
    }
    
    public void Setid(int id){
        this.id = id;
    
    }
    public int getid(){
        return this.id;
    }
    public hero(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public hero(hero a){
        this.id = a.id;
        this.name = a.name;
        this.age = a.age;
    }
    private void loop(int n){
        for(int i=0; i<n; i++){
            System.out.println("This is loop");
        }
    }

    public void loops(int n){
        loop(n);
    }
}