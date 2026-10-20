import java.util.Scanner;
public class arrlec2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int x = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int y = scanner.nextInt();
        int[][] matrix = new int[x][y];

        //int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Input matrix elements
        System.out.println("Enter " + (x * y) + " elements for the matrix:");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("Element at position (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        // Print matrix elements
        System.out.println("Matrix elements are:");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
