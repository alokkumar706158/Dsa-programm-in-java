import java.util.Scanner;
public class findFrequen
{
	public static void main(String[] args) {
		System.out.println("Enter the size of an element");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		System.out.println("Enter Target element");
		int target = sc.nextInt();
		int count=0;
		
		for(int i=0; i<n; i++){
		    if(arr[i] == target){
		        count++;
		    }
		}
		System.out.println(count);
	}
}