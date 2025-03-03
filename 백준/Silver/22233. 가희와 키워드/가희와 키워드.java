import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] count = br.readLine().split(" ");
        int N = Integer.parseInt(count[0]);
        int M = Integer.parseInt(count[1]);

        Set<String> keywords = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String keyword = br.readLine();
            keywords.add(keyword);
        }

        for (int i = 0; i < M; i++) {
            String[] keyword = br.readLine().split(",");
            for (int j = 0; j < keyword.length; j++) {
                keywords.remove(keyword[j]);
            }
            System.out.println(keywords.size());
        }
    }
}