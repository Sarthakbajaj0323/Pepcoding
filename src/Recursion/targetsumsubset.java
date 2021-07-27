package Recursion;
import java.util.*;
public class targetsumsubset {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int tar=s.nextInt();
        targetsumsubset(arr,0,"",0,tar);
    }
    //set-> it is the subset
    //sos->sum of subset
    //tar->target
    public static void targetsumsubset(int []arr,int idx,String set,int sos,int tar) {
        if(idx==arr.length){
            if(sos==tar){
                System.out.println(set);
            }
            return;
        }
        targetsumsubset(arr,idx+1,set+arr[idx]+",",arr[idx]+sos,tar);
        targetsumsubset(arr,idx+1,set,sos,tar);
    }
}
