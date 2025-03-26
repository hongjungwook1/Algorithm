import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        List<Integer> discardedCards = new ArrayList<>();

        while (queue.size() > 1) {
            discardedCards.add(queue.poll());
            queue.add(queue.poll());
        }

        for (int i = 0; i < discardedCards.size(); i++) {
            System.out.print(discardedCards.get(i) + " ");
        }

        System.out.println(queue.peek());
    }
}
