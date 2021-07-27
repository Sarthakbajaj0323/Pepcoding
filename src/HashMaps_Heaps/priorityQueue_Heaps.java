package HashMaps_Heaps;
import java.util.*;
public class priorityQueue_Heaps {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());            //Collections.reverseOrder()-> it will give first priority to higher number
        int ranks[]={22,11,52,100,99,6,5,3,88};

        for(int val: ranks){                               //nlog(n)-> n complexity for while loop and for adding complexity is log(n)
            pq.add(val);
        }
        while(pq.size()>0){                                //nlog(n)-> n complexity for while loop and for remove complexity is log(n) and peek complexity is O(1)
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
