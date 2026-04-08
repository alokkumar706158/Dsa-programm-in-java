import java.util.Stack;

public class stackFirst {
    public static void main(String[] args){
        Stack<String> st = new Stack<>();

        st.push("alok");            //add elemen
        st.push("aman");
        st.push("rohan");
        st.push("ankit");
        st.push("ramesh");
        

        System.out.println(st.size());
        System.out.println(st);
        st.pop();   //remove
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());          //print top element;

    }
}