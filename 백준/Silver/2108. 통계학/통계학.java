import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        List<Integer> numberList = new ArrayList<>();
        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(br.readLine());
            numberList.add(number);
            numberMap.put(number, numberMap.getOrDefault(number, 0) + 1);
        }

        Collections.sort(numberList);
        long sum = numberList.stream().mapToLong(i -> i).sum();

        double sumAvg = (double) sum / n;
        int middle = numberList.get(n / 2);

        int maxFreq = Collections.max(numberMap.values());

        List<Integer> freqList = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : numberMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                freqList.add(entry.getKey());
            }
        }

        Collections.sort(freqList);

        int resultFreq = 0;

        if (freqList.size() > 1) {
            resultFreq = freqList.get(1);
        } else {
            resultFreq = freqList.get(0);
        }

        int resultAvg = numberList.get(numberList.size() - 1) - numberList.get(0);

        sb.append(Math.round(sumAvg)).append("\n");
        sb.append(middle).append("\n");
        sb.append(resultFreq).append("\n");
        sb.append(resultAvg);
        
        System.out.println(sb);
    }
}