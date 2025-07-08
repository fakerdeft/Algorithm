import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();  // 원하는 제품:수량
        Map<String, Integer> windowMap = new HashMap<>(); // 현재 윈도우의 제품:수량
        
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        for (int i = 0; i < 10; i++) {
            windowMap.put(discount[i], windowMap.getOrDefault(discount[i], 0) + 1);
        }
        
        if (wantMap.equals(windowMap)) {
            answer++;
        }
        
        for (int i = 10; i < discount.length; i++) {
            String removeItem = discount[i - 10];
            int removeCount = windowMap.get(removeItem) - 1;
            
            if (removeCount == 0) {
                windowMap.remove(removeItem);
            } else {
                windowMap.put(removeItem, removeCount);
            }
            
            String addItem = discount[i];
            windowMap.put(addItem, windowMap.getOrDefault(addItem, 0) + 1);
            
            if (wantMap.equals(windowMap)) {
                answer++;
            }
        }
        
        return answer;
    }
}