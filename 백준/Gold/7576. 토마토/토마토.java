import java.util.*;
import java.io.*;

class Main {
    static int n, m, min = 0;
    static int[][] map;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static Queue<Tomato> q = new LinkedList<>();
    static class Tomato{
        int x;
        int y;
        int day;
        public Tomato(int x, int y, int day){
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1){
                    q.offer(new Tomato(i,j,0));
                }
            }
        }
        bfs();
    }
    
    static void bfs(){
        while (!q.isEmpty()) {
            Tomato now = q.poll();
            min = now.day;
            for(int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
				if(0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if(map[nx][ny] == 0) {
                        map[nx][ny] = 1;
                        q.add(new Tomato(nx, ny, min+1));
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
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(map[i][j] == 0)
                    return false;
            }
        }
        return true;
    }
}