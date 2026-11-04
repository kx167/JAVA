class student{
    String name;
    int age;
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class oop{
    public static void main(String []args){
        System.out.println("hello oop");
        student s1 = new student();
        s1.setName("Alice");
        s1.setAge(20);
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}