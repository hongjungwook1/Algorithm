import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int C = scan.nextInt();
        int count = 1;
        while (C != 1) {
            if (C % 2 == 0) {
                C = C / 2;
                count++;
            } else {
                C = (C * 3) + 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
