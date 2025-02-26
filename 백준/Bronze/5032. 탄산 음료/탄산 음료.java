import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int e = scan.nextInt();
        int f = scan.nextInt();
        int c = scan.nextInt();

        int sum = e + f;
        int count = 0;

        while (sum >= c) {
            int drink = sum / c;
            count += drink;
            sum = drink + (sum % c);
        }
        System.out.println(count);
    }
}