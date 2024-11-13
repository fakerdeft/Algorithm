import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = {300, 60, 10};
        String result = "";
        if(T % 10 != 0){
            System.out.print(-1);
        } else {
            for(int i = 0; i < arr.length; i++){
                result += (T / arr[i]) + " ";
                T %= arr[i];
            }
            System.out.print(result);
        }
    }
}