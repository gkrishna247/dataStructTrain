import java.util.Scanner;

class SNode{
    int val;
    SNode next;
}

class StackSimple{

    public static void push(SNode head,Scanner sc){
        SNode obj = new SNode();
        System.out.print("Enter element to push: ");
        obj.val=sc.nextInt();
        obj.next=head.next;
        head.next=obj;
    }

    public static void display(SNode head){
        SNode temp=head.next;
        System.out.print("Stack is: ");
        while (temp!=null){
            System.out.print(temp.val+", ");
            temp=temp.next;
        }
    }

    public static void peek(SNode head){
        if(head.next==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element is: "+head.next.val);
        }
    }

    public static void pop(SNode head){
        if(head.next==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Popped element is: "+head.next.val);
            head.next=head.next.next;
        }
    }

    public static void isFull(SNode head){
        s
    }

    public static void isEmpty(SNode head){
        if(head.next==null){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
    }

    public static void size(SNode head){
        int count=0;
        SNode temp=head.next;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("Size of stack is: "+count);
    }

    public static void main(String[] args) {

        SNode head = new SNode();
        head.next=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element in stack: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            push(head,sc);
        }
        peek(head);
        display(head);

    }
}