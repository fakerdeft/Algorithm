import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            // 스택이 비어있지 않고 스택의 맨 위 문자가 현재 문자와 같으면 제거
            if(!stack.isEmpty() && stack.peek() == current) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}