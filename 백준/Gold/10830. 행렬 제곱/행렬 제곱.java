import java.util.*;
import java.io.*;

public class Main {
    static int[][] A;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        A = new int[N][N];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				A[i][j] = Integer.parseInt(st.nextToken()) % 1000;
			}			
		}
		int[][] result = pow(A, B);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				sb.append(result[i][j]).append(' ');
			}
			sb.append('\n');
		}
		System.out.print(sb);
    }

	public static int[][] pow(int[][] A, long exponent) {
		if(exponent == 1L) {
			return A;
		}
		int[][] ret = pow(A, exponent / 2);
		ret = multiply(ret, ret);
		if(exponent % 2 == 1L) {
			ret = multiply(ret, A);
		}
		return ret;
	}

    public static int[][] multiply(int[][] o1, int[][] o2) {
		int[][] ret = new int[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					ret[i][j] += o1[i][k] * o2[k][j];
					ret[i][j] %= 1000;
				}
			}
		}
		return ret;
	}
}