import java.io.*;
import java.util.*;

class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i ++){
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
        	while(st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                if(num % 2 != 0){
                	sum += num;
                }
            }
            System.out.println("#" + i + " " + sum);
        }
	}
}