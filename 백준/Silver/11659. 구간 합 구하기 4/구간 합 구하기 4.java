import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] prefixSum = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + scan.nextInt();
        }

        for (int i = 0; i < M; i++) {
            int first = scan.nextInt();
            int end = scan.nextInt();
            sb.append(prefixSum[end] - prefixSum[first - 1]).append("\n");
        }
        System.out.println(sb);
    }
}
