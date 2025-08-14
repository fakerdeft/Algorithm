import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int removeCount = 0;

        for (char digit : number.toCharArray()) {
            while (!stack.isEmpty() && stack.peek() < digit && removeCount < k) {
                stack.pop();
                removeCount++;
            }
            stack.push(digit);
        }

        while (removeCount < k) {
            stack.pop();
            removeCount++;
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}