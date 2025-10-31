import java.util.*;

class Solution {
    public int solution(int[] topping) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for(int t : topping){
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        int answer = 0;
        for(int i = 0; i < topping.length - 1; i++){
            int current = topping[i];
            
            set.add(current);
            map.put(current, map.get(current) - 1);
            
            if(map.get(current) == 0){
                map.remove(current);
            }
            
            if(map.size() == set.size()){
                answer++;
            }
        }
        
        return answer;
    }
}