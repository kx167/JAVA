package array;
import java.util.Scanner;
public class arrlec1 {
    static int a[] = new int[5];
    static int n = a.length;
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n-1;i++){
            System.out.println("Enter the value of a["+i+"]");
            //arrlec1 obj = new arrlec1();
            a[i] = sc.nextInt();
        }
        for(int i : a){
            System.out.println(i);
        }
        sc.close();
     }
     
}
