package Recursion;
import java.util.*;
public class print_mazepaths {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        print_mazepaths(1, 1, n, m, "");
    }
    //sr-> source row
    //sc-> source column
    //dr-> destination row
    //dc-> destination column
    //psf-> path so far
    public static void print_mazepaths(int sr,int sc,int dr,int dc,String psf) {
        if(sr>dr||sc>dc){
            return;
        }
        if(sr==dr&&sc==dc){
            System.out.println(psf);
            return;
        }
        print_mazepaths(sr,sc+1,dr,dc,psf+"h");
        print_mazepaths(sr+1,sc,dr,dc,psf+"v");

    }
}
//all the print ques are done from down to the base case that is either
//in yes or no state
//or storing answers continously