import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ", true);
        int count = 0;
        while (st.hasMoreTokens()){
            String str = st.nextToken();
            if(!str.equals(" ")){
                count++;
            }
        }
        System.out.print(count);
    }
}