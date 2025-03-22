import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        BigInteger N = scan.nextBigInteger();
        BigInteger M = scan.nextBigInteger();

        sb.append(N.add(M));
        System.out.println(sb);
    }
}
