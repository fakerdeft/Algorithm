import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            int count = 1;
            int[] arr = new int[n+1];
            for(int j = 0; j < n; j++){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[a] = b;
            }
            int k = arr[1];
            for(int j = 2; j <= n; j++){
                if(arr[j] < k){
                    k = arr[j];
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}