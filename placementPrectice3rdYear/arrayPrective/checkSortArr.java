
import java.util.Scanner;

public class checkSortArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count =0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]){
                count++;
            }
        }
        if(count == 0){
            System.out.println("Sorted Array");
        }
        else{
            System.out.println("Not Sorted");
        }

    }
}
