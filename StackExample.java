import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push elements onto the stack
        for (int i=1;i<=10;i++) {
            stack.push(i);
        }
        
        System.out.println("Stack: " + stack);
        
        // Pop
        System.out.println("Popped element: " + stack.pop());
        
        // Check if the stack is empty
        System.out.println("Is the stack empty: " + stack.isEmpty());

        // peek
        System.out.println("Top element: " + stack.peek());

        // Search
        System.out.println("Position of 5: " + stack.search(5));
        System.out.println("Position of 11: " + stack.search(11));
    }
}
