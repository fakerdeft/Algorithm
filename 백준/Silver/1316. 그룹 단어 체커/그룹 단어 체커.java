import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = N;
        
        for(int i = 0; i < N; i++){
            String s = br.readLine();
            boolean[] check = new boolean[26];
            
            for(int j = 0; j < s.length(); j++){
                char c = s.charAt(j);
                int index = c - 'a';
                
                if(j != 0 && s.charAt(j-1) != c){
                    if(check[index]){
                        answer--;
                        break;
                    }
                }
                
                check[index] = true;
            }
        }
        
        System.out.print(answer);
    }
}