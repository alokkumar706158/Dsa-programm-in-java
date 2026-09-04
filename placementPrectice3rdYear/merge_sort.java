
public class merge_sort{
    
    //a = {10,20,30,40,11,25}
    static void merge(int []a, int p, int q, int r){
        //step 1
        int n1= q-p+1;
        //2
        int n2= r-q;
        //3
        int L[]=new int[n1+1];
        //4
        int R[]=new int[n2+1];
        //5 
        for(int i=0; i<n1; i++){
            L[i]=a[p+i];
        }
        //6
        for(int j=0; j<n2; j++){
            R[j] = a[q+1+j];
        }
        //7,8 infinity no add 
        L[n1]=Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;
        
        //9,10
        int i=0;
        int j=0;
        
        //11
        for(int k=p; k<=r; k++){
            if(L[i]<=R[j]){
                a[k]=L[i];
                i++;
            }
            else {
                a[k] = R[j];
                j++;
            }
        }
        
    }
    static void mergeSort(int []a, int p, int r){
        if(p<r){
            int q= (p+r)/2;
            mergeSort(a,p,q);
            mergeSort(a,q+1,r);
            merge(a,p,q,r);
        }
    }
    
    public static void main(String[] args){
        int []a={23,11,14,15,90,30,45,20};
        
        mergeSort(a,0,a.length-1);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    
}


