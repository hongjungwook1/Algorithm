import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if (N == 0 && M == 0) break;

            Set<Integer> setN = new TreeSet<>();
            int count = 0;

            for (int i = 0; i < N; i++) {
                setN.add(Integer.parseInt(br.readLine()));
            }

            for (int i = 0; i < M; i++) {
                int number = Integer.parseInt(br.readLine());
                if (setN.contains(number)) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}