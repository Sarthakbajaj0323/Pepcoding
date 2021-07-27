package Recursion_Backtracking;
import java.util.*;
public class Sudoku {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[][]=new int [9][9];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        solvesudoku(arr,0,0);
    }
//po=> possible option
    public static void solvesudoku(int[][] board, int i, int j) {
        if(i==board.length){
            displayboard(board);
            return;
        }

        int ni=0;
        int nj=0;

        if(nj==board[0].length-1){
            ni=i+1;
            nj=0;
        }else{
            ni=i;
            nj=j+1;
        }
        if(board[i][j]!=0){
            solvesudoku(board,ni,nj);
        }else{
            for(int po=1;po<=9;po++){
                if(isvalid(board,i,j,po)==true){
                    board[i][j]=po;
                    solvesudoku(board,ni,nj);
                    board[i][j]=0;
                }
            }
        }
    }

    public static boolean isvalid(int[][] board, int x, int y, int val) {
        for (int j = 0; j < board[0].length; j++) {
            if (board[x][j] == val) {
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][y] == val) {
                return false;
            }
        }
        int smi=x/3*3;
        int smj=y/3*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[smi+i][smj+j]==val){
                    return false;
                }
            }
        }
        return true;
    }


    public static void displayboard(int board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j< board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
