import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strLong = "long ";
        StringBuilder result = new StringBuilder();
        int num = sc.nextInt();

        int number = num / 4;

        for (int i = 0; i < number; i++) {
            result.append(strLong);
        }
        result.append("int");
        System.out.println(result);
    }
}
