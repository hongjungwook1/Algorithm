import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String[] nNumbers = br.readLine().split(" ");
        String[] mNumbers = br.readLine().split(" ");

        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numberList.add(Integer.parseInt(nNumbers[i]));
        }

        for (int i = 0; i < m; i++) {
            numberList.add(Integer.parseInt(mNumbers[i]));
        }

        Collections.sort(numberList);

        for (Integer num : numberList) {
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}