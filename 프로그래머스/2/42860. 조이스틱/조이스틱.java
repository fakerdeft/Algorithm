class Solution {
    public int solution(String name) {
        int n = name.length();
        int answer = 0;
        
        // 각 문자를 바꾸는데 필요한 조작 횟수 계산
        for (int i = 0; i < n; i++) {
            if (name.charAt(i) <= 'M') {
                answer += name.charAt(i) - 'A';
            } else {
                answer += 'Z' - name.charAt(i) + 1;
            }
        }
        
        // 최소 이동 횟수 계산
        int minMove = n - 1;  // 기본값: 오른쪽으로만 이동 (0 → 1 → 2 → ... → n-1)
        
        for (int i = 0; i < n; i++) {
            // i번째 문자까지 처리한 후, 연속된 A 구간을 건너뛰는 경우
            int next = i + 1;
            
            // 연속된 A 구간의 끝 찾기
            while (next < n && name.charAt(next) == 'A') {
                next++;
            }
            
            // 3가지 이동 전략 중 최소값 선택
            // 전략 1: 오른쪽으로만 이동 (기본값)
            // 전략 2: 0→i→0→(n-1)→...→next (오른쪽 갔다가 왼쪽으로)
            // 전략 3: 0→(n-1)→...→next→0→i (왼쪽 갔다가 오른쪽으로)
            int strategy2 = i * 2 + (n - next);
            int strategy3 = (n - next) * 2 + i;
            
            minMove = Math.min(minMove, Math.min(strategy2, strategy3));
        }
        
        return answer + minMove;
    }
}