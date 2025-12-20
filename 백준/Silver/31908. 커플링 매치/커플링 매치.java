import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, List<String>> ringsToPeople = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String[] coupleRings = br.readLine().split(" ");
            String people = coupleRings[0];
            String ring = coupleRings[1];

            if (ring.equals("-")) {
                continue;
            }
            if (ringsToPeople.containsKey(ring)) {
                ringsToPeople.get(ring).add(people);
            } else {
                List<String> peopleList = new ArrayList<>();
                peopleList.add(people);
                ringsToPeople.put(ring, peopleList);
            }

        }
        int resultCount = 0;
        for (Map.Entry<String, List<String>> stringListEntry : ringsToPeople.entrySet()) {
            if (stringListEntry.getValue().size() == 2) {
                sb.append(stringListEntry.getValue().get(0)).append(" ").append(stringListEntry.getValue().get(1));
                resultCount++;
            }
            sb.append("\n");
        }
        System.out.println(resultCount);
        System.out.println(sb);
    }
}