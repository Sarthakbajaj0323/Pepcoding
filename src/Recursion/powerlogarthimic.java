package Recursion;
import java.util.*;
public class powerlogarthimic {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int num= s.nextInt();
    int pow=s.nextInt();
    int ans= powerlogarthimic(num,pow);
        System.out.println(ans);
    }

    public static int powerlogarthimic(int num,int pow) {
        if(pow==0){
            return 1;
        }
        int xn2=powerlogarthimic(num,pow/2);
        int ans=xn2*xn2;
        if(pow%2==1){
            ans=ans*num;
        }
        return ans;
    }
}
