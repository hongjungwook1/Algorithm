import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String N = scan.next();
        int length = N.length() / 2;

        String[] firstN = N.substring(0, length).split("");
        String[] lastN = N.substring(length).split("");

        int firstSumN = 0;
        int lastSumN = 0;

        for (int i = 0; i < firstN.length; i++) {
            firstSumN += Integer.parseInt(firstN[i]);
        }

        for (int i = 0; i < firstN.length; i++) {
            lastSumN += Integer.parseInt(lastN[i]);
        }

        if (firstSumN == lastSumN) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }

    }
}
