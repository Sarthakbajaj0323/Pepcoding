package Recursion;
import java.util.*;
import java.util.Scanner;
// in this memory used of the stack is ((n+1)*n) where n is the no of character and
// as soon as the result gets printed the ans is poped out of the stack
// so space used is less
public class printsubsequence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        printsubsequence(str,"");
    }

    public static void printsubsequence(String ques,String ans) {

        if(ques.length()==0){
            System.out.println(ans);
            return ;
        }
        char ch=ques.charAt(0);
        String ros=ques.substring(1);
        printsubsequence(ros,ans+ch);
        printsubsequence(ros,ans+"");
    }
}
// the answer would be solved in yes or no if yes it will get printed otherwise left blank