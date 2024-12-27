import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        LinkedHashSet<String> studentSet = new LinkedHashSet<>();
        for(int i = 0; i < L; i++){
            String student = br.readLine();
            if(studentSet.contains(student)){
                studentSet.remove(student);
            }
            studentSet.add(student);
        }
        int count = 0;
        for(String student : studentSet){
            if(count == K){
                break;
            }
            count++;
            System.out.println(student);
        }
    }
}