import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Map<String, String> wordMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] words = br.readLine().split("=");
            String keyWord = words[0].trim();
            String valueWord = words[1].trim();
            wordMap.put(keyWord, valueWord);
        }

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int length = Integer.parseInt(br.readLine());
            String[] testWords = br.readLine().split(" ");
            for (int j = 0; j < length; j++) {
                if (wordMap.containsKey(testWords[j])) {
                    sb.append(wordMap.get(testWords[j])).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}