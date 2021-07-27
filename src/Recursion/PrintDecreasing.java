package Recursion;
import java.util.*;
public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        printdecreasing(k);

    }

    public static void printdecreasing(int k) {
        if(k==0) return;

        System.out.println(k);
        printdecreasing(k-1);
    }
}
