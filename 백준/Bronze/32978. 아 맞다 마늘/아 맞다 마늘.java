import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> required = new HashSet<>();
        String[] requiredArr = br.readLine().split(" ");

        for (String s : requiredArr) {
            required.add(s);
        }

        String[] usedArr = br.readLine().split(" ");
        for (String s : usedArr) {
            required.remove(s);
        }

        required.forEach(System.out::println);
    }
}