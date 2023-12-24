import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int mi = 0;
        
        if(array.length == 1){
            return array[0];
        }
        
        Arrays.sort(array);
        
        int[] count = new int[array.length];
        count[0] = 1;
        
        for(int i = 1; i < count.length; i++){
            count[i] = 1;
            if(array[i] == array[i-1]){
                count[i] = count[i-1]+1;
            }
            if(max < count[i]){
                max = count[i];
                mi = i;
            }
        }
        
        Arrays.sort(count);
        
        if(count[count.length-1] == count[count.length-2]){
            return -1;
        }
        answer = array[mi];
        
        return answer;
    }
}