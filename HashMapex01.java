import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> hMap = new HashMap<>();
        // put
        hMap.put("d", 1);
        hMap.put("c", 2);
        hMap.put("b", 3);
        hMap.put("a", 4);
        // display the hashmap
        System.out.println("HashMap: " + hMap);
        // get
        System.out.println("Value for key 'a': " + hMap.get("a"));
        // put
        hMap.put("a",5);
        // display the hashmap
        System.out.println("HashMap after updating key 'a': " + hMap);
        // remove
        hMap.remove("c");
        // display the hashmap
        System.out.println("HashMap after removing key 'c': " + hMap);
        // keySet
        System.out.println("Keys in HashMap: " + hMap.keySet());
        // values
        System.out.println("Values in HashMap: " + hMap.values());
        // display the hashmap
        System.out.println("HashMap after removing all: " + hMap);
        // replace
        hMap.replace("a", 10);
        // display the hashmap
        System.out.println("HashMap after replacing key 'a': " + hMap);

        sc.close();
    }
}
