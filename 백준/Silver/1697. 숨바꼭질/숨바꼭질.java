import java.util.*;
import java.io.*;

class Main {
    static int n, m, min = 0;
    static int[] visited = new int[100001];
    static Queue<Integer> q = new LinkedList<>();
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        bfs(n);
    }
    
    static void bfs(int n){
        q.add(n);
        visited[n] = 1;
        while (!q.isEmpty()) {
            int now = q.poll();
            if (now == m) {
				min = visited[now]-1;
                break;
			}
			if (now-1 >= 0 && visited[now-1] == 0) {
				visited[now-1] = visited[now]+1;
				q.add(now-1);
			}
			if (now+1 <= 100000 && visited[now+1] == 0) {
				visited[now+1] = visited[now] + 1;
				q.add(now+1);
			}
			if (2*now <= 100000 && visited[2*now] == 0) {
				visited[2*now] = visited[now] + 1;
				q.add(2*now);
			}
        }
        System.out.print(min);
    }
}