import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        long N = scan.nextLong();

        for (int i = 0; i < N; i++) {
            Map<Long, Integer> warNumber = new HashMap<>();
            long T = scan.nextLong();
            long valid = T / 2;

            for (int j = 0; j < T; j++) {
                long number = scan.nextLong();
                warNumber.put(number, warNumber.getOrDefault(number, 0) + 1);
            }
            int max = warNumber.values().stream().mapToInt(x -> x).max().orElse(0);

            if (max > valid) {
                for (Long key : warNumber.keySet()) {
                    if (warNumber.get(key) == max) {
                        sb.append(key).append("\n");
                        break;
                    }
                }
            } else {
                sb.append("SYJKGW").append("\n");
            }
        }
        System.out.println(sb);
    }
}