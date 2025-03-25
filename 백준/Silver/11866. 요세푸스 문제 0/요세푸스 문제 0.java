import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] NK = br.readLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);
        List<Integer> result = josephus(N, K);

        sb.append("<");
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i));
            if (i != result.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }

    public static List<Integer> josephus(int N, int K) {
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 1; i < K; i++) {
                queue.add(queue.poll());
            }
            result.add(queue.poll());
        }
        return result;
    }
}
