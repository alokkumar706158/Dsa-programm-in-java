import java.util.Scanner;
public class LCM {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no");
        int a=sc.nextInt();
        System.out.println("Enter 2nd no");

        int b=sc.nextInt();
        int temp=0;
        int x=a;
        int y=b;
        while(b!=0){
            temp =b;
            b=a%b;
            a=temp;

        }
        int hcf=a;
        int lcm=(x*y)/hcf;
        System.out.println("Lcm is "+lcm );

    }
}
