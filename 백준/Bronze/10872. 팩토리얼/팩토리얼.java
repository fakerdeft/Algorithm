import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(method(Integer.parseInt(br.readLine())));
    }
    static int method(int N){
        if(N == 0 || N == 1){
            return 1;
        }
        return N * method(N - 1);
    }
}