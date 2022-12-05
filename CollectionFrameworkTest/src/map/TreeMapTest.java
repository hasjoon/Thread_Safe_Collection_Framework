package map;



import java.util.Map.Entry;
import java.util.TreeMap;

import javax.print.attribute.PrintServiceAttribute;

public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>();



        //create
        treeMap.put("a", 10);
        treeMap.putIfAbsent("b", 20);
        treeMap.put("c", 30);
        treeMap.put("d", 40);

        System.out.println("ThreMap: " + treeMap);

        //read
        treeMap.lastEntry();
        treeMap.firstEntry();
        Entry<String, Integer> ceilingEntry = treeMap.ceilingEntry("c");
        System.out.println("ceilingEntry: " + ceilingEntry);
    }
}