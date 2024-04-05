class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        if((a % 2 == 1) && (b % 2 == 1)){
            return answer = a * a + b * b;
        }
        if((a % 2 == 1) || (b % 2 == 1)){
            return answer = 2 * (a + b);
        }
        if((a % 2 != 1) && (b % 2 != 1)){
            if((a - b) < 0){
                return answer = b - a;
            }
            answer = a - b;
        }

        return answer;
    }
}