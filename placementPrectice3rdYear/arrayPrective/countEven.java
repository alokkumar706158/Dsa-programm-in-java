// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class countEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter element in array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int count=0;

        for(int i=0; i<n; i++){
            if(arr[i] % 2 ==0){
                count++;
            }
        }
            System.out.println(count);

    }
}