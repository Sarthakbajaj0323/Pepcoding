package Recursion_Backtracking;
import java.util.*;
public class Remove_Invalid_Parentheses {

    public static void solution(String str, int mra, HashSet<String> ans) {
        //write your code here
        if(mra==0){
            int minimumremovalnow=getMin(str);      //to check the validity now
            if(minimumremovalnow==0) {
                if (!ans.contains(str)) {
                    System.out.println(str);
                    ans.add(str);
                }
            }
            return;
        }
        for(int i=0;i<str.length();i++){
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            solution(left+right,mra-1,ans);
        }
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int mr=getMin(str);
        solution(str, mr,new HashSet<>());
    }


    public static int getMin(String str) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                if(st.size()==0){
                    st.push(ch);
                }else if(st.peek()==')'){
                    st.push(ch);
                }else if(st.peek()=='('){
                    st.pop();
                }
            }
        }
        return st.size();
    }
}
