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
            String word = br.readLine();
            String key = makeKey(word);
            wordMap.put(key, word);
        }

        int m = Integer.parseInt(br.readLine());
        String[] scrambledWords = br.readLine().split(" ");

        for (String scrambled : scrambledWords) {
            String key = makeKey(scrambled);
            sb.append(wordMap.get(key)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    private static String makeKey(String word) {
        int len = word.length();

        if (len <= 2) {
            return word;
        }

        char first = word.charAt(0);
        char last = word.charAt(len - 1);

        char[] middle = word.substring(1, len - 1).toCharArray();
        Arrays.sort(middle);

        return first + "_" + last + "_" + new String(middle);
    }
}