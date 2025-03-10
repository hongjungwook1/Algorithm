import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        Map<String, Integer> wordsMap = new LinkedHashMap<>();

        for (int i = 0; i < N; i++) {
            String words = br.readLine();
            if (words.length() >= M) {
                wordsMap.put(words, wordsMap.getOrDefault(words, 0) + 1);
            }
        }

        List<String> sortWordsMap = new ArrayList(wordsMap.keySet());
        sortWordsMap.sort((w1, w2) -> {
            if (!wordsMap.get(w1).equals(wordsMap.get(w2))) {
                return wordsMap.get(w2) - wordsMap.get(w1);
            }
            if (w1.length() != w2.length()) {
                return w2.length() - w1.length();
            }
            return w1.compareTo(w2);
        });

        for (String word : sortWordsMap) {
            sb.append(word).append("\n");
        }
        System.out.println(sb);

    }
}