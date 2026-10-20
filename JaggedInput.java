
import java.util.Scanner;

class JaggedInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] arr = new int[rows][];

        // Take the size of each row and its elements
        for (int i = 0; i < arr.length; i++) {

            System.out.print("Enter size of row " + i + ": ");
            int cols = sc.nextInt();

            arr[i] = new int[cols];

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter element: ");
                arr[i][j] = sc.nextInt();
            }
        }

        // Print the jagged array
        System.out.println("Jagged Array:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
