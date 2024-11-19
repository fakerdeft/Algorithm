import java.util.*;
import java.io.*;
import java.awt.Point;

class Main {
    static int n, aptNum = 0;
    static int[][] arr;
    static boolean[][] visited;
    static int[] aptCount;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        aptCount = new int[n*n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for(int j = 0; j < n; j++){
                arr[i][j] = line.charAt(j) - '0';
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 1 && !visited[i][j]){
                    aptNum++;
                    bfs(i, j);
                }
            }
        }
        Arrays.sort(aptCount);
        System.out.println(aptNum);
        for(int i = 0; i < aptCount.length; i++){
            if(aptCount[i] != 0){
                System.out.println(aptCount[i]);
            }
        }
    }
    
    static void bfs(int x, int y){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visited[x][y] = true;
        aptCount[aptNum]++;
        while (!q.isEmpty()) {
            Point now = q.poll();
            for(int i = 0; i < 4; i++) {
                int nextX = now.x + dx[i];
                int nextY = now.y + dy[i];
                if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) {
                    continue;
                }
                if(!visited[nextX][nextY] && arr[nextX][nextY] == 1) {
					q.offer(new Point(nextX, nextY));
					visited[nextX][nextY] = true;
                    aptCount[aptNum]++;
				}
			}
        }
    }
}