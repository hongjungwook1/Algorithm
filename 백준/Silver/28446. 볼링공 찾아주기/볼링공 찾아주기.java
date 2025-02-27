import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = scan.nextInt();
        Map<Integer, Integer> maps = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int number = scan.nextInt();
            if (number == 1) {
                int x = scan.nextInt();
                int w = scan.nextInt();
                maps.put(w, x);
            } else if (number == 2) {
                int findNumber = scan.nextInt();
                sb.append(maps.get(findNumber)).append("\n");
            }
        }
        System.out.println(sb);
    }
}