import java.util.Scanner;

class Node
{
    int roll;
    Node next;
}

class SimpleList2
{
    public static void insert(Node head)
    {
        Node ob=new Node();
        Scanner sc = new Scanner(System.in);
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
        head.next = null;
        insert(head);
        insert(head);
        insert(head);
        display(head);

    }
} 