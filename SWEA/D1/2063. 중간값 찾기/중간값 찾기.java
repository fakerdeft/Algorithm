import java.util.*;
import java.io.*;

class Solution{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++){
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.print(arr[N/2]);
	}
}