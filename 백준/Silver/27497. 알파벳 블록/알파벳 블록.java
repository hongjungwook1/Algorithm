import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<String> deque = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());

            if (number == 1) {
                deque.addLast(st.nextToken());
                stack.add(number);
            } else if (number == 2) {
                deque.addFirst(st.nextToken());
                stack.add(number);
            } else if (number == 3) {
                if (!deque.isEmpty()) {
                    int num = stack.pop();
                    if (num == 1) {
                        deque.pollLast();
                    } else if (num == 2) {
                        deque.pollFirst();
                    }
                }
            }
        }
        int count = deque.size();
        if (count == 0) {
            System.out.println(0);
        } else {
            for (int i = 0; i < count; i++) {
                sb.append(deque.poll());
            }
            System.out.println(sb);
        }
    }
}
