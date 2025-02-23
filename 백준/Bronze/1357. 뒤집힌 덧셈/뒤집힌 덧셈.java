import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder X = new StringBuilder(scan.next());
        StringBuilder Y = new StringBuilder(scan.next());

        int sum = Integer.parseInt(X.reverse().toString()) + Integer.parseInt(Y.reverse().toString());

        StringBuilder result = new StringBuilder(Integer.toString(sum));
        System.out.println(Integer.parseInt(result.reverse().toString()));
    }
}