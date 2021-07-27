package Recursion;
import java.util.*;
public class getstairpath {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<String> ans=getstairpath(n);
        System.out.println(ans);
    }

    public static ArrayList<String> getstairpath(int n) {
         if(n==0){
             ArrayList<String> bres=new ArrayList<String>();
             bres.add("");
             return bres;
         }
         else if(n<0){
             ArrayList<String> bres=new ArrayList<String>();
             return bres;
         }
        ArrayList<String> paths1=getstairpath(n-1);
        ArrayList<String> paths2=getstairpath(n-2);
        ArrayList<String> paths3=getstairpath(n-3);
        ArrayList<String> tpaths= new ArrayList<String>();
        for(String path: paths1){
            tpaths.add(1+path);
        }
        for(String path: paths2){
            tpaths.add(2+path);
        }
        for(String path: paths3){
            tpaths.add(3+path);
        }
        return tpaths;
    }
}
