import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> numbersList = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            numbersList.add(number);
        }
        numbersList.sort(Integer::compareTo);
        System.out.println(numbersList.get(K - 1));
    }
}
