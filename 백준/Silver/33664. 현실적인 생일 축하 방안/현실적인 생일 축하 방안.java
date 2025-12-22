import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] bnm = br.readLine().split(" ");
        long b = Long.parseLong(bnm[0]);
        int n = Integer.parseInt(bnm[1]);
        int m = Integer.parseInt(bnm[2]);

        Map<String, Long> gameMap = new HashMap<>();
        Set<String> birthDayGameMap = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String[] gameInfo = br.readLine().split(" ");
            String name = gameInfo[0];
            long price = Long.parseLong(gameInfo[1]);
            gameMap.put(name, price);
        }

        for (int i = 0; i < m; i++) {
            String getName = br.readLine();
            birthDayGameMap.add(getName);
        }

        long price = gameMap.entrySet().stream()
                .filter(x -> birthDayGameMap.contains(x.getKey()))
                .mapToLong(Map.Entry::getValue).sum();

        if (b >= price) {
            sb.append("acceptable");
        } else {
            sb.append("unacceptable");
        }
        System.out.println(sb);
    }
}