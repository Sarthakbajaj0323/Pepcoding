package Recursion_Backtracking;
import java.util.*;
//Understand only recursive part!!!!!
public class MaximumScore_ofwords {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int noofwords=s.nextInt();
        String words[]=new String[noofwords];
        for(int i=0;i< words.length;i++){
            words[i]=s.next();
        }
        int noofletter=s.nextInt();
        char letter[]=new char[noofletter];
        for(int i=0;i<letter.length;i++){
            letter[i]=s.next().charAt(0);
        }
        int score[]=new int[26];
        for(int i=0;i<score.length;i++){
            score[i]=s.nextInt();
        }
        if(words==null || words.length==0|| letter==null || letter.length==0 || score.length==0){
            System.out.println(0);
            return;
        }
        int farr[]=new int[score.length];
        for(char ch: letter){
            farr[ch-'a']++;
            System.out.println(Solution(words,farr,score,0));
        }
    }

    private static int Solution(String[] words, int[] farr, int[] score, int idx) {
        if(idx==words.length){
            return 0;
        }
        int sno=0+Solution(words,farr,score,idx+1);// word no included

        //words to include
        int sword=0;
        String word=words[idx];
        boolean flag=true;
        for(int i =0;i<word.length();i++){
            char ch=word.charAt(i);

            if(farr[ch-'a']==0){
                flag=false;
            }

            farr[ch-'a']--;
            sword+=score[ch-'a'];
        }
        int syes=0;
        if(flag){
            syes=sword+Solution(words,farr,score,idx+1);
        }
        for(int i=0;i<words.length;i++){
            char ch=word.charAt(i);
            farr[ch-'a']++;
        }
        return Math.max(sno,syes);
    }
}
