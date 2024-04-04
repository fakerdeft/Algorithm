class Solution {
    public int[] solution(int n, int k) {
                int j = n/k;
        int[] answer = new int[j];
        
        for(int i =1; i<=j; i++){
            answer[i-1] = k*i;
        }
        return answer;
    }
}