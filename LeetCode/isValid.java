import java.util.Arrays;
import java.util.Stack;

public class isValid {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(', '{', '[' :
                    stack.push(c);
                    break;
                case ')': {
                    if(!stack.isEmpty() && stack.peek() == '(')
                        stack.pop();
                    break;
                }
                case '}': {
                    if(!stack.isEmpty() && stack.peek() == '{')
                        stack.pop();
                    break;
                }
                case ']': {
                    if(!stack.isEmpty() && stack.peek() == '[')
                        stack.pop();
                    break;
                }
            }
        }
        return stack.isEmpty();
    }
}
