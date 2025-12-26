import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        int max = Collections.max(wordMap.values());

        List<String> wordList = wordMap.entrySet().stream()
                .filter(x -> x.getValue() == max)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        wordList.sort(Collections.reverseOrder());

        System.out.println(wordList.get(0) + " " + max);
    }
}