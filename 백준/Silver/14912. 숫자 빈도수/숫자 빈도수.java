import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String D = scan.next();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            String[] number = Integer.toString(i).split("");
            for (int j = 0; j < number.length; j++) {
                if (number[j].equals(D)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}