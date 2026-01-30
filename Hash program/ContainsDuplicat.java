import java.util.*;

public class ContainsDuplicat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            if (map.containsKey(x)) {
                System.out.println("True");
                return;                  
            } else {
                map.put(x, 1);
            }
        }

        System.out.println("False");
    }
}
