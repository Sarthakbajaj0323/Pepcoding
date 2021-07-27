package Recursion;
import java.util.*;
public class getmazepathjumps {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        ArrayList<String> ans = getmazepathjumps(1, 1, m, n);
        System.out.println(ans);
    }
    //sr-> source row
    //sc-> source column
    //dr-> destination row
    //dc-> destination column
    //ms-> move size
    public static ArrayList<String> getmazepathjumps(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }
        //horizontal move
        ArrayList<String> paths = new ArrayList<String>();
        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpaths=getmazepathjumps(sr,sc+ms,dr,dc);
            for(String hpath : hpaths){
                paths.add("h"+ms+hpath);
            }
        }
        //vertical move
        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vpaths=getmazepathjumps(sr+ms,sc,dr,dc);
            for(String vpath : vpaths){
                paths.add("v"+ms+vpath);
            }
        }
        //diagonal move
        for (int ms = 1; ms <= dc - sc && ms<= dr- sr; ms++) {
            ArrayList<String> dpaths=getmazepathjumps(sr+ms,sc+ms,dr,dc);
            for(String dpath : dpaths){
                paths.add("d"+ms+dpath);
            }
        }
        return paths;
    }
}