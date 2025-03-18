import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        StringBuilder sb = new StringBuilder();
        String[] sentences = input.split("(?<=[.?])");

        for (String sentence : sentences) {
            sentence = sentence.trim();
            if (sentence.endsWith("?")) {
                sentence = sentence.replaceFirst("^What", "Forty-two").replace("?", ".");
                sb.append(sentence).append("\n");
            }
        }
        System.out.print(sb);
    }
}
