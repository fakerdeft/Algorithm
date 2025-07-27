import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int x = 0; x < commands.length; x++){
            int i = commands[x][0];
            int j = commands[x][1];
            int k = commands[x][2];
            int s = j - i + 1;
            int[] result = new int[s];
            
            for(int y = 0; y < result.length; y++){
                result[y] = array[i + y - 1];
            }
            
            Arrays.sort(result);
            
            answer[x] = result[k - 1];
        }
        
        return answer;
    }
}