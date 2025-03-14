import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numbers = br.readLine();

        StringTokenizer st0 = new StringTokenizer(numbers, "0");
        StringTokenizer st1 = new StringTokenizer(numbers, "1");
        int result = Math.min(st0.countTokens(), st1.countTokens());

        System.out.println(result);
    }
}
