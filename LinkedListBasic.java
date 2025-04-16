import java.util.Scanner;

class Node{
    int val;
    Node next;
}

public class LinkedListBasic {
    public static void display(Node head){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
            System.out.print(temp.val+" ");
        }
        System.out.println();
    }
    public static void insertAtEnd(Node head,Scanner sc){
        Node temp=head;
        Node obj=new Node();
        obj.val=sc.nextInt();
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=obj;
        obj.next=null;
    }
    public static void insertAtPos(Node head,int pos,int n){
        Node temp=head;
        int k=0;
        while(temp.next!=null && k!=pos-1 && pos>0){
            temp=temp.next;
            k++;
        }
        if(k == pos-1){
            Node obj=new Node();
            obj.val=n;
            obj.next=temp.next;
            temp.next=obj;
            System.out.print("The list after insertion is: ");
            display(head);
        }else{
            System.out.println("Invalid Position: "+pos);
        }
    }
    public static void deleteUserInput(Node head,Scanner sc){
        Node temp=head;
        System.out.print("Enter the value to delete from list: ");
        int n=sc.nextInt();
        while(temp.next!=null){
            if(temp.next.val==n){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
    }
    public static void deleteAtPos(Node head,int pos){
        Node temp=head;
        int k=0;
        while(temp.next!=null && k!=pos-1){
            temp=temp.next;
            k++;
        }
        if(temp.next!=null && k==pos-1){
            temp.next=temp.next.next;
        }else{
            System.out.println("Invalid Position: "+pos);
        }
    }
    public static void reverse(Node head) {
        if (head.next==null || head.next.next==null) {
            System.out.println("List is already reversed or empty.");
            return;
        }
        Node prev=null;
        Node current=head.next;
        Node next=null;
        while (current!=null) {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head.next=prev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=new Node();
        head.next=null;
        System.out.print("Enter number of elements to be inserted in list:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            insertAtEnd(head, sc);
        }
        System.out.print("The intial list: ");
        display(head);
        reverse(head);
        System.out.print("The reversed list is: ");
        display(head);
        for(int i=0;i<3;i++){
            System.out.print("Enter position to insert: ");
            int p=sc.nextInt();
            System.out.print("Enter value to Insert: ");
            int v=sc.nextInt();
            insertAtPos(head, p, v);
        }
        for(int i=0;i<3;i++){
            deleteUserInput(head, sc);
            System.out.print("The array after deletion: ");
            display(head);
        }
        for(int i=0;i<3;i++){
            System.out.print("Enter position to delete: ");
            int p=sc.nextInt();
            deleteAtPos(head, p);
            System.out.print("The array after deletion: ");
            display(head);
        }
        sc.close();
    }
}