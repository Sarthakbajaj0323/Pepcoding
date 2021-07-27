package Recursion;
import java.util.*;
// in this space taken is  ((n+1)*n) which is very large where n is the no of character
public class getSubsequence {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str=s.next();
        ArrayList<String> res=getSubsequence(str);
        System.out.println(res);
    }
    //Ex -> (---,--c,-b-,-bc,a--,a-c,ab-,abc)
    //Ft -> (--,-c,b-,bc)
    public static ArrayList<String> getSubsequence(String str) {
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<String>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);//a
        String ros= str.substring(1);//bc
        ArrayList<String> rres=getSubsequence(ros);

        ArrayList<String> mres=new ArrayList<String>();
        for(String rstr : rres){
            mres.add(""+ rstr);
            mres.add(ch + rstr);
        }
        return mres;
    }
}
