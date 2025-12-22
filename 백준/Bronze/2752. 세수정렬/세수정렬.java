import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = br.readLine().split(" ");
        int numberA = Integer.parseInt(numbers[0]);
        int numberB = Integer.parseInt(numbers[1]);
        int numberC = Integer.parseInt(numbers[2]);

        int temp = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numberA > numberB) {
                temp = numberA;
                numberA = numberB;
                numberB = temp;
            } else if (numberB > numberC) {
                temp = numberB;
                numberB = numberC;
                numberC = temp;
            }
        }

        System.out.println(numberA + " " + numberB + " " + numberC);

    }
}