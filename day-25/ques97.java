//ques97. write a program to merge two sorted array 
import java.util.*;

public class ques97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // size of first array
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        // elements of first sorted array
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // size of second array
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        // elements of second sorted array
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // merge both sorted arrays
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        // remaining elements of first array
        while (i < n1) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        // remaining elements of second array
        while (j < n2) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        // print merged array
        for (int x = 0; x < merged.length; x++) {
            System.out.print(merged[x] + " ");
        }
    }
}