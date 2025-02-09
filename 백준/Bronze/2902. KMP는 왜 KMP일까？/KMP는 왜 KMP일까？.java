import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arrT = scan.next().split("-");

        String result = "";
        for (int i = 0; i < arrT.length; i++) {
            String word = arrT[i];
            result += word.charAt(0);
        }
        System.out.println(result);
    }
}
