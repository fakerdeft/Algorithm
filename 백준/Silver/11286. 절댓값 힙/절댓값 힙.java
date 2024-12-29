import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> arr = new PriorityQueue<Integer>((o1, o2) -> {
            if (Math.abs(o1) != Math.abs(o2)) {
                return Math.abs(o1) - Math.abs(o2);
            }
            return o1 - o2;
        });
        for(int i = 0; i < N; i++){
            int x = Integer.parseInt(br.readLine());
            if(x != 0){
                arr.add(x);
            } else {
                if(arr.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(arr.poll());
                }
            }
        }
    }
}