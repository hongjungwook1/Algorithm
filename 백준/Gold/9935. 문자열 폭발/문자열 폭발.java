import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        String bomb = br.readLine();
        int bombLen = bomb.length();

        for (char c : s.toCharArray()) {
            sb.append(c);

            if (sb.length() >= bombLen && sb.substring(sb.length() - bombLen).equals(bomb)) {
                sb.delete(sb.length() - bombLen, sb.length());
            }
        }

        if (sb.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb);
        }
    }
}
