import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remainingWork = 100 - progresses[i];
            int daysNeeded = (int) Math.ceil((double) remainingWork / speeds[i]);
            queue.offer(daysNeeded);
        }
        
        while (!queue.isEmpty()) {
            int firstTask = queue.poll();
            int deployCount = 1;
            
            while (!queue.isEmpty() && queue.peek() <= firstTask) {
                queue.poll();
                deployCount++;
            }
            
            result.add(deployCount);
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}