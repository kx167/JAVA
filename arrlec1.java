
import java.util.Scanner;

class arrlec1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int n = arr.length;
        int answer = 1;
        int max = arr[0];
        int min = arr[0];

        // Input array elements
        System.out.println("Enter 5 elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array elements
        System.out.println("Array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        // Calculate multiplication
        for (int i = 0; i < n; i++) {
            answer = answer * arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("Multiplication of array elements is: " + answer);
        System.out.println("Maximum element in the array is: " + max  );

        System.out.println("Minimum element in the array is: " + min);

        sc.close();
    }
}
