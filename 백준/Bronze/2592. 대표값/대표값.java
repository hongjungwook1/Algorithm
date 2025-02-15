import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        int mode = -1;

        for (int i = 0; i < 10; i++) {
            int num = scan.nextInt();
            sum += num;

            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            if (freqMap.get(num) > maxFreq) {
                maxFreq = freqMap.get(num);
                mode = num;
            }
        }
        System.out.println(sum / 10);
        System.out.println(mode);
    }
}
