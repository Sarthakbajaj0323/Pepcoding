package Recursion;
import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int fact=factorial(k);
        System.out.println(fact);
    }

    public static int factorial(int k) {
        if(k==0 ||k==1)
            return 1;
        return k* factorial(k-1);

    }
}
