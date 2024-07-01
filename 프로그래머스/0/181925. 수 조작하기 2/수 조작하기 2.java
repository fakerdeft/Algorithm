class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 1; i < numLog.length; i++){
            answer += numLog[i] - numLog[i-1] == 1 ? "w" : numLog[i] - numLog[i-1] == -1 ? "s" : numLog[i] - numLog[i-1] == 10 ? "d" : numLog[i] - numLog[i-1] == -10 ? "a" : "";
        }
        
        return answer;
    }
}