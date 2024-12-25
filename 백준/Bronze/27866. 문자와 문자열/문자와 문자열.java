import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());
        int index = i - 1;
        if (i < 0) {
          index = S.length() + i - 1;
        }
        System.out.print(S.charAt(index));
    }
}