import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            System.out.println("#" + i + " " + Math.round(sum / 10.0));
        }
	}
}