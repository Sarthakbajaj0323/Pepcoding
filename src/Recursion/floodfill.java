package Recursion;
import java.util.*;
public class floodfill {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[][]=new int[n][m];
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        boolean [][] visited =new boolean[n][m];
        floodfill(arr,0,0,"",visited);
    }

    public static void floodfill(int maze[][],int row,int col,String psf,boolean visited[][]){
        if(row<0||col<0||row== maze.length|col== maze[0].length||
        maze[row][col]==1||visited[row][col]==true){
            return;
        }
        if(row== maze.length-1 || col== maze[0].length){
            System.out.printf(psf);
            return;
        }
        visited[row][col]=true;
        floodfill(maze,row-1,col,psf+"t",visited);
        floodfill(maze,row,col-1,psf+"l",visited);
        floodfill(maze,row+1,col,psf+"d",visited);
        floodfill(maze,row,col+1,psf+"r",visited);
        visited[row][col]=false;
    }
}
