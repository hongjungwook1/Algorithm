import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        while (true) {
            int number = scan.nextInt();
            if (number == 0) {
                break;
            }
            if (number % N == 0) {
                System.out.println(number + " is a multiple of " + N + ".");
            } else {
                System.out.println(number + " is NOT a multiple of " + N + ".");
            }
        }
    }
}