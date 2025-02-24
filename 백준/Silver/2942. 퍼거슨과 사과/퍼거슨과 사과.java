import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int R = scan.nextInt();
        int G = scan.nextInt();

        for (int i = 1; i <= R; i++) {
            if (R % i == 0 && G % i == 0) {
                System.out.println(i + " " + R / i + " " + G / i);
            }
        }
    }
}