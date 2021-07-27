package Recursion;
import java.util.*;
public class prime_no {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int k=s.nextInt();

            int count=0;
            for(int j=2;j*j<=k;j++){
                if(k % j == 0){
                    count++;
                    break;
                }
            }
            if (count==0) System.out.println("prime");
            else System.out.println("not prime");
        }
    }
}
