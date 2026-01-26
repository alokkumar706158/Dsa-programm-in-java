import java.util.Scanner;
public class powerOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base no");
        int a=sc.nextInt();
        System.out.println("Enter power");
        int n=sc.nextInt();
        int result=1;
        for(int i=1; i<=n; i++){
            result=result*a;
        }
        System.out.println(result);
    }
}
