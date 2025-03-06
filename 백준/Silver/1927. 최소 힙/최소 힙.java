import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int number = scan.nextInt();
            if (number == 0) {
                if (queue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.offer(number);
            }
        }
    }
}
