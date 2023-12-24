import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int middle = 0;
        
        Arrays.sort(array);
        middle = (array.length - 1)/2;
        answer = array[middle];
        return answer;
    }
}