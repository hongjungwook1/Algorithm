import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine().toUpperCase();
        Map<Character, Integer> wordMaps = new HashMap<>();
        int maxCount = -1;
        char result = '?';
        int count = 0;

        for (Character ch : word.toCharArray()) {
            wordMaps.put(ch, wordMaps.getOrDefault(ch, 0) + 1);
            maxCount = Math.max(maxCount, wordMaps.get(ch));
        }

        for (Map.Entry<Character, Integer> entry : wordMaps.entrySet()) {
            if (entry.getValue() == maxCount) {
                if (count == 0) {
                    result = entry.getKey();
                    count++;
                } else {
                    result = '?';
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
