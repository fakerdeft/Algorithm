import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[4];
        for(int i = 0; i < T; i++){
            int change = Integer.parseInt(br.readLine());
            arr[0] = change / 25;
            change -= 25 * arr[0];
            arr[1] = change / 10;
            change -= 10 * arr[1];
            arr[2] = change / 5;
            change -= 5 * arr[2];
            arr[3] = change / 1;
            change -= 1 * arr[3];
            System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
        }
    }
}