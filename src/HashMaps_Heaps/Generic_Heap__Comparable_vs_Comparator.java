package HashMaps_Heaps;
import java.util.*;
import java.io.*;
public class Generic_Heap__Comparable_vs_Comparator {
    static class Student implements Comparable<Student>{
        int rno;
        int ht;
        int wt;

        Student(int rno,int ht,int wt){
            this.rno=rno;
            this.ht=ht;
            this.wt=wt;

        }
        public int compareTo(Student o){
            return this.rno-o.rno;
        }
        public String toString(){
            return "rno ="+this.rno+"wt ="+this.wt+"ht ="+this.ht;
        }
    }
    public static void main(String[] args) throws Exception{
        int arr[]={10,2,17,3,18,9,22};
        PriorityQueue<Student> pq=new PriorityQueue<>();

        pq.add(new Student(10,180,81));
        pq.add(new Student(2,185,85));
        pq.add(new Student(12,170,84));
        pq.add(new Student(18,179,88));
        pq.add(new Student(7,182,82));

        while(pq.size()>0);
        System.out.println(pq.peek());
        pq.remove();
    }
}
/***
 * use of comparable function
 *
 * public boolean issmaller(int i ,int j){
 *     Comparable ith=(Comparable)data.get(i);
 *     Comparable jth=(Comparable)data.get(j);
 *     if(ith.issmaller(jth)<0){
 *         return true;
 *     }else{
 *         return false;
 *     }
 * }
 *
 *  public void downheapify(int pi){
 *             int mini=pi;
 *             int li=2*pi+1;
 *             if (li<data.size() && issmaller(li,mini)==true){
 *                 mini=li;
 *             }
 *             int ri=2*pi+2;
 *             if(ri<data.size() && issmaller(ri,mini)==true){
 *                 mini=li;
 *             }
 *             if(mini!=pi){
 *                 swap(pi,mini);
 *                 downheapify(mini);
 *             }
 *         }
 */

/***
 * for other parameter we use comprator we make compare function and pass both the arguments
 * refer the video
 */