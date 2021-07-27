package Recursion_Backtracking;
import java.util.*;
public class Crossword_Puzzle {
    public static void solution(char[][] arr, String[] words, int vidx){
        //write your code here
        if(vidx==words.length){
            print(arr);
            return;
        }
        String word=words[vidx];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == '-' || arr[i][j]==word.charAt(0)){
                    if(canplacewordhorizontally(arr,word,i,j)==true){
                        boolean weplaced[]=placedwordhorizontally(arr,word,i,j);
                        solution(arr,words,vidx+1);
                        unplacewordhorizontally(arr,weplaced,i,j);
                    }
                    if(canplacewordvertically(arr,word,i,j)==true){
                        boolean weplaced[]=placedwordvertically(arr,word,i,j);
                        solution(arr,words,vidx+1);
                        unplacewordvertically(arr,weplaced,i,j);
                    }
                }
            }
        }
    }
    public static boolean canplacewordhorizontally(char[][] arr, String word,int i, int j){
        if(j-1>=0 && arr[i][j-1]!='+'){
            return false;
        }else if(j+word.length()<arr[0].length && arr[i][j+word.length()]!='+'){
            return false;
        }
        for(int jj=0;jj<word.length();jj++){
            if(j+jj>=arr[0].length){
                return false;
            }
            if(arr[i][j+jj]=='-' || arr[i][j+jj]==word.charAt(jj)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static boolean canplacewordvertically(char[][] arr, String word,int i, int j){
        if(i-1>=0 && arr[i-1][j]!='+'){
            return false;
        }else if(i+word.length()<arr[0].length && arr[i+word.length()][j]!='+'){
            return false;
        }
        for(int ii=0;ii<word.length();ii++){
            if(i+ii>=arr[0].length){
                return false;
            }
            if(arr[i+ii][j]=='-' || arr[i+ii][j]==word.charAt(ii)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static boolean[] placedwordhorizontally(char [][]arr,String word, int i , int j){
        boolean weplaced[]=new boolean[word.length()];

        for(int jj=0;jj<word.length();jj++){
            if(arr[i][j+jj]=='-'){
                arr[i][j+jj]=word.charAt(jj);
                weplaced[jj]=true;
            }
        }
        return weplaced;
    }
    public static boolean[] placedwordvertically(char [][]arr,String word, int i , int j){
        boolean weplaced[]=new boolean[word.length()];

        for(int ii=0;ii<word.length();ii++){
            if(arr[i+ii][j]=='-'){
                arr[i+ii][j]=word.charAt(ii);
                weplaced[ii]=true;
            }
        }
        return weplaced;
    }

    public static void unplacewordhorizontally(char[][] arr,boolean[] weplaced,int i, int j){
        for(int jj=0;jj<weplaced.length;jj++){
            if(weplaced[jj] == true){
                arr[i][j+jj]='-';
            }
        }
    }
    public static void unplacewordvertically(char[][] arr,boolean[] weplaced,int i, int j){
        for(int ii=0;ii<weplaced.length;ii++){
            if(weplaced[ii]==true){
                arr[i+ii][j]='-';
            }
        }
    }
    public static void print(char[][] arr){
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr.length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[][] arr = new char[10][10];
        for(int i = 0 ; i < arr.length; i++){
            String str = scn.next();
            arr[i] = str.toCharArray();
        }
        int n = scn.nextInt();
        String[] words = new String[n];
        for(int i = 0 ; i  < words.length; i++){
            words[i] = scn.next();
        }
        solution(arr,words,0);
    }

}
