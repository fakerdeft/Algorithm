import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = (n == 4 || n == 7) ? -1 : (n % 5 == 0) ? n / 5 : (n % 5 == 1 || n % 5 == 3) ? (n / 5) + 1 : (n % 5 == 2 || n % 5 == 4) ? (n / 5) + 2 : -1;
        System.out.print(result);
    }
}