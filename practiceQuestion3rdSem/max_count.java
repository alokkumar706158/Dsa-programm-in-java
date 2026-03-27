
import java.util.Scanner;
public class max_count {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of an array");
       int n=sc.nextInt();
       System.out.println("Enter elemnt of height in array");   

       int height[]=new int[n];
       for(int i=0; i<n; i++){
        height[i]=sc.nextInt();
       }
       int lp=0;
       int rp=n-1;
       int max_water=0;

       while(lp<rp){
        int h=Math.min(height[lp], height[rp]);
        int w=rp-lp;
        int area=h*w;
        
        if(area>max_water){
            max_water=area;
        }
        if(height[lp]<height[rp]){
            lp++;
        }
        else{
            rp--;
        }
       }
       System.out.println("Max_water in a container ="+max_water);  

      
        }
}
