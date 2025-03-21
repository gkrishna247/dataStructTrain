import java.util.Scanner;

class Node1{
    int val;
    Node1 next;
}

class List01{
    
    public static void insert(Node1 head){
        Node1 obj=new Node1();
        Node1 temp = head;
        Scanner sc=new Scanner(System.in);
        obj.val=sc.nextInt();
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=obj;
        obj.next=null;
    }
    
    public static void display(Node1 head){
        Node1 temp=head.next;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
        
    }
    
    public static void main(String[] args){
        Node1 nl1=new Node1();
        //Node1 nl2=new Node1();
        Scanner sc1 = new Scanner(System.in);
        int s1=sc1.nextInt();
        for(int i=0;i<s1;i++){
            insert(nl1);
        }
        display(nl1);
        sc1.close();
    }
}




