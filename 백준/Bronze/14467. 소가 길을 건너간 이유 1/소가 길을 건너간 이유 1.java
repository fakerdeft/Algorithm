import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[11];
        for(int i = 0; i < 11; i++){
            arr[i] = Integer.MIN_VALUE;
        }
        int result = 0;
        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int po = Integer.parseInt(st.nextToken());
            if((arr[num] != po && arr[num] != Integer.MIN_VALUE) && (po == 0 || po == 1)){
                result++;
            }
            arr[num] = po;
        }
        System.out.print(result);
    }
}