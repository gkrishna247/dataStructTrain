import java.util.*;
public class AddInCollection
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the element: ");
            list.add(sc.nextInt());
        }
        System.out.println("The elements in the list are: " + list);
        System.out.println("The number of elements in the list are: " + list.size());
        // Adding an element at a specific index
        System.out.print("Enter the index to add an element: ");    
        int index = sc.nextInt();
        System.out.print("Enter the element to add: ");
        int element = sc.nextInt();
        list.add(index, element);
        System.out.println("The elements in the list after adding an element at index " + index + " are: " + list);
        

        sc.close();
    }
}