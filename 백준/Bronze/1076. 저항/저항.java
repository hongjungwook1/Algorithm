import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> values = new HashMap<>();
        values.put("black", 0);
        values.put("brown", 1);
        values.put("red", 2);
        values.put("orange", 3);
        values.put("yellow", 4);
        values.put("green", 5);
        values.put("blue", 6);
        values.put("violet", 7);
        values.put("grey", 8);
        values.put("white", 9);

        Map<String, Long> multi = new HashMap<>();
        multi.put("black", 1L);
        multi.put("brown", 10L);
        multi.put("red", 100L);
        multi.put("orange", 1000L);
        multi.put("yellow", 10000L);
        multi.put("green", 100000L);
        multi.put("blue", 1000000L);
        multi.put("violet", 10000000L);
        multi.put("grey", 100000000L);
        multi.put("white", 1000000000L);

        String c1 = sc.next();
        String c2 = sc.next();
        String c3 = sc.next();

        int num = values.get(c1) * 10 + values.get(c2);
        long result = num * multi.get(c3);

        System.out.println(result);
    }
}
