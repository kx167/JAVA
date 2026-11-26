import java.util.ArrayList;
import java.util.Iterator;
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

       Iterator<Integer>iterator = List.iterator();
       
              
       System.out.println(iterator.hasNext());

    while (iterator.hasNext()) {
        System.out.println("Element : "+ iterator.next());
        
       }
       System.out.println(iterator.hasNext());

      System.out.println(List.get(1)); 
      List.set(0, 30);
      List.set(1, 40);
      System.out.println(List);

      Object[] arr = List.toArray();
      for(Object obj:arr){
        System.out.println(obj);
      }
 
     System.out.println(List.contains(101));  
          System.out.println(List.contains(30));
               System.out.println(List.contains(-30));  
  

        
    }
}