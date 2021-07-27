package Recursion_Backtracking;
import java.util.*;
import java.io.*;
public class Partition_in_K_subsets {
    static int counter=0;
    public static void solution(int i, int n, int k, int ssf, ArrayList<ArrayList<Integer>> ans) {
        //write your code here
        if(i>n){
            if(ssf==k){
                counter++;
                System.out.print(counter+".");
                for(ArrayList<Integer> sets:ans){
                    System.out.print(sets+"");
                }
                System.out.println();
            }
            return;
        }
        for(int j=0;j<ans.size();j++){
            if(ans.get(j).size()>0){              //adding in the old subset
                ans.get(j).add(i);
                solution(i+1,n,k,ssf,ans);
                ans.get(j).remove(ans.get(j).size()-1);
            }else{
                ans.get(j).add(i);
                solution(i+1,n,k,ssf+1,ans);
                ans.get(j).remove(ans.get(j).size()-1);
                break;                           // to avoid permutations
            }
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i  = 0; i < k; i++) {
            ans.add(new ArrayList<>());
        }
        solution(1, n, k, 0, ans);

    }
}
