import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = scan.nextInt();
        int C = scan.nextInt();
        Map<Integer, Integer> numbers = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            int number = scan.nextInt();
            numbers.put(number, numbers.getOrDefault(number, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> sortNumbers = new ArrayList<>(numbers.entrySet());
        sortNumbers.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        for (Map.Entry<Integer, Integer> sortNumber : sortNumbers) {
            int key = sortNumber.getKey();
            int value = sortNumber.getValue();
            for (int i = 0; i < value; i++) {
                sb.append(key).append(" ");
            }
        }
        System.out.println(sb);
    }
}
