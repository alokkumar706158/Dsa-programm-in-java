import java.util.Scanner;
public class Max_Min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        
        int n=sc.nextInt();

        System.out.println("Enter an array input");
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();}

        int max=arr[0];
        int min=arr[0];
        for(int i=0; i<n; i++){
          if(max<arr[i]){
            max=arr[i];
          }
          if(min>arr[i]){
            min=arr[i];
          }
        }
        System.out.println("maximum no in array is "+max);
                System.out.println("minimum no in array is "+min);

    
    }
}
