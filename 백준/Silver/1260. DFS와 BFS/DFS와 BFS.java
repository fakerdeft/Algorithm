import java.util.*;
import java.io.*;

public class Main{
    static int edge_arr[][];
	static boolean visited_arr[];
	static int n, m, v, count;
	static Queue<Integer> que = new LinkedList<>();
    
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		edge_arr = new int[1001][1001];
		visited_arr = new boolean[1001];
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			edge_arr[x][y] = edge_arr[y][x] = 1;
		}
		dfs(v);
		System.out.println();
		visited_arr = new boolean[1001];
		bfs(v);
	}
    
    public static void dfs(int start) {
		visited_arr[start] = true;
		System.out.print(start + " ");
        if(count == n) {
			return;
		}
		count++;
		for(int i = 1; i <= n; i++) {
			if(edge_arr[start][i] == 1 && visited_arr[i] == false) {
				dfs(i);
			}
		}
	}
    
	public static void bfs(int start) {
		que.offer(start);	
		visited_arr[start] = true;
		System.out.print(start + " ");
		while(!que.isEmpty()) {
			start = que.poll();
			for(int i = 1; i <= n; i++) {
				if(edge_arr[start][i] == 1 && visited_arr[i] == false) {
					que.offer(i);
					visited_arr[i] = true;
					System.out.print(i + " ");
				}
			}
		}	
	}
}