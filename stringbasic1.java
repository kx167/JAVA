import java.util.Scanner;
public class stringbasic1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = "kishan";
        String str2 = new String("vinzuda");
        System.out.println(str1 + " " + str2);
        System.out.println(str1.length());
        System.out.println(str1.charAt(3));
        System.out.println("Enter a string: ");
        String xy=sc.nextLine();
        System.out.println(xy);
    }
}