package Recursion;
import java.util.*;
public class print_encoding {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        print_encoding(str,"");
    }
    // asf-> answer so far
    //chv  || ch12v ->character value
    public static void print_encoding(String ques,String asf) {
        if(ques.length()==0){
            System.out.println(asf);
            return;
        }
        else if(ques.length()==1){
            char ch=ques.charAt(0);
            if(ch=='0'){
                return;
            }else{
                int chv=ch-'0';    //using ASCII
                char code=(char)('a'+chv-1);    //number se code bna rhe h according to the ques
                System.out.println(asf+code);
            }
        }
        else{
            char ch=ques.charAt(0);
            String ros=ques.substring(1);
            if(ch=='0'){
                return;
            }else{
                int chv=ch-'0';
                char code=(char)('a'+chv-1);
                print_encoding(ros,asf+code);
            }
            String ch12=ques.substring(0,2);
            String roq=ques.substring(2);

            int ch12v=Integer.parseInt(ch12);
            if(ch12v<=26){
                char code=(char)('a'+ch12v-1);
                print_encoding(roq,asf+code);
            }
        }
    }
}
