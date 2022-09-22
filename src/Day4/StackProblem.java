package Day4;

import java.util.Scanner;
import java.util.Stack;


public class StackProblem {
    static boolean isBalanced(String str){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                    if (stack.peek() != '{') {
                        return false;
                    }
                    stack.pop();
                    break;
                case ']':
                    if (stack.peek() != '[') {
                        return false;
                    }
                    stack.pop();
                    break;
                case ')':
                    if (stack.peek() != '(') {
                        return false;
                    }
                    stack.pop();
                    break;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        System.out.println(isBalanced(scanner.nextLine()));
    }
}