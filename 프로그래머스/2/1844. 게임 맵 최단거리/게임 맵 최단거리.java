import java.util.*;

class Solution {
    static int[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    
    public int solution(int[][] maps) {
        int N = maps.length;
        int M = maps[0].length;
        
        visited = new int[N][M];
        
        Queue<Node> q = new LinkedList<>();

        q.offer(new Node(0, 0, 1));
        visited[0][0] = 1;

        while (!q.isEmpty()) {
            Node current = q.poll();
            int r = current.row;
            int c = current.col;
            int dist = current.dist;

            if (r == N - 1 && c == M - 1) {
                return dist;
            }

            for (int i = 0; i < 4; i++) {
                int nr = r + dx[i];
                int nc = c + dy[i];

                if (nr >= 0 && nr < N && nc >= 0 && nc < M && 
                    maps[nr][nc] == 1 && visited[nr][nc] == 0) {
                    
                    visited[nr][nc] = dist + 1;
                    
                    q.offer(new Node(nr, nc, dist + 1));
                }
            }
        }
        
        return -1;
    }
    
    class Node {
        private int row;
        private int col;
        private int dist;
        
        public Node(int row, int col, int dist){
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }
}