import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Integer, Integer> scores = new TreeMap<>(Collections.reverseOrder());
        for (int i = 1; i <= 8; i++) {
            int score = scan.nextInt();
            scores.put(score, i);
        }

        int sum = 0;
        int count = 0;
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : scores.entrySet()) {
            if (count > 4) {
                break;
            }
            count++;
            sum += entry.getKey();
            result.add(entry.getValue());
        }
        result.sort(Integer::compareTo);
        System.out.println(sum);
        result.forEach(integer -> System.out.print(integer + " "));
    }
}