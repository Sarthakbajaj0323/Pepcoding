package Recursion;

import java.util.Scanner;

public class MaxofArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=s.nextInt();
        }
        int max=MaxofArray(arr,0);
        System.out.println(max);
    }

    public static int MaxofArray(int arr[],int idx) {
        if(idx==arr.length-1){
            return arr[idx];
        }
        int misa=MaxofArray(arr,idx+1);
        if(misa>arr[idx]){
            return misa;
        }
        else{
            return arr[idx];
        }
    }
}
