package Recursion;
import java.util.*;
public class DisplayArrayReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
         DisplayArrayReverse(arr, 0);
    }

    public static void DisplayArrayReverse(int arr[], int idx) {
        if (idx == arr.length) {
            return;
        }
        DisplayArrayReverse(arr, idx + 1);
        System.out.println(arr[idx]);
    }
}