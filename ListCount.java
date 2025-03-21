import java.util.Scanner;

class Node
{
    int roll;
    Node next;
}

class ListCount
{
    public static void insert(Node head, Scanner sc)
    {
        Node ob=new Node();
        Node temp = head;
        System.out.print("Enter the roll number: ");
        ob.roll = sc.nextInt();
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = ob;
        ob.next = null;
    }

    public static void display(Node head)
    {
        Node temp = head.next;
        while(temp != null)
        {
            System.out.print(temp.roll + " ");
            temp = temp.next;
        }
        
    }

    public static void lengthOf(Node head)
    {
        Node temp = head.next;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        System.out.println("Number of elements in the list: " + count);
    }

    public static void main(String[] args)
    {
        Node head = new Node();
        head.next = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            insert(head,sc);
        }
        display(head);
        System.out.println();
        lengthOf(head);
        display(head);        
        sc.close();
    }
} 