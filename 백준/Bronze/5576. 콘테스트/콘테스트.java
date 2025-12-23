import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> wList = new ArrayList<>();
        List<Integer> kList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int score = Integer.parseInt(br.readLine());
            wList.add(score);
        }

        for (int i = 0; i < 10; i++) {
            int score = Integer.parseInt(br.readLine());
            kList.add(score);
        }

        wList.sort(Collections.reverseOrder());
        kList.sort(Collections.reverseOrder());

        int wScore = 0;
        int kScore = 0;

        for (int i = 0; i < 3; i++) {
            wScore += wList.get(i);
            kScore += kList.get(i);
        }
        System.out.println(wScore + " " + kScore);
    }
}