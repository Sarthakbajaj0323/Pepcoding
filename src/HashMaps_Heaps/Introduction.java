package HashMaps_Heaps;
import java.util.*;
public class Introduction {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",135);
        hm.put("china",195);
        hm.put("us",25);
        hm.put("uk",15);
        hm.put("pak",10);
        System.out.println(hm);

        hm.put("India",554);
        hm.put("nigeria",45);

        System.out.println(hm);

        System.out.println(hm.get("India"));
        System.out.println(hm.get("Africa"));

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("japan"));

        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for(String key: hm.keySet()){
            Integer val=hm.get(key);
            System.out.println(key+":"+val);
        }
    }
}
