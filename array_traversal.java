import java.util.Scanner;
public class array_traversal{
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter an array");
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();          
            
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }  
        
    }
}