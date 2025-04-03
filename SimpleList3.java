import java.util.Scanner;

class Node
{
    int roll;
    Node next;
}

class SimpleList3
{
    public static void insert(Node head, Scanner sc)
    {
        Node ob=new Node();
        System.out.print("Enter the roll number: ");
        ob.roll = sc.nextInt();
        ob.next = head.next;
        head.next = ob;
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
    public static int sum (Node head)
    {
        Node temp = head.next;
        int sum = 0;
        while(temp != null)
        {
            sum += temp.roll;
            temp = temp.next;
        }
        return sum;
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
            insert(head, sc);
        }
        display(head);
        System.out.println();
        System.out.println("Sum : " + sum(head));
        System.out.println("Average : " + sum(head)/n);

        sc.close();
    }
} 