import java.util.*;
import java.io.*;

class Main {
    static int n, m, min = Integer.MIN_VALUE;
    static int[][] map = new int[8][8];
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static Queue<Node> q = new LinkedList<>();
    static class Node {
        int x;
        int y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0);
        System.out.print(min);
    }
    
    static void dfs(int wallCnt) {
        if(wallCnt == 3) {
            bfs();
            return;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(map[i][j] == 0) {
                    map[i][j] = 1;
                    dfs(wallCnt+1);
                    map[i][j] = 0;
                }
            }
        }
    }
    
    static void bfs(){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(map[i][j] == 2) {
                    q.add(new Node(i,j));
                }
            }
        }
        
        int copyMap[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            copyMap[i] = map[i].clone();
        }
       
        while(!q.isEmpty()){
            Node now = q.poll();
            int x = now.x;
            int y = now.y;
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if(copyMap[nx][ny] == 0) {
                        q.add(new Node(nx,ny));
                        copyMap[nx][ny] = 2;
                    }
                }
            }
        }
        funcSafeZone(copyMap);
    }
    
    static void funcSafeZone(int[][] copyMap) {
        int safeZone =0;
        for(int i = 0; i < n ; i++) {
            for(int j = 0; j < m; j++) {
                if(copyMap[i][j] == 0) {
                    safeZone++;
                }
            }
        }
        if (min < safeZone) {
            min = safeZone;
        }
    }
}