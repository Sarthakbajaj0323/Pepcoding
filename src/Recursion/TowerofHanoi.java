package Recursion;
import  java.util.*;
public class TowerofHanoi {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n =s.nextInt();
        int t1d=s.nextInt();
        int t2d=s.nextInt();
        int t3d=s.nextInt();
        TowerofHanoi(n,t1d,t2d,t3d);
    }

    public static void TowerofHanoi(int n, int t1id,int t2id,int t3id) {
        if(n==0){
            return;
        }
        TowerofHanoi(n-1,t1id,t3id,t2id); // will print the instruction to move n-1 disk from t1 to t3 using t2
        System.out.println(n + "[" + t1id + " ->" + "]" + t2id);// we  will form the last disk from t1 to t2
        TowerofHanoi(n-1,t3id,t2id,t1id);// will print the instruction to move n-1 disk from t3 to t2 using t1
    }
}
