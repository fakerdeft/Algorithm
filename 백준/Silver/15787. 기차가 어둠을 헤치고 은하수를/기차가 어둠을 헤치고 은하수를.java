import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] trains = new int[N + 1];
        for(int j = 0; j < M; j++){
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            int i = Integer.parseInt(st.nextToken());
            int x = order <= 2 ? Integer.parseInt(st.nextToken()) : 0;
            switch (order) {
                case 1: 
                    trains[i] |= (1 << x);
                    break;
                case 2: 
                    trains[i] &= ~(1 << x);
                    break;
                case 3:
                    trains[i] <<= 1;
                    trains[i] &= ((1 << 21) - 1);
                    break;
                case 4:
                    trains[i] >>= 1;
                    trains[i] &= ~1;
                    break;
            }
        }
        int result = (int) Arrays.stream(trains, 1, N + 1)
                .distinct()
                .count();
        System.out.print(result);
    }
}