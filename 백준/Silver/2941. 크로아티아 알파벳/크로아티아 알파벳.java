import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int count = 0;
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            
            // 1. 'c=' 또는 'c-'
            if (c == 'c' && i < len - 1) {
                if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                    i++; // 뒤에 한 글자 더 처리했으니 인덱스 건너뛰기
                }
            }
            
            // 2. 'dz=' 또는 'd-'
            else if (c == 'd' && i < len - 1) {
                if (s.charAt(i + 1) == '-') {
                    i++;
                } else if (s.charAt(i + 1) == 'z' && i < len - 2) {
                    if (s.charAt(i + 2) == '=') {
                        i += 2; // 'z'와 '=' 두 글자를 건너뛰어야 함
                    }
                }
            }
            
            // 3. 'lj' 또는 'nj'
            else if ((c == 'l' || c == 'n') && i < len - 1) {
                if (s.charAt(i + 1) == 'j') {
                    i++;
                }
            }
            
            // 4. 's=' 또는 'z='
            else if ((c == 's' || c == 'z') && i < len - 1) {
                if (s.charAt(i + 1) == '=') {
                    i++;
                }
            }
            
            count++;
        }
        
        System.out.print(count);
    }
}