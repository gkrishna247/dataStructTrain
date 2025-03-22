import java.util.Scanner;

class LNode {
    int data;
    LNode next;
}

public class ListOperations {

    public static void insert(LNode head,int pos,int val){
        LNode temp=head;
        LNode obj=new LNode();
        obj.data=val;
        int c=0;
        while(temp.next!=null && pos-1!=c){
            temp=temp.next;
            c++;
        }
        if(c==pos-1){
            obj.next=temp.next;
            temp.next=obj;
        }else{
            System.out.println("Position exists the length of the list");
        }
    }

    public static void display(LNode head){
        LNode temp=head;
        System.out.print("List is: ");
        while(temp.next!=null){
            temp=temp.next;
            System.out.print(temp.data+" ");
        }
        System.out.println();
        }

    public static int sumOfElements(LNode head) {
        LNode temp=head;
        int s=0;
        while(temp.next!=null){
            temp=temp.next;
            s+=temp.data;
        }
        return s;

    }

    public static int sumOfOdd(LNode head){
        LNode temp=head;
        int so=0;
        while(temp.next!=null){
            temp=temp.next;
            if(temp.data%2!=0){
                so+=temp.data;
            }
        }
        return so;

    }

    public static int sumOfEven(LNode head){
        LNode temp=head;
        int se=0;
        while (temp.next!=null){
            temp=temp.next;
            if(temp.data%2 ==0){
                se+=temp.data;
            }
        }
        return se;
    }

    public static int noOfOdd(LNode head){
        LNode temp=head;
        int c=0;
        while(temp.next!=null){
            temp=temp.next;
            if (temp.data%2 !=0){
                c++;
            }
        }
        return c;
    }

    public static int noOfEven(LNode head){
        LNode temp=head;
        int c=0;
        while(temp.next!=null){
            temp=temp.next;
            if(temp.data%2 ==0){
                c++;
            }
        }
        return c;
    }

    public static void printAlternate(LNode head){
        LNode temp=head;
        int c=0;
        while(temp.next!=null){
            temp=temp.next;
            if (c%2==0){
                System.out.print(temp.data+" ");
            }
            c++;
        }
        System.out.println();

    }

    public static int min(LNode head){
        LNode temp=head;
        int mi=-1;
        if(temp.next!=null){
            temp=temp.next;
            mi=temp.data;
            while(temp.next!=null){
                temp=temp.next;
                if(mi>temp.data){
                    mi=temp.data;
                }
            }
        }
        return mi;
    }

    public static int max(LNode head){
        LNode temp=head;
        int ma=-1;
        if(temp.next!=null){
            temp=temp.next;
            ma=temp.data;
            while (temp.next!=null){
                temp=temp.next;
                if(ma<temp.data){
                    ma=temp.data;
                }
            }
        }
        return ma;
    }

    public static void findnth(LNode head,int pos){
        LNode temp=head.next;
        int n=0;
        while(temp!=null && n!=pos-1){
            temp=temp.next;
            n++;
        }
        if(n==pos){
            System.out.println("The nth element in the list is: "+temp.data);
        }else{
            System.out.println("The given postion is not bound");
        }
    }
    

    public static void main(String[] args) {
        LNode head = new LNode();
        head.next = null;
        Scanner sc = new Scanner(System.in);
        int noe = sc.nextInt();
        for (int i = 0; i < noe; i++) {
            insert(head,i+1,sc.nextInt());
        }
        display(head);
        System.out.println("Sum of list is: "+sumOfElements(head));
        System.out.println("Sum of odd elements in list: "+sumOfOdd(head));
        System.out.println("Sum of even elements in list: "+sumOfEven(head));
        System.out.println("Number of odd elements: "+noOfOdd(head));
        System.out.println("Number of even elements: "+noOfEven(head));
        System.out.println("The altenate elements are: ");
        printAlternate(head);
        System.out.println("The min element in list is: "+min(head));
        System.out.println("The max element in list is: "+max(head));
        System.out.print("Enter valur of n to print nth element: ");
        int n=sc.nextInt();
        findnth(head,n);
        sc.close();
    }
    
}
