import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] np = br.readLine().split(" ");
        String[] wlg = br.readLine().split(" ");

        int n = Integer.parseInt(np[0]);
        int p = Integer.parseInt(np[1]);

        int W = Integer.parseInt(wlg[0]);
        int L = Integer.parseInt(wlg[1]);
        int G = Integer.parseInt(wlg[2]);
        int score = 0;
        boolean isValid = false;

        Map<String, String> playerMap = new HashMap<>();
        List<String> playerList = new ArrayList<>();

        for (int i = 0; i < p; i++) {
            String[] playerInfo = br.readLine().split(" ");
            String player = playerInfo[0];
            String info = playerInfo[1];

            playerMap.put(player, info);
        }

        for (int i = 0; i < n; i++) {
            String player = br.readLine();
            if (playerMap.keySet().contains(player)) {
                playerList.add(playerMap.get(player));
            } else {
                playerList.add("L");
            }
        }
        
        for (String play : playerList) {

            if (score < 0) {
                score = 0;
            }
            if (play.equals("W")) {
                score += W;
            } else {
                score -= L;
            }

            if (score >= G) {
                isValid = true;
                break;
            }
        }

        System.out.println(isValid ? "I AM NOT IRONMAN!!" : "I AM IRONMAN!!");
    }
}