import java.util.Stack;

public class BalanceParenthesis {
    static boolean isBalanced(String s) {
        Stack<Character> ss = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                ss.push(ch);
            } else {
                if (ss.isEmpty()) {
                    return false;
                }
                if (ss.peek() == '(' && ch == ')' || ss.peek() == '{' && ch == '}' || ss.peek() == '[' && ch == ']') {
                    ss.pop();
                } else {
                    return false;
                }
            }
        }
        if (ss.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "({}[()])";
        boolean result = isBalanced(str);
        System.out.println(result);
    }
}
