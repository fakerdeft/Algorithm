import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remainingWork = 100 - progresses[i];
            int daysNeeded = (int) Math.ceil((double) remainingWork / speeds[i]);
            
            if (!queue.isEmpty() && queue.peek() < daysNeeded) {
                result.add(queue.size());
                queue.clear();
            }

            queue.offer(daysNeeded);
        }
        
        result.add(queue.size());
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}