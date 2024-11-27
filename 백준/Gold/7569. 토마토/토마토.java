import java.util.*;
import java.io.*;

class Main {
    static int n, m, h, min = 0;
    static int[][][] map;
    static int[] dx = { 0, 0, -1, 1, 0, 0 };
    static int[] dy = { 1, -1, 0, 0, 0, 0 };
    static int[] dz = { 0, 0, 0, 0, -1, 1 };
    static Queue<Tomato> q = new LinkedList<>();
    static class Tomato{
        int x;
        int y;
        int z;
        int day;
        public Tomato(int x, int y, int z, int day){
            this.x = x;
            this.y = y;
            this.z = z;
            this.day = day;
        }
    }
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        map = new int[m][n][h];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    map[k][j][i] = Integer.parseInt(st.nextToken());
                    if (map[k][j][i] == 1) {
                        q.offer(new Tomato(k, j, i, 0));
                    }
                }
            }
        }
        bfs();
    }
    
    static void bfs(){
        while (!q.isEmpty()) {
            Tomato now = q.poll();
            min = now.day;
            for(int i = 0; i < 6; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                int nz = now.z + dz[i];
				if(0 <= nx && nx < m && 0 <= ny && ny < n && 0 <= nz && nz < h) {
                    if (map[nx][ny][nz] == 0) {
                        map[nx][ny][nz] = 1;
                        q.add(new Tomato(nx, ny, nz, min + 1));
                    }
                }
			}
        }
        if(checkTomato()){
            System.out.print(min);
        } else{
            System.out.print(-1);
        }
    }
    
    static boolean checkTomato() {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (map[k][j][i] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}