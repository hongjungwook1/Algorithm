import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            double score = Double.parseDouble(br.readLine());
            maxHeap.offer(score);

            if (maxHeap.size() > 7) {
                maxHeap.poll();
            }
        }

        List<Double> result = new ArrayList<>(maxHeap);
        Collections.sort(result);

        for (double score : result) {
            sb.append(String.format("%.3f", score)).append("\n");
        }

        System.out.print(sb);
    }
}