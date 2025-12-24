import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        String[] numbers = br.readLine().split(" ");
        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numberList.add(Integer.parseInt(numbers[i]));
        }

        Collections.sort(numberList);

        int count = 0;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = numberList.get(left) + numberList.get(right);

            if (sum == m) {
                left++;
                count++;
                right--;
            } else if (sum < m) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(count);
    }
}