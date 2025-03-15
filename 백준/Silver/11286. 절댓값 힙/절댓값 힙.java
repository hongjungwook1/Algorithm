import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = scan.nextInt();
        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int absO1 = Math.abs(o1);
            int absO2 = Math.abs(o2);
            if (absO1 == absO2) return o1 - o2;
            else return absO1 - absO2;
        });

        for (int i = 0; i < N; i++) {
            int number = scan.nextInt();

            if (number == 0) {
                if (queue.isEmpty()) {
                    sb.append("0").append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else {
                queue.add(number);
            }
        }
        System.out.println(sb);
    }
}