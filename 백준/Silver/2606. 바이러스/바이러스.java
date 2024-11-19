import java.util.*;
import java.io.*;

class Main {
    static int n, m, min = 0;
    static int[][] arr;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        visited = new boolean[n+1];
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }
        bfs(1);
        System.out.print(min);
    }
    
    static void bfs(int x){
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        visited[x] = true;
        while (!q.isEmpty()) {
            int now = q.poll();
            for(int i = 1; i <= n; i++) {
				if(arr[now][i] == 1 && visited[i] == false) {
					q.offer(i);
					visited[i] = true;
					min++;
				}
			}
        }
    }
}