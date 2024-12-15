import java.util.*;
import java.io.*;

public class Main {
    static int[] arr = new int[26];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(arr[s.charAt(i)-97] == -1){
                arr[s.charAt(i)-97] = i;
            }
        }
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.print(sb);
    }
}