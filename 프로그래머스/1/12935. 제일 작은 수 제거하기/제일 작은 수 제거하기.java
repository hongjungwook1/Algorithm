import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int [arr.length -1];
        
        int minNum = Arrays.stream(arr).min().orElse(0);
        answer = Arrays.stream(arr).filter(min -> minNum != min).toArray();
        
        if (arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}