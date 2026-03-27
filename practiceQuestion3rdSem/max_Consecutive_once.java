import java.util.Scanner;
public class max_Consecutive_once {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        System.out.println("Enter an Element in an array");
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }  
        int count=0;
        int max_count=0;
        for(int i=0; i<n; i++){
            if(arr[i]==1){
                count++;
                if(count>max_count){
                    max_count=count;
                }
            }
            else{
                count=0;
            }
        }
        System.out.println("max_consecutive_once in given array is ="+max_count);
    
    }
} 
