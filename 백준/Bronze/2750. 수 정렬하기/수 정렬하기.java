import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String args[]) throws Exception {
        // reader.readLine()
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        for(int i : arr){
            System.out.println(i);
        }
    }
}