package Graphs;
import java.util.*;
import java.io.*;
public class No_Of_islands {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            String parts = br.readLine();
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
            }
        }

        // write your code here
        boolean visited[][]=new boolean[arr.length][arr[0].length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr[0].length;j++){
                if (arr[i][j]==0 && visited[i][j]==false){
                    drawtreeandgetcomponents(arr,i,j,visited);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void drawtreeandgetcomponents(int[][] arr, int i, int j, boolean[][] visited) {
        if (i<0 || i>= arr.length || j<0 ||j>= arr[0].length
            || visited[i][j]==true || arr[i][j]==1){
            return;
        }
        visited[i][j]=true;
        drawtreeandgetcomponents(arr,i-1,j,visited);
        drawtreeandgetcomponents(arr,i,j+1,visited);
        drawtreeandgetcomponents(arr,i,j-1,visited);
        drawtreeandgetcomponents(arr,i+1,j,visited);
    }
}
