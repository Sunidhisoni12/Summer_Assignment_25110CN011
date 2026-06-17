//ques66.write a program to union of arrays
import java.util.*;

public class ques66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        HashSet<Integer> union = new HashSet<>();

        for (int i = 0; i < n1; i++) {
            union.add(arr1[i]);
        }

        for (int i = 0; i < n2; i++) {
            union.add(arr2[i]);
        }

        System.out.println("Union of arrays:");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}