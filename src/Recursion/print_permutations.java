package Recursion;
import java.util.*;
public class print_permutations {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        print_permutations(str,"");
    }
    //asf-> answer so far
    //qlpart->ques left part
    //qrpart->ques right oart
    public static void print_permutations(String ques,String asf) {
        if(ques.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            String qlpart=ques.substring(0,i);
            String qrpart=ques.substring(i+1);
            String roq= qlpart+qrpart;
            print_permutations(roq,asf+ch);
        }
    }
}
