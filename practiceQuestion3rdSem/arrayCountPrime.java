import java.util.Scanner;

public class arrayCountPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int totalPrime = 0;

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;

            if (num > 1) {
                for (int j = 1; j <= num; j++) {
                    if (num % j == 0) {
                        count++;
                    }
                }
            }

            if (count == 2) {
                totalPrime++;
            }
        }

        System.out.println("Total prime numbers = " + totalPrime);
    }
}
