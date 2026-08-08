import java.util.Scanner;
public class UserInputLenOfArra{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of an array");
        int n=sc.nextInt();
        int []arra=new int[n];
        for(int i=0; i<n; i++){
            arra[i]=sc.nextInt();
        }
        System.out.println("Length of given arra is "+arra.length);

    }
}