package Recursion_Backtracking;
import java.util.*;
import java.io.*;
public class Combinations_1 {
    public static void combinations(int cb, int tb, int ssf, int ts, String asf){
        // write your code here
        if(cb>tb){
            if(ssf==ts){
                System.out.println(asf);
            }
            return;
        }
        combinations(cb+1,tb,ssf,ts,asf+"-");   //no ki call
        combinations(cb+1,tb,ssf+1,ts,asf+"i");   //yes ki call
    }
//    cb->current box
//    tb->totalbox
//    ssf->selection so far
//    tb->total boxes
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        combinations(1, nboxes, 0, ritems, "");
    }
}
