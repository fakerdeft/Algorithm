import java.util.*;
import java.io.*;
 
class Solution {
    static int N, cnt;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            cnt = 0;
            while (true){
            	if (x >= y){
                	y += x;
                } else {
                	x += y;
                }
                cnt++;
                if (x > N || y > N) {
                	break;
                }
            }
            System.out.println(cnt);
        }
    }
}