package Recursion_Backtracking;
import java.util.*;
public class CryptarithmeticPuzzle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        String s3 = scn.nextLine();

        HashMap<Character, Integer> charIntMap = new HashMap<>();
        String unique = "";
        for (int i = 0; i < s1.length(); i++) {
            if (!charIntMap.containsKey(s1.charAt(i))) {
                charIntMap.put(s1.charAt(i), -1);
                unique += s1.charAt(i);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (!charIntMap.containsKey(s2.charAt(i))) {
                charIntMap.put(s2.charAt(i), -1);
                unique += s2.charAt(i);
            }
        }

        for (int i = 0; i < s3.length(); i++) {
            if (!charIntMap.containsKey(s3.charAt(i))) {
                charIntMap.put(s3.charAt(i), -1);
                unique += s3.charAt(i);
            }
        }

        boolean[] usedNumbers = new boolean[10];
        solution(unique, 0, charIntMap, usedNumbers, s1, s2, s3);
    }
    private static int getnum(String s, HashMap<Character, Integer> charIntMap) {
        String num="";
        for(int i=0;i<s.length();i++){
            num+=charIntMap.get(s.charAt(i));
        }
        return Integer.parseInt(num);
    }

    public static void solution(String unique, int idx,
                                HashMap<Character, Integer> charIntMap, boolean[] usedNumbers,
                                String s1, String s2, String s3) {
            if(unique.length()==idx){
                int num1=getnum(s1,charIntMap);
                int num2=getnum(s2,charIntMap);
                int num3=getnum(s3,charIntMap);

                if(num1+num2==num3) {
                    for (int i = 0; i < 26; i++) {
                        char ch = (char) ('a' + i);
                        if (charIntMap.containsKey(ch)) {
                            System.out.print(ch + "-" + charIntMap.get(ch) + " ");
                        }
                    }
                    System.out.println();
                }
                return ;
            }
            char ch=unique.charAt(idx);
            for(int num=0;num<=9;num++){
                if(usedNumbers[num]==false){
                    charIntMap.put(ch,num);
                    usedNumbers[num]=true;
                    solution(unique,idx+1,charIntMap,usedNumbers,s1,s2,s3);
                    usedNumbers[num]=false;
                    charIntMap.put(ch,-1);
                }
            }
    }


}
