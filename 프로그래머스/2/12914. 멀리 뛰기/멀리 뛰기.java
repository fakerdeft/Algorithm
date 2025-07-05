class Solution {
    public long solution(int n) {
           final int MOD = 1234567;
        
        // n이 1이나 2인 경우 바로 반환
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        // DP 배열 생성
        long[] dp = new long[n + 1];
        dp[1] = 1;  // 1칸을 가는 방법: 1가지
        dp[2] = 2;  // 2칸을 가는 방법: 2가지
        
        // 점화식: dp[i] = dp[i-1] + dp[i-2]
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % MOD;
        }
        
        return dp[n];
    }
}