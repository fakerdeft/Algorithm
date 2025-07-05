class Solution {
    public long solution(int n) {
        final int MOD = 1234567;
        
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        long n1 = 1;
        long n2 = 2;
        long answer = 0;
        
        for (int i = 3; i <= n; i++) {
            answer = (n1 + n2) % MOD;
            n1 = n2;
            n2 = answer;
        }
         
        return answer;
    }
}