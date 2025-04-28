import java.util.HashSet;

public class HashSetex01 {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();
        // add
        hSet.add(5);
        hSet.add(4);
        hSet.add(2);
        hSet.add(3);
        hSet.add(3);
        hSet.add(33);
        // display the hashset
        System.out.println("HashSet: " + hSet);
        // add
        hSet.add(1);
        // display the hashset
        System.out.println("HashSet after adding 1: " + hSet);
        // remove
        hSet.remove(2);
        // display the hashset
        System.out.println("HashSet after removing 2: " + hSet);
        // contains
        System.out.println("HashSet contains 3: " + hSet.contains(3));
        // size
        System.out.println("Size of HashSet: " + hSet.size());

    }
}