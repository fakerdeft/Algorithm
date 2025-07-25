import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> s = new HashSet<>();
        
        for(int num : nums){
            s.add(num);
        }
        
        return Math.min(s.size(), nums.length / 2);
    }
}