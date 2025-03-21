import java.util.Scanner;

class Node
{
    int roll;
    Node next;
}

class ListSearchPos
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

    public static int search(Node head, int val)
    {
        Node temp = head.next;
        int pos = 0;
        while(temp != null)
        {
            pos++;
            if(temp.roll == val)
            {
                return pos;
            }
            temp = temp.next;
        }
        return -1;
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
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        int pos = search(head,k);
        if(pos == -1)
        {
            System.out.println("k not found");
        }
        else
        {
            System.out.println("k found at position: " + pos);
        }
        

        sc.close();
    }
} 