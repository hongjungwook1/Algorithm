import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());
            queue.add(number);
        }
        int result = 0;

        while (queue.size() > 1) {
            int first = queue.poll();
            int second = queue.poll();
            int sum = first + second;
            result += sum;
            queue.add(sum);
        }
        System.out.println(result);
    }
}