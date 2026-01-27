import java.util.Scanner;
public class twoSum {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        System.out.println("Enter element in array");

        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the value to get sum");
        int sum=sc.nextInt();    

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == sum){

                    System.out.println(arr[i] + " is first digit and " + arr[j] + " is second digit");

                }
            }
        }

    }
    
}
