import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = scan.nextInt();
        Queue<Long> queue = new PriorityQueue<>();

        for (int i = 0; i < T; i++) {
            int N = scan.nextInt();
            queue.clear();
            for (int j = 0; j < N; j++) {
                Long number = scan.nextLong();
                queue.add(number);
            }

            long result = 0;
            while (queue.size() > 1) {
                long first = queue.poll();
                long second = queue.poll();
                long sum = first + second;
                result += sum;
                queue.add(sum);
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}