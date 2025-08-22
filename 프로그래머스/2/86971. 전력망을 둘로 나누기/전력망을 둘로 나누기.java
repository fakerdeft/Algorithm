import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = n;
        
        for (int i = 0; i < wires.length; i++) {
            // i번째 간선을 제외한 그래프 구성
            List<List<Integer>> graph = new ArrayList<>();
            for (int j = 0; j <= n; j++) {
                graph.add(new ArrayList<>());
            }
            
            for (int j = 0; j < wires.length; j++) {
                if (i == j) continue;  // i번째 간선 제외
                int a = wires[j][0];
                int b = wires[j][1];
                graph.get(a).add(b);
                graph.get(b).add(a);
            }
            
            // DFS로 첫 번째 컴포넌트 크기 구하기
            boolean[] visited = new boolean[n + 1];
            int component1 = dfs(graph, 1, visited);
            int component2 = n - component1;
            
            answer = Math.min(answer, Math.abs(component1 - component2));
        }
        
        return answer;
    }
    
    private int dfs(List<List<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        int count = 1;
        
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                count += dfs(graph, neighbor, visited);
            }
        }
        
        return count;
    }
}