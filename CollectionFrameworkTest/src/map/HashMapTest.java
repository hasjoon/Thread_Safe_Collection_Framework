package map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        //create
        hm.put("a", 1);
        hm.put("b", 2);
        hm.put("c", 3);

        //read
        System.out.println(hm.get("a"));

        
        for(Entry<String,Integer> entry : hm.entrySet()){
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }

        for(String key : hm.keySet()){
            Integer value = hm.get(key);
            System.out.println("key: " + key + " value: " + value);
        }
        
        Integer orDefault = hm.getOrDefault("ddd", 444);
        // System.out.println("getOrDefult: " + hm.get("d"));
        System.out.println("ddd: " + orDefault);
        
        //update
        // hm.compute("a", (s, integer) -> integer +1); //key에 있는 value값에 변화를 준다
        // System.out.println("sout a: " + hm.get("a"));
        hm.computeIfPresent("a", (s, integer) -> integer+10); //있는경우 변화를 준다
        System.out.println("sout a: " + hm.get("a"));
        hm.computeIfAbsent("aa", s -> 100 );//없는경우 추가해줌, 있으면 아무동작 하지 않음
        System.out.println("aa: " + hm.get("aa"));

        // hm.merge(null, orDefault, null);
        // hm.putAll(hm);
        // hm.putIfAbsent(null, orDefault);
        // hm.replace(null, orDefault, orDefault);
        // hm.replaceAll(null);
        

        //delete
        // hm.remove("a");

        // hm.remove("a", 1);

        // hm.clear();




        //check
        boolean containsKey = hm.containsKey("a");
        System.out.println("containsKey: " + containsKey);
        boolean containsValue = hm.containsValue(11);
        System.out.println("containsValue: " + containsValue);


        String a = "A";
        char ch = a.charAt(0);
        int num = (int) ch;
        System.out.println(num);
    }


   
}
