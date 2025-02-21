import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        int resultA = 0;
        int resultB = 0;
        String lastWinner = "";

        for (int i = 0; i < 10; i++) {
            listA.add(scan.nextInt());
        }
        for (int i = 0; i < 10; i++) {
            listB.add(scan.nextInt());
        }
        
        for (int i = 0; i < 10; i++) {
            if (listA.get(i) > listB.get(i)) {
                resultA += 3;
                lastWinner = "A";
            } else if (listA.get(i) < listB.get(i)) {
                resultB += 3;
                lastWinner = "B";
            } else {
                resultA++;
                resultB++;
            }
        }

        System.out.println(resultA + " " + resultB);
        if (resultA > resultB) {
            System.out.println("A");
        } else if (resultA < resultB) {
            System.out.println("B");
        } else if (resultA == resultB && lastWinner.equals("A")) {
            System.out.println("A");
        } else if (resultA == resultB && lastWinner.equals("B")) {
            System.out.println("B");
        } else {
            System.out.println("D");
        }
    }
}