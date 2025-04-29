import java.util.*;
public class Arrayconv
{
    public static void main(String[] args)
    {
        int n=8;
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = i+1;
        }
        System.out.print("Array: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Converting array to ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            list.add(arr[i]);
        }
        System.out.println("ArrayList: " + list);
    }
}