import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        if (beforeArr.length != afterArr.length) return 0;
        
        if (Arrays.equals(beforeArr , afterArr)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}