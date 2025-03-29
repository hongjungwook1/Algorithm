import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        HashSet<String> cards = new HashSet<>();
        int[] count = new int[4]; // P, K, H, T의 개수

        Map<Character, Integer> indexMap = Map.of('P', 0, 'K', 1, 'H', 2, 'T', 3);
        
        for (int i = 0; i < S.length(); i += 3) {
            String card = S.substring(i, i + 3);
            if (cards.contains(card)) {
                System.out.println("GRESKA");
                return;
            }
            cards.add(card);
            count[indexMap.get(card.charAt(0))]++;
        }

        System.out.println((13 - count[0]) + " " + (13 - count[1]) + " " + (13 - count[2]) + " " + (13 - count[3]));
    }
}
