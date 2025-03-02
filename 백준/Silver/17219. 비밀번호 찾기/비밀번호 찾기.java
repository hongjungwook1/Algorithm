import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = scan.nextInt();
        int M = scan.nextInt();

        Map<String, String> passwordMaps = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String url = scan.next();
            String password = scan.next();
            passwordMaps.put(url, password);
        }
        
        for (int i = 0; i < M; i++) {
            String url = scan.next();
            sb.append(passwordMaps.getOrDefault(url, "")).append("\n");
        }
        System.out.println(sb);
    }
}