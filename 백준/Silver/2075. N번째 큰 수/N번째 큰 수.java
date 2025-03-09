import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int count = N * N;

        for (int i = 0; i < count; i++) {
            int number = scan.nextInt();
            queue.add(number);
        }

        for (int i = 0; i < N - 1; i++) {
            queue.poll();
        }
        System.out.println(queue.poll());
    }
}