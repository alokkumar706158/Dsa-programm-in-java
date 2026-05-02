class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            
        }
    }

public class dfs {
        public static void main(String[] args) {

        //          3
        //        /   \
        //      4       2
        //     / \     / \
        //   -1   1   6   9  
        //         \
        //          11
        //         / \
        //        12  13

        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(2);
        Node d=new Node(-1);
        Node e=new Node(1);
        Node f=new Node(6);
        Node g=new Node(9);
        Node h=new Node(11);
        Node i=new Node(12);
        Node j=new Node(13);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        e.right=h; h.left=i;
        h.right=j;

        display(a);
        System.out.println();
     
        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);

        

       }
       public static void display(Node root)
{
    //traverse
    if(root==null) return;
    System.out.print(root.val+" ");
    display(root.left);
    display(root.right);
    }

    
    //preorder
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    //inorder
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    //postorder
    public static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");

   
    }


    }

     