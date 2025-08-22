import java.util.*;

class Solution {
    private Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        // 종이 조각, 방문 배열 생성
        char[] arr = numbers.toCharArray();
        boolean[] visited = new boolean[arr.length];
        
        // 종이 조각 조합하기
        for(int i = 1; i <= arr.length; i++){
            permutation(arr, visited, "", i);
        }
        
        return set.size();
    }
    
    // 순열 메서드
    private void permutation(char[] arr, boolean[] visited, String current, int t){
        if(current.length() == t){
            int num = Integer.parseInt(current);
            
            if (isPrime(num)) {
                set.add(num);
            }
            
            return;
        }
        
        // 각 자리에 올 수 있는 숫자 선택
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                permutation(arr, visited, current + arr[i], t);
                visited[i] = false;
            }
        }
    }
    
    // 소수 판별 메서드
    private boolean isPrime(int n) {
        if (n < 2) return false;  // 0, 1은 소수가 아님
        if (n == 2) return true;  // 2는 소수
        if (n % 2 == 0) return false;  // 짝수는 소수가 아님
        
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
}