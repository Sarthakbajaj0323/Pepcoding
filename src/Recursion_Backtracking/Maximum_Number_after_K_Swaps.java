package Recursion_Backtracking;
import java.util.*;
import java.io.*;
public class Maximum_Number_after_K_Swaps {
    static String max;
    public static void findMaximum(String str, int k) {
        //write your code here
        if(Integer.parseInt(str)>Integer.parseInt(max)){
            max=str;
        }
        if(k==0){
            return;
        }
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(j)>str.charAt(i)){
                    str=swap(str,i,j);
                    findMaximum(str,k-1);
                    str=swap(str,i,j);
                }
            }
        }

    }

    private static String swap(String str, int i, int j) {
        char ith=str.charAt(i);
        char jth=str.charAt(j);

        String left=str.substring(0,i);
        String middle=str.substring(i+1,j);
        String right=str.substring(j+1);

        return left + jth+ middle+ ith+ right;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
        max = str;
        findMaximum(str, k);
        System.out.println(max);
    }

}
