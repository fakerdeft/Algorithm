import java.util.*;
import java.io.*;

class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 1; i <= T; i ++){
            int max = 0;
            long sum = 0;
        	long N = Long.parseLong(br.readLine());
            int[] arr = new int[(int) N];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < N; j++){
            	arr[j] = Integer.parseInt(st.nextToken());
                if(j == N-1){
                    max = arr[j];
                }
            }
            for(int j = (int) N-1; j >= 0; j--){
                if(max >= arr[j]){
                    sum += max - arr[j];
                } else {
                	max = arr[j];
                }
            }
            System.out.println("#" + i + " " + sum);
        }
	}
}