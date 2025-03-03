import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Map<String, Double> treeMap = new TreeMap<>();
        int count = 0;
        String tree;

        while ((tree = br.readLine()) != null) {
            treeMap.put(tree, treeMap.getOrDefault(tree, 0.0) + 1.0);
            count++;
        }

        for (Map.Entry<String, Double> entry : treeMap.entrySet()) {
            String treeKey = entry.getKey();
            Double treeValue = (entry.getValue() / count) * 100;
            sb.append(String.format("%s %.4f\n", treeKey, treeValue));
        }
        System.out.println(sb);
    }
}