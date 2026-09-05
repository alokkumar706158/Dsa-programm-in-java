
public class sell_sort
{
    static void shellSort(int []a){
        int n=a.length;

        for(int gap=n/2; gap>0; gap=gap/2){
        
        for(int i=gap; i<n; i++){
            int temp=a[i];
            int j=i;
            
            while(j>= gap && a[j-gap] >temp){
                a[j] = a[j-gap];
                j=j-gap;
            }
            a[j]=temp;
        }
        }
    }
        
    
	public static void main(String[] args) {
	            int a[] = {12,2,54,9,3};
	            shellSort(a);
	            for(int i=0; i<a.length; i++){
	                System.out.print(a[i]+ " ");
	            }

	}
}

