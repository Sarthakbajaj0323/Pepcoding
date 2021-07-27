package Recursion;
import java.util.*;
public class getmazepaths {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        ArrayList<String> ans= getmazepaths(1,1,m,n);
        System.out.println(ans);
    }
    //sr-> source row
    //sc-> source column
    //dr-> destination row
    //dc-> destination column
    public static ArrayList<String> getmazepaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> bres=new ArrayList<String>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpaths=new ArrayList<String>();
        ArrayList<String> vpaths=new ArrayList<String>();
        ArrayList<String> mpaths=new ArrayList<String>();
        if(sr<dr){
            vpaths=getmazepaths(sr+1,sc,dr,dc);
        }
        if(sc<dc){
            hpaths=getmazepaths(sr,sc+1,dr,dc);
        }
        for(String vpath:vpaths){
            mpaths.add("v"+vpath);
        }
        for(String hpath:hpaths){
            mpaths.add("h"+hpath);
        }
        return mpaths;
    }
}
