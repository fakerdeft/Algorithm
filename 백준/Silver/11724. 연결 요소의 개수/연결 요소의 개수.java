import java.util.*;
import java.io.*;

class Main {
    static int n, m, count = 0;
    static int[][] map;
    static boolean[] visited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n+1][n+1];
        visited = new boolean[n+1];
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = map[b][a] = 1;
        }
        for(int i = 1; i <= n; i++){
            if(visited[i] == false){
                dfs(i);
                count++;
            }
        }
        System.out.print(count);
    }
    
    static void dfs(int start){
        if(visited[start] == true){
            return;
        } else {
            visited[start] = true;
            for(int i = 1; i <= n; i++) {
                if(map[start][i] == 1) {
                    dfs(i);
                }
            }
        }
    }
}