import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> files = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String file = br.readLine();
            String[] splitFile = file.split("\\.");
            files.put(splitFile[1], files.getOrDefault(splitFile[1], 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : files.entrySet()) {
            String fileKey = entry.getKey();
            Integer fileValue = entry.getValue();
            sb.append(fileKey).append(" ").append(fileValue).append("\n");
        }
        System.out.println(sb);
    }
}