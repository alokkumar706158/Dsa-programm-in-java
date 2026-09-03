public class quickSort{
    static int partition(int []a, int p, int q){
        //a={5,10,3,6,9,2,11,4}
        int x=a[p];
        int i=p;
        for(int j=p+1; j<=q; j++){
            if(a[j] <= x){
                i=i+1;

                //swap a[i] to a[j]
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        //swap pivot element a[p] to a[i]
        int temp = a[p];
        a[p] = a[i];
        a[i] = temp;

        return i;
    }

    static void qsort(int []a, int p, int q){
        if(p<q){
            int m=partition(a,p,q);
            qsort(a,p , m-1);
            qsort(a, m+1, q);
        }
    }
    public static void main(String[] args){
        int a[] = {5,10,3,6,9,2,11,4};
        qsort(a, 0, a.length-1);
        System.out.println("Quick Sort");

        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

}