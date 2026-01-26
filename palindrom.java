import java.util.Scanner;
public class palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int reverse=0;
        int temp=n;
        while(temp!=0){
            int digit=temp%10;
            reverse=reverse*10+digit;
            temp=temp/10;

        }
        if(reverse==n){
            System.out.println("It is a palindrome number");
        }
        else{
            System.out.println("Not palindorm number");
        }

    }
}
