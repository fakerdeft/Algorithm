import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int K = Integer.parseInt(br.readLine());
        int sum = 0;
        Stack<Integer> stack = new Stack();
        
        for(int i = 0; i < K; i++){
            int n = Integer.parseInt(br.readLine());
            
            if(n == 0 && i != 0){
                sum -= stack.pop();
            } else {
                stack.push(n);
                sum += n;
            }
        }
        
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}