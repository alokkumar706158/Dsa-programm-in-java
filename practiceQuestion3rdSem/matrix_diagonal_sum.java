import java.util.*;
public class matrix_diagonal_sum {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    int[][] nums = new int[n][n];
 
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            nums[i][j]=sc.nextInt();
        }
    }
    int sum=0; 
    int end=n-1;
    int start =0;
    for(int i=0; i<n; i++){
        sum +=nums[i][start]+nums[i][end];

        if(start == end){
            sum -= nums[i][end];
        }
        start++;
        end--;

    }
    System.out.println(sum);

    }
    
}
