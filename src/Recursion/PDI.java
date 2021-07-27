package Recursion;
import java.util.*;
public class PDI {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int k= s.nextInt();
    PDI(k);
    }

    public static void PDI(int k) {
        if(k==0) return;
        System.out.println(k);
        PDI(k-1);

        System.out.println(k);

    }
}
