import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            int first = scan.nextInt();
            int end = scan.nextInt();
            int count = 0;
            for (int j = first; j <= end; j++) {
                String[] zero = Integer.toString(j).split("");
                for (int k = 0; k < zero.length; k++) {
                    if (zero[k].equals("0")) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}