import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        LinkedList<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            q.add(i);
        }
        int[] idx = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            idx[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 0;
        for(int i = 0; i < m; i++){
            int targetIdx = q.indexOf(idx[i]);
			int halfIdx;
            if(q.size() % 2 == 0) {
				halfIdx = q.size() / 2 - 1;
			} else {
				halfIdx = q.size() / 2;
			}
            if(targetIdx <= halfIdx) {
				for(int j = 0; j < targetIdx; j++) {
					int temp = q.removeFirst();
					q.addLast(temp);
					answer++;
				}
			} else {
				for(int j = 0; j < q.size() - targetIdx; j++) {
					int temp = q.removeLast();
					q.addFirst(temp);
					answer++;
				}
			
			}
			q.removeFirst();
        }
        System.out.print(answer);
    }
}