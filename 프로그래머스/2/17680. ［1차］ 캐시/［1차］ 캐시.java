import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        LinkedHashMap<String, Boolean> cache = new LinkedHashMap<>(cacheSize, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > cacheSize;
            }
        };
        
        int totalTime = 0;
        
        for (String city : cities) {
            String cityLower = city.toLowerCase();
            
            if (cache.containsKey(cityLower)) {
                totalTime += 1;
                cache.get(cityLower);
            } else {
                totalTime += 5;
                cache.put(cityLower, true);
            }
        }
        
        return totalTime;
    }
}