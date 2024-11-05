import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int answer = 0, sum = 0;
        for(int i = N-1; i >= 0; i--){
            if(K == arr[i]){
                answer++;
                break;
            } else if(K > arr[i]){
                while(K > sum){
                    sum += arr[i];
                    answer++;
                }
                if(K < sum){
                    sum -= arr[i];
                    answer--;
                }
                if(K == sum){
                    break;
                }
            }
        }
        System.out.print(answer);
    }
}