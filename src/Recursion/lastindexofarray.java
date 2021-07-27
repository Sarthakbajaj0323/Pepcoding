package Recursion;
import java.util.*;
public class lastindexofarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int d=s.nextInt();
        int ans=lastindexofarray(arr,0,d);
        System.out.println(ans);
    }

    public static int lastindexofarray(int arr[], int idx,int x) {
        if(idx== arr.length){
            return -1;
        }
        int liic=lastindexofarray(arr,idx+1,x);
        if(liic==-1) {
            if (arr[idx] == x) {
                return idx;
            } else {
                return -1;
            }
        }
        else{
            return liic;
        }
    }
}
