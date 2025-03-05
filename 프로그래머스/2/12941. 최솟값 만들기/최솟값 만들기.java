import java.util.*;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;
        List<Integer> listB = new ArrayList<>();
        Arrays.sort(A);

        for (int i = 0; i < B.length; i++) {
            listB.add(B[i]);
        }
        listB.sort(Collections.reverseOrder());

        for (int i = 0; i < B.length; i++) {
            answer += A[i] * listB.get(i);
        }
        return answer;
    }
}