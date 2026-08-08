import java.util.Scanner;
public class table{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the table");
        int n=sc.nextInt();
        int []arr=new int[10];
        for(int i=0; i<10; i++){
            arr[i] = n*(i+1);
            // logic   i = 1
            // arr[1] = 5 * (1 + 1)
            // arr[1] = 10

        }
        for(int i=0; i<10; i++){
            System.out.println(n+" * "+(i+1)+" = "+arr[i]);
        }
    
    }
}