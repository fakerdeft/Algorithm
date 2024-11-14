import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(N-->0) pq.add(Integer.parseInt(br.readLine()));
        int sum = 0;
        while(pq.size() > 1) {
            int tmp = pq.poll() + pq.poll();
            sum += tmp;
            pq.offer(tmp);
        }
        System.out.print(sum);
    }
}