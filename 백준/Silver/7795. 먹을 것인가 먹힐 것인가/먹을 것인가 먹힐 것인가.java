import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int count = 0;

            int[] numbers = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                numbers[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(numbers);
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int number = Integer.parseInt(st.nextToken());
                for (int value : numbers) {
                    if (value > number) {
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
