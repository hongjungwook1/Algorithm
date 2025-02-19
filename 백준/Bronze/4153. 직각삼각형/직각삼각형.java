import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int numberA = scan.nextInt();
            int numberB = scan.nextInt();
            int numberC = scan.nextInt();

            if (numberA == 0 && numberB == 0 && numberC == 0) {
                break;
            }
            double a = Math.pow(numberA, 2);
            double b = Math.pow(numberB, 2);
            double c = Math.pow(numberC, 2);

            if ((a + b) == c) {
                System.out.println("right");
            } else if ((a + c) == b) {
                System.out.println("right");
            } else if ((c + b) == a) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}