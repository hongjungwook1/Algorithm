import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int number = scan.nextInt();

            if (number == 0) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                for (int j = 0; j < number; j++) {
                    int num = scan.nextInt();
                    queue.add(num);
                }
            }
        }
    }
}