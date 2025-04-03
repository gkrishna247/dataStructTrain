import java.util.Scanner;

class Node
{
    int roll;
    Node next;
}

class SimpleList2
{
    public static void insert(Node head,Scanner sc)
    {
        Node ob=new Node();
        ob.roll = sc.nextInt();
        ob.next = head.next;
        head.next = ob;
    }

    public static void display(Node head)
    {
        Node temp = head.next;
        while(temp != null)
        {
            System.out.println(temp.roll);
            temp = temp.next;
        }
    }
    public static void main(String[] args)
    {
        Node head = new Node();
        Scanner sc = new Scanner(System.in);
        head.next = null;
        insert(head, sc);
        insert(head, sc);
        insert(head, sc);
        display(head);
        sc.close();

    }
} 