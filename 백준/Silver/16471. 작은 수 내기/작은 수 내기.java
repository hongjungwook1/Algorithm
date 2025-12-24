import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> ju = new ArrayList<>();
        List<Integer> boss = new ArrayList<>();

        String[] juCards = br.readLine().split(" ");
        String[] bossCards = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            ju.add(Integer.parseInt(juCards[i]));
            boss.add(Integer.parseInt(bossCards[i]));
        }

        Collections.sort(ju);
        Collections.sort(boss);
        
        int count = 0;
        int juIdx = 0;
        int bossIdx = 0;

        while (juIdx < n && bossIdx < n) {
            if (ju.get(juIdx) < boss.get(bossIdx)) {
                juIdx++;
                bossIdx++;
                count++;
            } else {
                bossIdx++;
            }
        }

        if (count >= (n + 1) / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}