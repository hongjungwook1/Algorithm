import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int N = scan.nextInt();
            if (N == 0) break;

            int prev = -1;
            List<Integer> numbers = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                int number = scan.nextInt();
                if (number != prev) {
                    numbers.add(number);
                    prev = number;
                }
            }
            for (Integer number : numbers) {
                sb.append(number).append(" ");
            }
            sb.append("$").append("\n");
        }
        System.out.println(sb);
    }
}