import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.addFirst(5);
        list.addLast(50);

        list.remove(Integer.valueOf(10));
        list.removeFirst();

        System.out.println(list);
    }
}
