import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> tipList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            tipList.add(Integer.parseInt(br.readLine()));
        }

        long result = 0;

        tipList.sort(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            int tip = tipList.get(i) - i;
            if (tip > 0) {
                result += tip;
            }
        }
        System.out.println(result);
    }
}