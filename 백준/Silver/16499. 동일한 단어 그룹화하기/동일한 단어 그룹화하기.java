import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> wordSet = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String word = br.readLine();

            char[] wordCharArray = word.toCharArray();
            Arrays.sort(wordCharArray);

            wordSet.add(String.valueOf(wordCharArray));
        }
        System.out.println(wordSet.size());
    }
}