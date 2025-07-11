import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int x = 0; x < s.length(); x++) {
            String rotated = s.substring(x) + s.substring(0, x);
            
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;
            
            for (char c : rotated.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else if (c == ')' || c == ']' || c == '}') {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    
                    char open = stack.pop();
                    
                    if ((open == '(' && c != ')') ||
                        (open == '[' && c != ']') ||
                        (open == '{' && c != '}')) {
                        isValid = false;
                        break;
                    }
                }
            }
            
            if (isValid && stack.isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}