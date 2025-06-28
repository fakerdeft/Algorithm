import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 각 크기별 귤의 개수를 저장하는 Map
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // 각 크기별 귤의 개수 계산
        for (int size : tangerine) {
            countMap.put(size, countMap.getOrDefault(size, 0) + 1);
        }
        
        // 개수를 기준으로 내림차순 정렬하기 위해 리스트로 변환
        List<Integer> counts = new ArrayList<>(countMap.values());
        counts.sort((a, b) -> b - a);  // 내림차순 정렬
        
        int selectedCount = 0;  // 선택한 귤의 개수
        int typeCount = 0;      // 사용한 종류의 수
        
        // 개수가 많은 종류부터 선택
        for (int count : counts) {
            selectedCount += count;
            typeCount++;
            
            // k개를 모두 선택했다면 종료
            if (selectedCount >= k) {
                break;
            }
        }
        
        return typeCount;
    }
}