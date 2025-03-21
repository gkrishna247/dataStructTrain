import java.util.Scanner;

class Node
{
    int roll;
    Node next;
}

class ListDelete
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

    public static void delete(Node head, int val)
    {
        Node temp = head;
        while(temp.next != null)
        {
            if(temp.next.roll == val)
            {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }

    public static void deleteAtPos(Node head, int pos)
    {
        Node temp = head;
        int i = 0;
        while(temp.next != null)
        {
            i++;
            if(i == pos)
            {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
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
        
        System.out.print("Enter the value to delete: ");
        int del = sc.nextInt();
        delete(head,del);
        display(head);
        System.out.println();
        System.out.print("Enter the position to delete: ");
        int delPos = sc.nextInt();
        deleteAtPos(head,delPos);
        display(head);

        sc.close();
    }
} 