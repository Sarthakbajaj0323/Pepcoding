package Recursion_Backtracking;
import java.util.*;
import java.io.*;
public class Words_K_Length_Words_1 {


    // Select K Distinct Characters without Repetition

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int k = Integer.parseInt(br.readLine());

        HashSet<Character> unique = new HashSet<>();
        String ustr = "";
        for (char ch : str.toCharArray()) {
            if (unique.contains(ch) == false) {
                unique.add(ch);
                ustr += ch;
            }
        }

        generateselection(0,ustr,0,k,"");
    }

    private static void generateselection(int i, String ustr, int ssf, int k, String asf) {
        if(i==ustr.length()){
            if(k==ssf){
                System.out.println(asf);
            }
            return;
        }
        char ch=ustr.charAt(i);
        generateselection(i+1,ustr,ssf+1,k,asf+ch);
        generateselection(i+1,ustr,ssf+0,k,asf);
    }

}
