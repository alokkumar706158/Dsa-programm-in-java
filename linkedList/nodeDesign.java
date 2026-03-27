class Node{
    int val;    
    Node next;  //null
    Node(int val){
        this.val = val;  //constructor creating
    }

}

public class nodeDesign{
    public static void main(String[] args) {
        Node a=new Node(20);
        Node b=new Node(30);
        Node c=new Node(40);
        //conecting node 
        a.next=b;
        b.next=c;
        System.out.println(a.val);
        System.out.println(a.next.next.val);
        
    }
}