import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> words = new LinkedHashMap<>();
        int totalCount = 0;

        while (true) {
            String word = br.readLine();
            
            if (word.equals("0")) break;
            words.put(word, words.getOrDefault(word, 0) + 1);
            totalCount++;
        }

        for (String key : words.keySet()) {
            System.out.println(key + ": " + words.get(key));
        }
        System.out.println("Grand Total: " + totalCount);
    }
}