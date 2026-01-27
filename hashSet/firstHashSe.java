import java.util.HashSet;
import java.util.Iterator;

public class firstHashSe{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(2);
        set.add(3);
        set.add(1);

        if(set.contains(1)){
            System.out.println("set contain 1");
        }
        if(!set.contains(4)){
            System.out.println("Set does not contain");
        }
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("WE deleted 1");
        }
        // size
        System.out.println(set.size());

        // print all element in set
        System.out.println(set);

        //Iterator is used to traverse set
        Iterator it=set.iterator();
        //hashNext finction and next function
        // it.next() return the next vailu of set
        //hashNext() return true if next value is availabel or false
        
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}