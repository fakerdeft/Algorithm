class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a = 0;
        
        answer = hp/5;
        a = hp - 5*answer;
        if(a == 0){
            return answer;
        }
        
        answer += a/3;
        a = a - 3*(a/3);
        if(a == 0){
            return answer;
        }
        
        answer += a/1;
        
        return answer;
    }
}