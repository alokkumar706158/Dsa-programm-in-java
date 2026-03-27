import java.util.Scanner;
public class max_min_find {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter the element in array");
        int []arr=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
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
        System.out.println(max+" is maximumn no");
        System.out.println(min+" is minimum no");

    }
}
