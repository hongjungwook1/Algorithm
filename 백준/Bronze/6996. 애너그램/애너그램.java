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
            String[] words = br.readLine().split(" ");

            String firstWord = words[0];
            String secondWord = words[1];

            char[] fWord = firstWord.toCharArray();
            char[] sWord = secondWord.toCharArray();
            Arrays.sort(fWord);
            Arrays.sort(sWord);

            boolean isValid = true;
            for (int j = 0; j < fWord.length; j++) {
                if (fWord.length != sWord.length) {
                    isValid = false;
                    continue;
                }
                if (fWord[j] != sWord[j]) {
                    isValid = false;
                }
            }

            if (isValid) {
                sb.append(firstWord).append(" & ").append(secondWord).append(" are anagrams.").append("\n");
            } else {
                sb.append(firstWord).append(" & ").append(secondWord).append(" are NOT anagrams.").append("\n");
            }
        }
        System.out.println(sb);
    }
}