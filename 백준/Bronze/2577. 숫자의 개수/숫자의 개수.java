import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long A = scan.nextInt();
        long B = scan.nextInt();
        long C = scan.nextInt();

        long multiABC = A * B * C;
        String[] arrABC = Long.toString(multiABC).split("");
        String[] result = new String[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.toString(i);
        }

        for (int i = 0; i < result.length; i++) {
            int count = 0;
            for (int j = 0; j < arrABC.length; j++) {
                if (result[i].equals(arrABC[j])) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}