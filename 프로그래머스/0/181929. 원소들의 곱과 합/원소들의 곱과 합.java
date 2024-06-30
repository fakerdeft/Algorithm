class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int k = 0;
        
        for(int i = 0; i < num_list.length; i++){
            answer *= num_list[i];
            k += num_list[i];
        }
        
        k = k * k;
        
        return answer < k ? 1 : 0;
    }
}