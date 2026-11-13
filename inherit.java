public class inherit{
    public static void main(String[] args){
        

        owner myowner = new owner();
        myowner.name="tommy";
        myowner.breed="labrador";
        myowner.ownername="john";
        System.out.println("my dog name is:" + myowner.name + " and breed is:" + myowner.breed + 
        " and owner name is:" + myowner.ownername);
        dog.vegetarian();
        
    }
}

class animal{
    String name;

    public static void eat(){
        System.out.println("Animal is eating");
    }
    public static void vegetarian(){
        System.out.println("Animal is vegetarian");
    }
    public static void nonvegetarian(){
        System.out.println("Animal is non vegetarian");
    }

}
class dog extends animal{
    String breed;    
}

class owner extends dog{
    String ownername;
}