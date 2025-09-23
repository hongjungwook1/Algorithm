import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

        while (true) {
            String line = scan.nextLine();
            if (line.equals("#")) {
                break;
            }

            int count = 0;
            for (char ch : line.toCharArray()) {
                String s = String.valueOf(ch).toLowerCase();
                if (vowels.contains(s)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
