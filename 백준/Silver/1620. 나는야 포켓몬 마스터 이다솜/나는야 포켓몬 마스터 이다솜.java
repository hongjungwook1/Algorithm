import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = scan.nextInt();
        int M = scan.nextInt();

        Map<Integer, String> numberPokemonMap = new HashMap<>();
        Map<String, Integer> StringPokemonMap = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String names = scan.next();
            numberPokemonMap.put(i, names);
            StringPokemonMap.put(names, i);
        }

        for (int i = 0; i < M; i++) {
            String result = scan.next();

            if (Character.isDigit(result.charAt(0))) {
                sb.append(numberPokemonMap.get(Integer.parseInt(result))).append("\n");
            } else {
                sb.append(StringPokemonMap.get(result)).append("\n");
            }
        }
        System.out.println(sb);
    }
}