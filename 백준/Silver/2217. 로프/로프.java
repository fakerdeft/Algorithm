import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        int count = 1;
        for(int i = N-1; i >= 0; i--){
            if(max <= arr[i] * count){
                max = arr[i] * count;
            }
            count++;
        }
        System.out.print(max);
    }
}