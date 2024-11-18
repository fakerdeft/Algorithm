import java.util.*;
import java.io.*;
import java.awt.Point;

class Main {
    static int n, m, min = 1;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }
        bfs(0, 0);
        System.out.print(arr[n - 1][m - 1]);
    }
    
    static void bfs(int x, int y){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        visited[x][y] = true;
        while (!q.isEmpty()) {
            Point currentPoint = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = currentPoint.x + dx[i];
                int nextY = currentPoint.y + dy[i];
                if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m) continue;
                if (arr[nextX][nextY] == 0) continue;
                if (visited[nextX][nextY]) continue;
                q.offer(new Point(nextX, nextY));
                visited[nextX][nextY] = true;
                arr[nextX][nextY] = arr[currentPoint.x][currentPoint.y] + 1;
            }
        }
    }
}