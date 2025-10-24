import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Process> q = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++){
            q.add(new Process(i, priorities[i]));
        }
        
        int answer = 0;
        while(!q.isEmpty()){
            Process current = q.poll();
            boolean hasHigherPriority = false;
            
            // 현재 프로세스보다 높은 우선순위가 큐에 있는지 확인
            for(Process p : q) {
                if(p.getLevel() > current.getLevel()) {
                    hasHigherPriority = true;
                    break;
                }
            }
            
            if(hasHigherPriority) {
                // 더 높은 우선순위가 있으면 맨 뒤로
                q.add(current);
            } else {
                answer++;
                
                if(current.getName() == location) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}

class Process implements Comparable<Process> {
    
    private int name;
    private int level;
    
    public Process(int name, int level){
        this.name = name;
        this.level = level;
    }
    
    public int getName(){
        return this.name;
    }
    
    public int getLevel(){
        return this.level;
    }
    
    @Override
    public int compareTo(Process process) {
        if (this.level > process.getLevel())
            return 1;
        else if (this.level < process.getLevel())
            return -1;
        return 0;
    }
}