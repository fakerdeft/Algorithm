import java.util.*;
import java.io.*;

class Main {
    static int n;
    static int[] map;
    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static Queue<Integer> q = new LinkedList<>();
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n+1];
        adj = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        visited = new boolean[n + 1];  
        StringTokenizer st;
        for (int i = 1; i < n; i++) {  
            st = new StringTokenizer(br.readLine());  
            int a = Integer.parseInt(st.nextToken());  
            int b = Integer.parseInt(st.nextToken());  
            adj[a].add(b);
            adj[b].add(a);
        }
        bfs();
    }
    
    static void bfs(){
        q.add(1);
        visited[1] = true;
        while (!q.isEmpty()) {
            int now = q.poll();
            for (int next : adj[now]) { 
                if (visited[next]) {  
                    continue;  
                }
                visited[next] = true;  
                q.add(next); 
                map[next] = now;
            }  
        }
        for (int i = 2; i <= n; i++) {  
            System.out.println(map[i]);  
        }
    }
}