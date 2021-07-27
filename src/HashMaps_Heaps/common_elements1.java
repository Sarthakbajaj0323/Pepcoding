package HashMaps_Heaps;
import java.util.*;
public class common_elements1 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n1=s.nextInt();
        int a1[]=new int[n1];
        for(int i=0;i<a1.length;i++){
            a1[i]=s.nextInt();
        }
        int n2=s.nextInt();
        int a2[]=new int[n2];
        for(int i=0;i<a2.length;i++){
            a2[i]=s.nextInt();
        }

        HashMap<Integer,Integer> fmap=new HashMap<>();
        for(int val:a1){
            if(fmap.containsKey(val)){
                int of=fmap.get(val);
                int nf=of+1;
                fmap.put(val,nf);
            }else{
                fmap.put(val,1);
            }
        }
        for(int val:a2){
            if(fmap.containsKey(val)){
                System.out.println(val);
                fmap.remove(val);
            }
        }
    }
}
