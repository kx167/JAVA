import java.util.ArrayList;
import java.util.List;


public class javacollection{
    public static void main(String[]args){
        // arraylist implementation of list
        List<Integer> List = new ArrayList<>();
        //List Add 
        List.add(10);
        List.add(20);
        List.add(30);

        System.out.println(List);

        //List Remove
        List.remove(2);
        System.out.println(List);


        //add all

        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(101);
        List2.add(102);
        List2.add(103);
        List2.add(104);
        List2.add(105);
        List2.addAll(List);

        System.out.println(List2);

        List2.removeAll(List);
        System.out.println(List2);

        System.out.println(List.size());
        System.out.println(List2.size());

        System.out.println("print List 2" +List2);

        List2.clear();
        System.out.println("after clearing"+List2);

       
        
    }
}