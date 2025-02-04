class Solution {
    public String[] solution(String[] names) {
        int length = (names.length + 4) / 5 ;
        String[] answer = new String[length];
        
        int idx = 0;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = names[idx];
            idx += 5;
        }
        return answer;
    }
}