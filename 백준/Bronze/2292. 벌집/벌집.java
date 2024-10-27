import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
		int range = 2;
        if(N != 1) {
			while (range <= N) {
				range += (6 * count);
				count++;
			}
		}
        System.out.print(count);
    }
}