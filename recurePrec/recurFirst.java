
public class recurFirst {
    
    public static void main(String[] args) {
        sum(5);  
    }
public static void sum(int n){
        if(n==0) return;
        System.out.println(n);
        sum(n-1);
    }




}
