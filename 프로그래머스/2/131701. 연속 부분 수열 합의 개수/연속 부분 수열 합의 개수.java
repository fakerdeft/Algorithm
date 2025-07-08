import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> sums = new HashSet<>();
        int n = elements.length;
        
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int len = 1; len <= n; len++) {
                int idx = (start + len - 1) % n;
                sum += elements[idx];
                sums.add(sum);
            }
        }
        
        return sums.size();
    }
}