package Recursion_Backtracking;
import java.util.*;
public class Lexicographical {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for(int i=1;i<=9;i++){
            dfs(i,n);
        }
    }

    private static void dfs(int i, int n) {
        if(i>n){
            return;
        }
        System.out.println(i);
        for(int j=0;j<10;j++){
            dfs(10*i+j,n);
        }
    }
}
