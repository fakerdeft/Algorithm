import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] count = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            } else {
                count[c - 'A']++;
            }
        }
        
        int max = -1;
        char answer = '?';
        
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                answer = (char) (i + 65);
            } else if (count[i] == max) {
                answer = '?';
            }
        }
        
        System.out.print(answer);
    }
}