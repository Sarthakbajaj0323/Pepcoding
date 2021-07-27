package Recursion;

import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        printincreasing(k);

    }

    public static void printincreasing(int k) {
        if(k==0) return ;
        printincreasing(k-1);
        System.out.println(k);

    }
}
