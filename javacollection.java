
import java.util.*;

public class javacollection {

    public static void main(String[] args) {

        // =====================================
        // 1. ARRAYLIST IMPLEMENTATION OF LIST
        // =====================================

        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original List: " + list);


        // =====================================
        // 2. REMOVE ELEMENT
        // =====================================

        list.remove(2);  // Removes element at index 2

        System.out.println("After Removing: " + list);


        // =====================================
        // 3. ADDALL() METHOD
        // =====================================

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(101);
        list2.add(102);
        list2.add(103);
        list2.add(104);
        list2.add(105);

        list2.addAll(list);

        System.out.println("After addAll(): " + list2);


        // =====================================
        // 4. REMOVEALL() METHOD
        // =====================================

        list2.removeAll(list);

        System.out.println("After removeAll(): " + list2);


        // =====================================
        // 5. SIZE() METHOD
        // =====================================

        System.out.println("Size of List 1: " + list.size());
        System.out.println("Size of List 2: " + list2.size());


        // =====================================
        // 6. CLEAR() METHOD
        // =====================================

        list2.clear();

        System.out.println("After clear(): " + list2);


        // =====================================
        // 7. ITERATOR IMPLEMENTATION
        // =====================================

        System.out.println("\nIterating List:");

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }


        // =====================================
        // 8. GET() AND SET() METHODS
        // =====================================

        System.out.println("\nElement at Index 1: " + list.get(1));

        list.set(0, 30);
        list.set(1, 40);

        System.out.println("After set(): " + list);


        // =====================================
        // 9. TOARRAY() METHOD
        // =====================================

        Object[] arr = list.toArray();

        System.out.println("\nArray Elements:");

        for (Object obj : arr) {
            System.out.println(obj);
        }


        // =====================================
        // 10. CONTAINS() METHOD
        // =====================================

        System.out.println("\nChecking Elements:");

        System.out.println("Contains 101? " + list.contains(101));
        System.out.println("Contains 30? " + list.contains(30));
        System.out.println("Contains -30? " + list.contains(-30));


        // =====================================
        // 11. ADD MORE ELEMENTS
        // =====================================

        list.add(10);
        list.add(20);
        list.add(50);
        list.add(5);
        list.add(0);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(77);

        System.out.println("\nList Before Sorting: " + list);


        // =====================================
        // 12. ASCENDING ORDER SORTING
        // =====================================

        Collections.sort(list);

        System.out.println("Ascending Order: " + list);


        // =====================================
        // 13. DESCENDING ORDER SORTING
        // =====================================

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Descending Order: " + list);


        // =====================================
        // 14. CLONING / COPYING ARRAYLIST
        // =====================================

        ArrayList<Integer> newlist = (ArrayList<Integer>)list.clone();

        System.out.println("\nOriginal List: " + list);
        System.out.println("Copied List: " + newlist);


        // =====================================
        // 15. MODIFY COPIED LIST
        // =====================================

        newlist.add(999);

        System.out.println("\nAfter Modifying Copied List:");

        System.out.println("Original List: " + list);
        System.out.println("New List: " + newlist);

    }
}
