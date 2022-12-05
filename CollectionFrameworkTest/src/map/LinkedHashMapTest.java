package map;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        
        //create
        lhm.put("a", 1);
        lhm.put("b", 2);
        lhm.put("c", 3);
        lhm.put("d", 4);

        //read
        Integer get = lhm.get("a");
        System.out.println("get a's value: " + get);
        lhm.isEmpty();

        lhm.putAll(lhm);
        System.out.println("putall : " + lhm);

        //update
        LinkedHashMap<String,Integer> lhm2 = (LinkedHashMap<String, Integer>) lhm.clone();
        System.out.println("lhm2: " + lhm2);



        //delete
        Integer remove = lhm.remove("c");
        System.out.println("remove: " + remove);

        lhm.remove("a", 1);
        System.out.println("lhm: " + lhm);
        
    }
    

    
}
