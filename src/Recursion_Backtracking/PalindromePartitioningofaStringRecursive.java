package Recursion_Backtracking;
import java.util.*;
public class PalindromePartitioningofaStringRecursive {

    public static void solution(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i=0;i<str.length();i++){
            String prefix=str.substring(0,i+1);
            String ros=str.substring(i+1);
            if(ispalindrome(prefix)){
                solution(ros,asf+"("+prefix+")");
            }
        }
    }

    private static boolean ispalindrome(String prefix) {
        int li=0;
        int ri=prefix.length()-1;
        while(li<ri){
            char left=prefix.charAt(li);
            char right=prefix.charAt(ri);
            if(left!=right){
                return false;
            }
            li++;
            ri--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str, "");
    }
}
