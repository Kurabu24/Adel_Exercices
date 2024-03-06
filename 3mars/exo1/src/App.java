public class App {
    static char[] stack;
    static int top = -1;

    static void push(char c) {
        top++;
        stack[top] = c;
    }

    static char pop() {
        if (top == -1) {
            return '\0';
        }
        char c = stack[top];
        top--;
        return c;
    }

    public static boolean isValid(String s) {
        stack = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                push(c);
            }
            else {
                char last = pop();
                if ((c == ')' && last != '(') ||
                    (c == '}' && last != '{') ||
                    (c == ']' && last != '[')) {
                    return false;
                }
            }
        }
        return top == -1;
    }

    public static void main(String[] args) {
        String input = "([{}])";
        System.out.println(isValid(input)); // Expected output: true
    }
}
