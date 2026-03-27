import java.util.*;
public class transpose_metri{            //867
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first matrix");
        int n=sc.nextInt();

        System.out.println("Enter size of second array");
        int m=sc.nextInt();


        //traverse array
         int [][]arr=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int [][]result=new int[m][n];
 
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                result[j][i]=arr[i][j];
            }
        }
         System.out.println("Transpose Matrix:");

         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}