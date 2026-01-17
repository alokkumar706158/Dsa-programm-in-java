import java.util.Scanner;
public class countDigitNo {
    public static void main(String[] args) {
        System.out.println("Enter a no");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        
        if(n==0){
            count=1;
        }
        else{
            while(n !=0){
                n=n/10;
                count++;
            }
        }
        System.out.println(count +"is total digit in given no");
        

    }
}
