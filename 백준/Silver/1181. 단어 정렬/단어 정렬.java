import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = scan.nextInt();
        Map<String, Integer> wordsMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            wordsMap.put(scan.next(), i);
        }
        List<String> sortMaps = new ArrayList<>(wordsMap.keySet());
        sortMaps.sort((o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            }
            return o1.compareTo(o2);
        });

        for (String word : sortMaps) {
            sb.append(word).append("\n");
        }
        System.out.println(sb);
    }
}