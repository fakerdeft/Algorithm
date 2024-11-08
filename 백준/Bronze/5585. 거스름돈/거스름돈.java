import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int change = 1000 - Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        arr[0] += change / 500;
        change -= (arr[0] * 500);
        arr[1] += change / 100;
        change -= (arr[1] * 100);
        arr[2] += change / 50;
        change -= (arr[2] * 50);
        arr[3] += change / 10;
        change -= (arr[3] * 10);
        arr[4] += change / 5;
        change -= (arr[4] * 5);
        arr[5] += change / 1;
        System.out.print(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]);
    }
}