import java.util.*;
public class LinkedHashMapex01 {
    public static void main(String[] args) {
        Map<String, Integer> lMap = new LinkedHashMap<>();
        // put
        lMap.put("d", 1);
        lMap.put("c", 2);
        lMap.put("b", 3);
        lMap.put("a", 4);
        // display the linkedhashmap
        System.out.println("LinkedHashMap: " + lMap);
        // put
        lMap.put("e",5);
        // display the linkedhashmap
        System.out.println("LinkedHashMap after adding key 'e': " + lMap);
        // replace
        lMap.put("b",6);
        // display the linkedhashmap
        System.out.println("LinkedHashMap after replace: " + lMap);
        // remove
        lMap.remove("c");
        // display the linkedhashmap
        System.out.println("LinkedHashMap after removing key 'c': " + lMap);
        // keySet
        System.out.println("Keys in LinkedHashMap: " + lMap.keySet());
        // values
        System.out.println("Values in LinkedHashMap: " + lMap.values());
        // display the linkedhashmap
        System.out.println("LinkedHashMap: " + lMap);
    }
}
