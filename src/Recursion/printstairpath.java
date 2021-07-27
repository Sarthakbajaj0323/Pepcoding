package Recursion;
import java.util.*;
public class printstairpath {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        printstairpath(n,"");
    }

    public static void printstairpath(int n,String path) {
        if(n<0){
            return;
        }
        if(n==0){
            System.out.println(path);
            return;
        }
        printstairpath(n-1,path+1);
        printstairpath(n-2,path+2);
        printstairpath(n-3,path+3);
    }
}
