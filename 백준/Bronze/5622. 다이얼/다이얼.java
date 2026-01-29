import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sum = 0;
        int[] arr = new int[27];
        
        for(int i = 1; i <= 26; i++){
            int time = 3;
            
            if(i >= 4){
                time = 4;
            }
            
            if(i >= 7){
                time = 5;
            }
            
            if(i >= 10){
                time = 6;
            }
            
            if(i >= 13){
                time = 7;
            }
            
            if(i >= 16){
                time = 8;
            }
            
            if(i >= 20){
                time = 9;
            }
            
            if(i >= 23){
                time = 10;
            }
            
            arr[i] = time;
        }
        
        for(int i = 0; i < s.length(); i++){
            sum += arr[s.charAt(i) - 'A' + 1];
        }
        
        System.out.print(sum);
    }
}