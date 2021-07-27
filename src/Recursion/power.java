package Recursion;
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int pow=s.nextInt();
    int num=s.nextInt();
    int ans=power(pow,num);
    System.out.println(ans);

    }

    public static int power(int pow, int num) {
        if(pow==0){
            return 1;
        }
        return num*power(pow-1,num);
        /*** int xnm1=power(pow-1,num);
            int xnm=x*xnm1;
            return xnm; ***/

    }
}
