import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 1; i <= T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String result;
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            if (a < b) result = " <";
            else if (a == b) result = " =";
            else result = " >";
            System.out.println("#" + i + result);
        }
	}
}