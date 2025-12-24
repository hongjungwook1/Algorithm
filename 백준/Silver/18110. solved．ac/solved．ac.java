import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        double avg = n * 0.15;
        int resultAvg = (int) Math.round(avg);
        int realAvg = n - (resultAvg * 2);

        if (n == 0) {
            System.out.println(0);
            return;
        }

        List<Integer> levelList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            levelList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(levelList);

        long sum = 0;
        for (int i = resultAvg; i < n - resultAvg; i++) {
            sum += levelList.get(i);
        }

        System.out.println(Math.round((double) sum / realAvg));
    }
}