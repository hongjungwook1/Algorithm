import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<String> cheeseSet = new HashSet<>(Arrays.asList(br.readLine().split(" ")));

        int count = 0;
        for (String cheese : cheeseSet) {
            if (cheese.endsWith("Cheese")) {
                count++;
            }
        }
        System.out.println(count > 3 ? "yummy" : "sad");
    }
}