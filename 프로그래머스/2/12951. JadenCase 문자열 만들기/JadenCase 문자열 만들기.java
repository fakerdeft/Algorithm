import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        s = s.toLowerCase();
        
        boolean isFirstChar = true;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                answer.append(c);
                isFirstChar = true;
            } else if (isFirstChar) {
                answer.append(Character.toUpperCase(c));
                isFirstChar = false;
            } else {
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}