

// LeetCode 155 – Min Stack
import java.util.Stack;
public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek())
            minStack.push(val);
    }
    public void pop() {
        if (stack.pop().equals(minStack.peek()))
            minStack.pop();
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return minStack.peek();
    }
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(5);
        obj.push(2);
        obj.push(8);
        System.out.println("Min: " + obj.getMin());
        obj.pop();
        System.out.println("Top: " + obj.top());
    }
}