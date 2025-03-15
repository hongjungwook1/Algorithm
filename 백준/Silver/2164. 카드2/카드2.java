import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (!(queue.size() == 1)) {
            queue.poll();
            int firstValue = queue.poll();
            queue.add(firstValue);
        }
        System.out.println(queue.poll());
    }
}