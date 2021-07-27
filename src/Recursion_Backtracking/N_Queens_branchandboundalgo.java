package Recursion_Backtracking;
import java.util.*;
public class N_Queens_branchandboundalgo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        boolean board[][]=new boolean[n][n];

        boolean cols[]=new boolean[n];
        boolean ndig[]=new boolean[2 * n -1];
        boolean rdig[]=new boolean[2 * n -1];

        branch_bound(board,0,cols,ndig,rdig,"");
    }

    private static void branch_bound(boolean[][] board, int row, boolean[] cols, boolean[] ndig, boolean[] rdig, String asf) {
        if(row==board.length){
            System.out.println(asf);
            return;
        }
        for(int col=0;col<board[0].length;col++){
            if(cols[col]==false && ndig[row+col]==false
               && rdig[row-col+ board.length-1]==false){
                board[row][col]=true;
                cols[col]=true;
                ndig[row+col]=true;
                rdig[row-col+ board.length-1]=true;
                branch_bound(board,row+1,cols,ndig,rdig,asf+row+"-"+col+", ");
                board[row][col]=false;
                cols[col]=false;
                ndig[row+col]=false;
                rdig[row-col+ board.length-1]=false;
            }
        }
    }
}
