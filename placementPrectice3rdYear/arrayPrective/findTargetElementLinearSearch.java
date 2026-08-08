// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class findTargetElementLinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter element in array");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target element");
        int target=sc.nextInt();

        for (int i = 0; i < n; i++) {
    if (arr[i] == target) {
        System.out.println("Found at index " + i);
        return;
    }
}

System.out.println("Target element not found");      

    }
}