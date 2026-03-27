import java.util.*;

public class transpose_metrixx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of first matrix");
        int n = sc.nextInt();

        System.out.println("Enter size of second array");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {      // FIXED: j < m
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[m][n];        // Correct transpose size

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][i] = arr[i][j];
            }
        }

        System.out.println("Transpose Matrix:");

        for (int i = 0; i < m; i++) {          // FIXED: i < m
            for (int j = 0; j < n; j++) {      // FIXED: j < n
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
