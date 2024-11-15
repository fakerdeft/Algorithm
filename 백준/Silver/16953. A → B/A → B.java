import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int count = 1;
        while(A != B){
            if(B % 10 == 1){
                B /= 10;
            } else if(B % 2 == 0 && B > A){
                B /= 2;
            } else {
                count = -1;
                break;
            }
            count++;
        }
        System.out.print(count);
    }
}