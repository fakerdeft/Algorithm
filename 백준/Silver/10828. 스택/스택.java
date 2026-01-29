import java.util.*;
import java.io.*;

public class Main {
    static List<Integer> list = new ArrayList<>();
    
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            
            if(s.equals("push")){
                push(Integer.parseInt(st.nextToken()));
            }
            
            if(s.equals("pop")){
                sb.append(pop()).append("\n");
            }
            
            if(s.equals("size")){
                sb.append(size()).append("\n");
            }
            
            if(s.equals("empty")){
                sb.append(empty()).append("\n");
            }
            
            if(s.equals("top")){
                sb.append(top()).append("\n");
            }
        }
        
        System.out.print(sb);
    }
    
    static void push(int n){
        list.add(n);
    }
    
    static int pop(){
        if(list.size() != 0){
            int t = list.get(size() - 1);
            list.remove(size() - 1);
            
            return t;
        }
        return -1;
    }
    
    static int size(){
        return list.size();
    }
    
    static int empty(){
        if(size() == 0){
            return 1;
        } else {
            return 0;
        }
    }
    
    static int top(){
        if(size() != 0){
            return list.get(size() - 1);
        }
        return -1;
    }
}