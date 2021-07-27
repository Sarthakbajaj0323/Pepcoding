package Recursion;
import java.util.*;
public class firstindexofarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();
        int arr[] =new int[k];
        for(int i=0;i<k;i++){
            arr[i]=s.nextInt();
        }
        int d=s.nextInt();
        int ans=firstindexofarray(arr,0,d);
        System.out.println(ans);
    }

    public static int firstindexofarray(int arr[],int idx,int x) {
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }else{
            int fisa=firstindexofarray(arr,idx+1,x);
            return fisa;
        }

    }
}
