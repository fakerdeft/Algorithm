import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        
        String[] sets = s.split("\\},\\{");
        
        Arrays.sort(sets, (a, b) -> a.length() - b.length());
        
        List<Integer> result = new ArrayList<>();
        Set<Integer> used = new HashSet<>();
        
        for (String set : sets) {
            String[] numbers = set.split(",");
            
            for (String numStr : numbers) {
                int num = Integer.parseInt(numStr);
                
                if (!used.contains(num)) {
                    result.add(num);
                    used.add(num);
                }
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}