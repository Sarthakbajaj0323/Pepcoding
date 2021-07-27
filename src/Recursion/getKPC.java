package Recursion;
import java.util.*;
public class getKPC {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        ArrayList<String> ans=getKPC(str);
        System.out.println(ans);
    }
    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<String >();
            bres.add("");
            return bres;
        }
        //678
        char ch=str.charAt(0);//6
        String ros= str.substring(1);//78

        ArrayList<String> rres=getKPC(ros);
        ArrayList<String> mres=new ArrayList<String>();

        String codeforch=codes[ch-'0'];
        for(int i=0;i<codeforch.length();i++){
            char chcode=codeforch.charAt(i);
            for(String rstr : rres){
                mres.add(chcode+rstr);
            }
        }
        return mres;
    }
}
