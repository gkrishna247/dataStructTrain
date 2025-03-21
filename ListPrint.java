import java.util.Scanner;

class Node
{
    int roll;
    Node next;
}

class ListPrint
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
        Node temp = head;
        while(temp.next != null)
        {
            System.out.print(temp.roll + " ");
            temp = temp.next;
        }
        
    }

    public static void printAlternate(Node head)
    {
        Node temp = head.next;
        int i = 0;
        while(temp.next != null)
        {
            if(i%2 == 0)
            {
                System.out.print(temp.roll + " ");
            }
            i++;
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
        printAlternate(head);

        sc.close();
    }
} 