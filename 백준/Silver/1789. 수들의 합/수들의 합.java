import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        int N = 0;
        long sum = 0;
        for(int i = 1; ; i++){
            if (sum > S) break;
            sum += i;
            N++;
        }
        System.out.print(N-1);
    }
}