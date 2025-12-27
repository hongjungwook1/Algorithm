import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int cnt = 0;
        Map<String, Integer> objectPriceMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] objectInfo = br.readLine().split(" ");
            String object = objectInfo[0];
            int price = Integer.parseInt(objectInfo[1]);
            objectPriceMap.put(object, price);
        }

        for (int i = 0; i < m; i++) {
            String[] objectInfo = br.readLine().split(" ");
            String object = objectInfo[0];
            int price = Integer.parseInt(objectInfo[1]);

            if (objectPriceMap.containsKey(object)) {
                long originalPrice = objectPriceMap.get(object);
                if (price * 100 > originalPrice * 105) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}