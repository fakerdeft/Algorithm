import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int count = 0;
        int[] answer = new int[(n+1)/2];
        
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                answer[count] = i;
                count++;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}