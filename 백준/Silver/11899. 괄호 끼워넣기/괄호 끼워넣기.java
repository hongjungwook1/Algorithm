import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int result = isBalanced(line);
        System.out.println(result);
    }

    public static int isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') count++;
            }
        }
        return count + stack.size();
    }
}
