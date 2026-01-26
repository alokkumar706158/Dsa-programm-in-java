import java.util.Scanner;
public class Sum_Avrage_arry {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" elemnt in array");
        int arr[]=new int[n];
        int sum=0;
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            sum =sum+arr[i];
        }
        int average=sum/n;
        System.out.println("Sum of all array element is "+sum);
        System.out.println("Avarege of all element "+average); 

    }
}
