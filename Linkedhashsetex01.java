import java.util.LinkedHashSet;

public class Linkedhashsetex01 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
        // add
        lSet.add(5);
        lSet.add(4);
        lSet.add(2);
        lSet.add(3);
        lSet.add(3);
        lSet.add(33);
        // display the linkedhashset
        System.out.println("LinkedHashSet: " + lSet);
        // add
        lSet.add(1);
        // display the linkedhashset
        System.out.println("LinkedHashSet after adding 1: " + lSet);
        // remove
        lSet.remove(2);
        // display the linkedhashset
        System.out.println("LinkedHashSet after removing 2: " + lSet);
        // contains
        System.out.println("LinkedHashSet contains 3: " + lSet.contains(3));
        // size
        System.out.println("Size of LinkedHashSet: " + lSet.size());
    }
}