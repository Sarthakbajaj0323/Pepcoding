package Recursion_Backtracking;
import java.util.*;
public class Gold_Mine_II {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        getmaxgold(arr);
        System.out.println(max);
    }
    static int max=0;
    private static void getmaxgold(int[][] arr) {
        boolean visited[][]=new boolean[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]!=0 && visited[i][j]==false){
                    ArrayList<Integer> bag=new ArrayList<>();
                    travelandcollectgold(arr,i,j,visited,bag);
                    int sum=0;
                    for(int val:bag){
                        sum+=val;
                    }
                    if(sum>max){
                        max=sum;
                    }
                }
            }
        }
    }

    private static void travelandcollectgold(int[][] arr, int i, int j, boolean[][] visited, ArrayList<Integer> bag) {
        if(i<0 || j<0 ||i>=arr.length || j>=arr[0].length ||
        visited[i][j]==true || arr[i][j]==0){
            return ;
        }
        visited[i][j]=true;
        bag.add(arr[i][j]);
        travelandcollectgold(arr,i-1,j,visited,bag);
        travelandcollectgold(arr,i,j+1,visited,bag);
        travelandcollectgold(arr,i,j-1,visited,bag);
        travelandcollectgold(arr,i+1,j,visited,bag);
    }
}
