import java.util.*;
public class TreemapEx01 {
    public static void main(String[] args) {
        TreeMap<String, Integer> tMap = new TreeMap<>();
        // put
        tMap.put("d", 1);
        tMap.put("c", 2);
        tMap.put("b", 3);
        tMap.put("a", 4);
        // display the treemap
        System.out.println("TreeMap: " + tMap);
        // put
        tMap.put("e",5);
        // display the treemap
        System.out.println("TreeMap after adding key 'e': " + tMap);
        // replace
        tMap.put("b",6);
        // display the treemap
        System.out.println("TreeMap after replace: " + tMap);
        // remove
        tMap.remove("c");
        // display the treemap
        System.out.println("TreeMap after removing key 'c': " + tMap);
        // keySet
        System.out.println("Keys in TreeMap: " + tMap.keySet());
        // values
        System.out.println("Values in TreeMap: " + tMap.values());
        // display the treemap
        System.out.println("TreeMap: " + tMap);
        // tailMap
        System.out.println("TailMap from key 'b': " + tMap.tailMap("b"));
        // headMap
        System.out.println("HeadMap from key 'b': " + tMap.headMap("b"));
    }
}
