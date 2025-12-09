import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        list.sort(Collections.reverseOrder());

        int result = 0;
        for (int i = 0; i < N; i++) {
            result = Math.max(result, list.get(i) * (i + 1));
        }
        System.out.println(result);
    }
}