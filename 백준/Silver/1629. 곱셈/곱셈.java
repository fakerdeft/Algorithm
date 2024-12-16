import java.io.*;
import java.util.*;
 
public class Main {
	static long c;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		c = Long.parseLong(st.nextToken());
		System.out.print(pow(a, b));
	}

	public static long pow(long a, long ex) {
		if(ex == 1) {
			return a % c;
		}
		long temp = pow(a, ex / 2);
		if(ex % 2 == 1) {
			return (temp * temp % c) * a % c;
		}
		return temp * temp % c;
	}
	
}