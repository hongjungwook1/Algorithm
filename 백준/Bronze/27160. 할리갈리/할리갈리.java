import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> halliGalliMap = new HashMap<String, Integer>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String[] sArr = s.split(" ");
            String name = sArr[0];
            int number = Integer.parseInt(sArr[1]);

            halliGalliMap.put(name, halliGalliMap.getOrDefault(name, 0) + number);
        }

        boolean result = halliGalliMap.containsValue(5);

        System.out.println(result ? "YES" : "NO");
    }
}