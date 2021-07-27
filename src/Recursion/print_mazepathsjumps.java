package Recursion;
import java.util.*;
public class print_mazepathsjumps {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        print_mazepathsjumps(1,1,n,m,"");
    }
    //sr-> source row
    //sc-> source column
    //dr-> destination row
    //dc-> destination column
    //psf-> path so far
    public static void print_mazepathsjumps(int sr,int sc, int dr, int dc,String psf){
        if(sr==dr&&sc==dc){
            System.out.println(psf);
            return;
        }
        for(int ms=1;ms<=dc-sc;ms++){
            print_mazepathsjumps(sr,sc+ms,dr,dc,psf+"h"+ms);
        }

        for(int ms=1;ms<=dr-sr;ms++){
            print_mazepathsjumps(sr+ms,sc,dr,dc,psf+"v"+ms);
        }

        for(int ms=1;ms<=dc-sc && ms<=dr-sr;ms++){
            print_mazepathsjumps(sr+ms,sc+ms,dr,dc,psf+"d"+ms);
        }
    }
}
