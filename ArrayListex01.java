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



    }
}
