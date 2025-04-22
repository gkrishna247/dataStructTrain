import java.util.ArrayList;

public class ArrayListex01 {
    public static void main(String[] args) {
        ArrayList<Integer> iarr=new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            iarr.add(i+1);
        }
        System.out.println("The elements of the ArrayList are:");
        for(int i=0;i<iarr.size();i++){
            System.out.print(iarr.get(i)+" ");
        }
        System.out.println();
        System.out.println("Size of the ArrayList: " + iarr.size());
        iarr.remove(0);
        System.out.println("After removing the first element:");
        for(int i=0;i<iarr.size();i++){
            System.out.print(iarr.get(i)+" ");
        }
        System.out.println();
        System.out.println("Size of the ArrayList: " + iarr.size());
        // insert at index
        iarr.add(5,55);
        System.out.println("After inserting 55 at index 5:");
        for(int i=0;i<iarr.size();i++){
            System.out.print(iarr.get(i)+" ");
        }
        System.out.println();
        System.out.println("Size of the ArrayList: " + iarr.size());
        // updateing value
        iarr.set(5,56);
        System.out.println("Array after updating the element at index 5:");
        for(int i=0;i<iarr.size();i++){
            System.out.print(iarr.get(i)+" ");
        }
        System.out.println();

    }
}
