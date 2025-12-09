import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int t = sc.nextInt();
            BigInteger sum = new BigInteger("0");

            for (int j = 0; j < t; j++) {
                BigInteger a = sc.nextBigInteger();
                sum = sum.add(a);
            }
            if (sum.compareTo(BigInteger.ZERO) == 0) {
                list.add("0");
            }
            if (sum.compareTo(BigInteger.ZERO) > 0) {
                list.add("+");
            } else if (sum.compareTo(BigInteger.ZERO) < 0) {
                list.add("-");
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}