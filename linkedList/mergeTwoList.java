import java.util.*;
public class mergeTwoList {   //21 question
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        LinkedList<Integer> list1=new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        System.out.println("Enter the size of linkedlist");
        int n1=sc.nextInt();
        
        for(int i=0; i<n1; i++){
            list1.add(sc.nextInt());
        }
        System.out.println("Enter the size of 2nd List");
        int n2=sc.nextInt();

        for(int i=0; i<n2; i++){
            list2.add(sc.nextInt());
        }

        list1.addAll(list2);
        Collections.sort(list1);
        System.out.println("Marge linked list are "+list1);

    }
    
}
