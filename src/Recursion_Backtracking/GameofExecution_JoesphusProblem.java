package Recursion_Backtracking;
import java.util.*;
public class GameofExecution_JoesphusProblem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        System.out.println(ans(n,k));
    }

    private static int ans(int n, int k) {
        if(n==1){
            return 0;
        }
        int x=ans(n-1,k);
        int y=(x+k)%n;
        return y;
    }
}
