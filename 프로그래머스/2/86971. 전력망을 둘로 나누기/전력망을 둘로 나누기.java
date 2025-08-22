import java.util.*;

class Solution {
    int N, answer;
    int[][] map;
    int[] vst;
    
    public int solution(int n, int[][] wires) {
        N = n;
        answer = n;
        map = new int[n+1][n+1];
        vst = new int[n+1];
        
        for(int[] wire : wires){
            int a = wire[0], b = wire[1];
            map[a][b] = map[b][a] = 1;
        }
        
        dfs(1);
        
        return answer;
    }
    
    private int dfs(int node) {
        int child = 1;
        vst[node] = 1;
        
        for(int i = 1; i <= N; i++){
            if(vst[i] == 0 && map[node][i] == 1){
                child += dfs(i);
            }
        }
        
        answer = Math.min(answer, Math.abs(child - (N - child)));
            
        return child;
    }
}