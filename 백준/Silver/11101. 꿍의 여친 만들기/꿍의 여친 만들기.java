import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Map<String, Integer> conditionMap = new HashMap<>();

            String conditionTime = br.readLine();
            String sheWantCondition = br.readLine();

            String[] conditionTimeSplit = conditionTime.split(",");
            for (String condition : conditionTimeSplit) {
                String[] parts = condition.split(":");
                conditionMap.put(parts[0], Integer.parseInt(parts[1]));
            }

            String[] combinations = sheWantCondition.split("\\|");

            int minTime = Integer.MAX_VALUE;

            for (String combination : combinations) {
                String[] conditions = combination.split("&");

                int maxTimeInCombination = 0;

                for (String condition : conditions) {
                    maxTimeInCombination = Math.max(maxTimeInCombination, conditionMap.get(condition));
                }

                minTime = Math.min(minTime, maxTimeInCombination);
            }

            sb.append(minTime).append("\n");
        }

        System.out.print(sb);
    }
}