import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append(":fan::fan::fan:").append("\n").append(":fan::").append(br.readLine()).append("::fan:").append("\n").append(":fan::fan::fan:");
        System.out.print(sb);
    }
}