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
        
    }
}