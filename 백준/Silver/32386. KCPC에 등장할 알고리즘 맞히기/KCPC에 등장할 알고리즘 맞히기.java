import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = scan.nextInt();
        Map<String, Integer> algorithmMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int problemNumber = scan.nextInt();
            int tagCount = scan.nextInt();

            for (int j = 0; j < tagCount; j++) {
                String algorithm = scan.next();
                algorithmMap.put(algorithm, algorithmMap.getOrDefault(algorithm, 0) + 1);
            }
        }

        int max = algorithmMap.values().stream().mapToInt(x -> x).max().orElse(0);
        int count = 0;

        for (Map.Entry<String, Integer> entry : algorithmMap.entrySet()) {
            if (entry.getValue().equals(max)) {
                sb.append(entry.getKey());
                count++;
            }
        }

        if (count < 2) {
            System.out.println(sb);
        } else {
            System.out.println(-1);
        }
    }
}