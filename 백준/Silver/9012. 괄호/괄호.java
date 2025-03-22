import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            String VPS = br.readLine();
            boolean isValid = false;

            for (int j = 0; j < VPS.length(); j++) {
                char vpsChar = VPS.charAt(j);

                if (vpsChar == '(') {
                    stack.push(vpsChar);
                } else {
                    if (stack.isEmpty()) {
                        isValid = true;
                        break;
                    }
                    stack.pop();
                }
            }
            if (!stack.isEmpty()) {
                isValid = true;
            }
            sb.append(!isValid ? "YES" : "NO").append("\n");
        }
        System.out.println(sb);
    }
}
