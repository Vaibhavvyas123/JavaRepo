import java.util.Stack;

public class StackOperation {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack();
        myStack.push("vaibhav");
        myStack.push("Ivy");
        myStack.push("Comptech");
        System.out.println("My Stack "+ myStack);
        myStack.pop();
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack.capacity());
        System.out.println(myStack.clone());
    }
}
