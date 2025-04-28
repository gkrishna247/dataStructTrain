import java.util.*;
public class Collectionminmax {
    public static void main(String [] args){
        ArrayList<Integer> al1=new ArrayList<>();
        // add elements to the list
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(5);
        al1.add(15);
        al1.add(25);
        System.out.println("ArrayList: " + al1);
        //find min using for loop
        int min=al1.get(0);
        for(int i=1;i<al1.size();i++){
            if(al1.get(i)<min){
                min=al1.get(i);
            }
        }
        System.out.println("Minimum value is: " + min);
        //find max using for loop
        int max=al1.get(0);
        for(int i=1;i<al1.size();i++){
            if(al1.get(i)>max){
                max=al1.get(i);
            }
        }
        System.out.println("Maximum value is: " + max);
        //LinkedList
        LinkedList<Integer> ll1=new LinkedList<>();
        // add elements to the list
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(5);
        ll1.add(15);
        ll1.add(25);
        System.out.println("LinkedList: " + ll1);
        //find min using for loop
        int min1=ll1.get(0);
        for(int i=1;i<ll1.size();i++){
            if(ll1.get(i)<min1){
                min1=ll1.get(i);
            }
        }
        System.out.println("Minimum value is: " + min1);
        //find max using for loop
        int max1=ll1.get(0);
        for(int i=1;i<ll1.size();i++){
            if(ll1.get(i)>max1){
                max1=ll1.get(i);
            }
        }
        System.out.println("Maximum value is: " + max1);
        //Vector
        Vector<Integer> v1=new Vector<>();
        // add elements to the list
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(5);
        v1.add(15);
        System.out.println("Vector: " + v1);
        //find min using for loop
        int min2=v1.get(0);
        for(int i=1;i<v1.size();i++){
            if(v1.get(i)<min2){
                min2=v1.get(i);
            }
        }
        System.out.println("Minimum value is: " + min2);
        //find max using for loop
        int max2=v1.get(0);
        for(int i=1;i<v1.size();i++){
            if(v1.get(i)>max2){
                max2=v1.get(i);
            }
        }
        System.out.println("Maximum value is: " + max2);
        //Stack
        Stack<Integer> s1=new Stack<>();
        // add elements to the list
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(5);
        s1.push(15);
        System.out.println("Stack: " + s1);
        //find min using for loop
        int min3=s1.get(0);
        for(int i=1;i<s1.size();i++){
            if(s1.get(i)<min3){
                min3=s1.get(i);
            }
        }
        System.out.println("Minimum value is: " + min3);
        //find max using for loop
        int max3=s1.get(0);
        for(int i=1;i<s1.size();i++){
            if(s1.get(i)>max3){
                max3=s1.get(i);
            }
        }
        System.out.println("Maximum value is: " + max3);
        // using Collections class to find min and max
        System.out.println("Minimum value(ArrayList) is: " + Collections.min(al1));
        System.out.println("Maximum value(ArrayList) is: " + Collections.max(al1));
        System.out.println("Minimum value(LinkedList) is: " + Collections.min(ll1));
        System.out.println("Maximum value(LinkedList) is: " + Collections.max(ll1));
        System.out.println("Minimum value(Vector) is: " + Collections.min(v1));
        System.out.println("Maximum value(Vector) is: " + Collections.max(v1));
    }
}
