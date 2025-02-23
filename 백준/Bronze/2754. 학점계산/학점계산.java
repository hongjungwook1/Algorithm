import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Double> dataMap = new HashMap<>();

        dataMap.put("A+", 4.3);
        dataMap.put("A0", 4.0);
        dataMap.put("A-", 3.7);
        dataMap.put("B+", 3.3);
        dataMap.put("B0", 3.0);
        dataMap.put("B-", 2.7);
        dataMap.put("C+", 2.3);
        dataMap.put("C0", 2.0);
        dataMap.put("C-", 1.7);
        dataMap.put("D+", 1.3);
        dataMap.put("D0", 1.0);
        dataMap.put("D-", 0.7);
        dataMap.put("F", 0.0);

        String score = scan.next();

        for (Map.Entry<String, Double> data : dataMap.entrySet()) {
            if (data.getKey().equals(score)) {
                System.out.println(data.getValue());
            }
        }
    }
}