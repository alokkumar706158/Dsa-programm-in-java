import java.util.Scanner;
import java.util.Arrays;

public class short_array_method {
    public static void main(String[] args) {
    
    
   Scanner sc=new Scanner(System.in);

    System.out.println("Enter size of array"); 
   int n=sc.nextInt();
   System.out.println("Enter element in array");
   int arr[]=new int[n];
   for(int i=0; i<n; i++){
    arr[i]=sc.nextInt();
   }
   Arrays.sort(arr);
   for(int x:arr){
    System.out.print(x+" ");
   }

}
}