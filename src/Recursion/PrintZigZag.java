package Recursion;
import java.util.*;
//GOOD QUESTION FOR ANALYSIS OF RECURSION FOR TWO CALLS (EULAR TREE METHOD)
public class PrintZigZag {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int k =s.nextInt();
    pzz(k);
    }

    public static void pzz(int k) {
        if(k==0){
            return;
        }
        System.out.println("pre"+k);
        pzz(k-1);
        System.out.println("in"+k);
        pzz(k-1);
        System.out.println("post"+k);
    }
}
/**
 *  1 pre
 *  2 left call
 *  3 in
 *  4 right call
 *  5 post
 */
