import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = scan.nextInt();
        Map<Integer, Integer> mapN = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int number = scan.nextInt();
            mapN.put(number, mapN.getOrDefault(number, 0) + 1);
        }

        int M = scan.nextInt();

        for (int i = 0; i < M; i++) {
            int number = scan.nextInt();
            sb.append(mapN.getOrDefault(number, 0)).append(" ");
        }
        System.out.println(sb);
    }
}