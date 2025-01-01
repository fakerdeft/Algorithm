import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String answer = "";
        while(a != 360){
            a++;
            if(b >= 360){
                b -= 360;
            }
            b += 12;
        }
        if(a == b){
            System.out.print("O");
        } else {
            System.out.print("X");
        }
    }
}