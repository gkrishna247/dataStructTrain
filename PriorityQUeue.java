import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQUeue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        System.out.println("Intial Queue1: "+pq1);
        
        for(int i=1;i<11;i++){
            pq1.add(i);
        }
        System.out.println("Priority queue1 After add: "+pq1);

        PriorityQueue<Integer> pq2=new PriorityQueue<>();
        System.out.println("Intial Queue2: "+pq2);
        
        for(int i=10;i>0;i--){
            pq2.add(i);
        }
        System.out.println("Priority queue2 After add: "+pq2);
        // peek
        System.out.println("Peek of queue1: "+pq1.peek());
        System.out.println("QUeue 1 after peek: "+pq1);
        // poll
        System.out.println("Poll of queue1: "+pq1.poll());
        System.out.println("QUeue 1 after poll: "+pq1);
        // remove
        System.out.println("Remove of queue1: "+pq1.remove(5));
        System.out.println("QUeue 1 after remove: "+pq1);
        // clear

        // Priority queue using max heap
        System.out.println("PRIORITY QUEUE USING MAX HEAP");
        PriorityQueue<Integer> pq3=new PriorityQueue<>(Comparator.reverseOrder());
        System.out.println("Intial Queue3: "+pq3);
        for(int i=1;i<11;i++){
            pq3.add(i);
        }
        System.out.println("Priority queue3 After add: "+pq3);
        // peek
        System.out.println("Peek of queue3: "+pq3.peek());
        System.out.println("QUeue 3 after peek: "+pq3);
        // poll
        System.out.println("Poll of queue3: "+pq3.poll());
        System.out.println("QUeue 3 after poll: "+pq3);
    }
}