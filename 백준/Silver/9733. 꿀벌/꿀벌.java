import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] workTypes = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"};
        Map<String, Integer> workingMap = new HashMap<>();

        String line;
        int totalCount = 0;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] works = line.split(" ");

            for (String work : works) {
                workingMap.put(work, workingMap.getOrDefault(work, 0) + 1);
                totalCount++;
            }
        }

        for (String work : workTypes) {
            int count = workingMap.getOrDefault(work, 0);
            double percent = (double) count / totalCount;
            sb.append(work).append(" ")
                    .append(count).append(" ")
                    .append(String.format("%.2f", percent)).append("\n");
        }
        sb.append("Total ").append(totalCount).append(" 1.00");
        System.out.println(sb);
    }
}